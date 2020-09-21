package com.cn.exclusiveGirlfriend.controller;

import com.cn.exclusiveGirlfriend.common.MyRealm;
import com.cn.exclusiveGirlfriend.common.ResultData;
import com.cn.exclusiveGirlfriend.dataBean.LoginDataBean;
import com.cn.exclusiveGirlfriend.pojo.Login;
import com.cn.exclusiveGirlfriend.service.LoginService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.authz.UnauthorizedException;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.mgt.DefaultSecurityManager;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@Scope("singleton")
@CrossOrigin // 允许所有ip跨域
@RequestMapping("/login.all")
public class LoginController {
    @Autowired
    private MyRealm myRealm;
    @Autowired
    private LoginService loginService;
    @PostMapping("/login.do")
    public ResultData login(HttpServletRequest request, @RequestBody LoginDataBean loginDataBean){
        try {
            //1、创建安全管理器
            DefaultSecurityManager defaultSecurityManager = new DefaultSecurityManager();
            //2、设置Ream ： 数据从db中取
            defaultSecurityManager.setRealm(myRealm);
            // 加密
            HashedCredentialsMatcher matcher = new HashedCredentialsMatcher();
            //设置加密算法
            matcher.setHashAlgorithmName("md5");
            //设置盐值
            //设置加密次数
            matcher.setHashIterations(2);
            matcher.setStoredCredentialsHexEncoded(true);
            //加加密算法注入到Realm中
            myRealm.setCredentialsMatcher(matcher);
            //3、设置到全局
            SecurityUtils.setSecurityManager(defaultSecurityManager);
            //4、得到主体
            Subject subject = SecurityUtils.getSubject();
            //5、获取Token : 从前端传
            UsernamePasswordToken token = new UsernamePasswordToken(loginDataBean.getLogin().getUsername(),
                    loginDataBean.getLogin().getPassword());
            //6、登录
            subject.login(token);
//            //7、检测是否认证
            System.out.println(subject.isAuthenticated());
////            //检测是否有相应的角色
//            subject.checkRole("普通管理员");
            //对应的权限
//            subject.checkPermission("董事会");
            request.getSession().setAttribute("shiroLoginFailure",token);
            return new ResultData().ok("登录成功",token);
        } catch (UnknownAccountException e) {
            System.out.println("用户名错误");
            System.out.println(e.getMessage());
        } catch (IncorrectCredentialsException e){
            System.out.println("用户密码错误");
            System.out.println(e.getMessage());
        } catch (UnauthorizedException e){
            System.out.println("角色错误");
            System.out.println(e.getMessage());
        } catch (LockedAccountException e){
            System.out.println("账号被锁");
            System.out.println(e.getMessage());
        } catch (AuthenticationException e){
            System.out.println("认证错误");
            System.out.println(e.getMessage());
        }
        return new ResultData().error("登录失败");
    }
    /**
     * @Author HONG
     * @Description //TODO 注册账号
     * @Date 23:39 2020/9/4
     * @Param [login]
     * @return com.cn.exclusiveGirlfriend.common.ResultData
     **/
   @PostMapping("/enroll.do")
    public ResultData addLogin(@RequestBody LoginDataBean loginDataBean){
        System.out.println("===add=="+loginDataBean.getLogin());
            return loginService.insertLogin(loginDataBean.getLogin());
    }
    /**
     * @Author HONG
     * @Description //TODO  修改密码
     * @Date 9:41 2020/9/6
     * @Param [login]
     * @return com.cn.exclusiveGirlfriend.common.ResultData
     **/
    @PostMapping("/updatePassword.do")
    public ResultData updatePassword(@RequestBody Login login){
        System.out.println("===add=="+login);
        return loginService.updatePassword(login);
    }
}
