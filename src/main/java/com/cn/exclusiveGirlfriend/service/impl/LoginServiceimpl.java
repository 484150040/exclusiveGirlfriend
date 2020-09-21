package com.cn.exclusiveGirlfriend.service.impl;/**
 * @ClassName UserService
 * @Author ASUS
 * @Description TODO;
 * @Date 2020/8/16 13:39
 * @Hodified By:
 **/

import com.cn.exclusiveGirlfriend.common.ResultData;
import com.cn.exclusiveGirlfriend.mapper.LoginMapper;
import com.cn.exclusiveGirlfriend.pojo.Login;
import com.cn.exclusiveGirlfriend.pojo.LoginExample;
import com.cn.exclusiveGirlfriend.pojo.Role;
import com.cn.exclusiveGirlfriend.pojo.RoleExample;
import com.cn.exclusiveGirlfriend.service.LoginService;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.Optional;

/**
 * @ClassName UserService
 * @Author ASUS
 * @Description TODO;
 * @Date 2020/8/16 13:39
 * @Hodified By:
 **/
@Service
@Transactional
public class LoginServiceimpl implements LoginService {
    @Autowired(required = false)
    private LoginMapper loginMapper;
    @Override
    public Login getPwdByUserName(String userName) {
        if(userName != null && userName.trim().length()>0){
            LoginExample loginExample=new LoginExample();
            LoginExample.Criteria cri = loginExample.createCriteria();
            if (userName!=null){
                if (loginExample != null)
                cri.andUsernameEqualTo(userName);
                List<Login> login =  loginMapper.selectByExample(loginExample);
                Login login1=new Login();
                if (login!=null && login.size()>0){
                    for (Login login2 : login) {
                        login1.setUsername(login2.getUsername());
                        login1.setLid(login2.getLid());
                        login1.setPassword(login2.getPassword());
                        login1.setLogintime(login2.getLogintime());
                        login1.setCreatime(login2.getCreatime());
                    }
                }
                return login1;
            }
        }
        return null;
    }

    @Override
    public ResultData insertLogin(Login login) {
        System.out.println(login);
        LoginExample loginExample=new LoginExample();
        LoginExample.Criteria cri = loginExample.createCriteria();
        cri.andUsernameEqualTo(login.getUsername());
        List<Login> login1 =  loginMapper.selectByExample(loginExample);
        if (login1!=null && login1.size()>0){
            return new ResultData().error("账号已存在");
        }else{
            login.setCreatime(new Date());
            SimpleHash simpleHash = new SimpleHash("md5",login.getPassword(),"fxl",2);
            if (login!=null){
                login.setPassword(simpleHash.toString());
            }
            try {
               if (loginMapper.insertSelective(login)>0){
                   return new ResultData().ok("注册成功");
               }
                return new ResultData().error("注册失败请检查数据是否正确");
            }catch (Exception e){
                e.printStackTrace();
                System.err.println(e.getMessage());
                return new ResultData().error("注册失败");
            }

        }

    }

    @Override
    public ResultData updatePassword(Login login) {
        LoginExample loginExample=new LoginExample();
        LoginExample.Criteria cri = loginExample.createCriteria();
        cri.andUsernameEqualTo(login.getUsername());
        List<Login> login1 =  loginMapper.selectByExample(loginExample);
        if (login1!=null && login1.size()>0){
            try{
                for (Login login2 : login1) {
                    cri.andPasswordEqualTo(login.getPassword());
                    if (loginMapper.updateByExample(login2,loginExample)>0){
                        return new ResultData().ok("修改成功");
                    }
                    return new ResultData().error("修改失败，数据有误");
                }
            }catch (Exception e){
                e.printStackTrace();
                System.err.println(e.getMessage());
                return new ResultData().error("修改失败");
            }
        }
        return new ResultData().error("数据有误");
    }
}
