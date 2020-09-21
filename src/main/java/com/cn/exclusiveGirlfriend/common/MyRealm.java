package com.cn.exclusiveGirlfriend.common;

import com.cn.exclusiveGirlfriend.pojo.Login;
import com.cn.exclusiveGirlfriend.pojo.Role;
import com.cn.exclusiveGirlfriend.pojo.User;
import com.cn.exclusiveGirlfriend.service.RoleService;
import com.cn.exclusiveGirlfriend.service.LoginService;
import com.cn.exclusiveGirlfriend.utiles.EncryptUtil;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: cnlm
 * Date: 2020/06/02 16:49
 * Description: 自定义realm
 * Version: V1.0
 */
@Component("myRealm")
public class MyRealm extends AuthorizingRealm {

    @Autowired
    private LoginService userService;
    @Autowired
    private RoleService roleService;
    //授权
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        System.out.println("==============================");
        //1、获取用户名
        String userName = (String) principalCollection.getPrimaryPrincipal();
        //2、获取用户对象
        Login login =  userService.getPwdByUserName(userName);
        if (login!=null){
            List<Role> list = roleService.findRoleByUser(login.getLid());
            //获取用户对应的角色
            Set<String> roles = roleService.getRolesByUser(list);
            //根据角色ID得到对应的权限
            Set<String> permissions = roleService.getPermissionByRole(list);

            SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
            //将角色设置到对象中
            info.setRoles(roles);
            //将权限设置到对象中
            info.setStringPermissions(permissions);
            return info;
        }
        return null;

    }

    //用户认证
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        //获取用户的输入的账号.
        String username = (String)authenticationToken.getPrincipal();
        System.out.println(authenticationToken.getCredentials());
        //通过username从数据库中查找 User对象，如果找到，没找到.
        //实际项目中，这里可以根据实际情况做缓存，如果不做，Shiro自己也是有时间间隔机制，2分钟内不会重复执行该方法
        Login login = userService.getPwdByUserName(username);
        System.out.println("----->>login="+login);
        if(login == null){
            return null;
        }
        SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(
                login.getUsername(), //用户名
                login.getPassword(), //密码
                ByteSource.Util.bytes("fxl"),//salt=username+salt
                getName()  //realm name
        );
        login.setPassword("");
        SecurityUtils.getSubject().getSession().setAttribute("shiroFile",login);

        return authenticationInfo;
    }


}

