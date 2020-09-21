package com.cn.exclusiveGirlfriend.service.impl;

import com.cn.exclusiveGirlfriend.common.ResultData;
import com.cn.exclusiveGirlfriend.dataBean.UserDataBean;
import com.cn.exclusiveGirlfriend.mapper.UserMapper;
import com.cn.exclusiveGirlfriend.pojo.User;
import com.cn.exclusiveGirlfriend.pojo.UserExample;
import com.cn.exclusiveGirlfriend.service.UserService;
import com.cn.exclusiveGirlfriend.utiles.DateUtiles;
import com.cn.exclusiveGirlfriend.utiles.EncryptUtil;
import net.sf.ehcache.search.expression.Criteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.*;

/**
 * @program: exclusiveGirlfriend
 * @description: 用户信息数据接口实现
 * @author: Yang Fang Hong
 * @create: 2020-09-14 14:53
 */
@Service
@Transactional
public class UserServiceimpl implements UserService {
    @Autowired(required = false)
    private UserMapper userMapper;
    /**
     * @Author HONG
     * @Description //TODO 新增用户数据
     * @Date 8:29 2020/9/8
     * @Param []
     * @return com.cn.exclusiveGirlfriend.common.ResultData
     **/
    @Override
    public ResultData addUser(UserDataBean userDataBean) {
        Optional<User> optionalUser=Optional.ofNullable(userDataBean.getUser());
        if (optionalUser.isPresent()){
            userDataBean.getUser().setUid(DateUtiles.getYear(new Date())+userDataBean
                    .getUser().getIdentity().length()>0?
                    Integer.parseInt(userDataBean.getUser().getIdentity()
                            .substring(userDataBean.getUser().getIdentity().length()-4))
                    :(int)(Math.random()*1000+1000));
            try {
                if (userMapper.insertSelective(userDataBean.getUser())>0){
                    return new ResultData().ok(optionalUser);
                }
            }catch (Exception e){
                e.printStackTrace();
                return new ResultData().error();
            }

        }
        return new ResultData().error();
    }
    /**
     * @Author HONG
     * @Description //TODO 6.	修改数据详情数据
     * @Date 8:38 2020/9/8
     * @Param []
     * @return com.cn.exclusiveGirlfriend.common.ResultData
     **/
    @Override
    public ResultData updateUserAll(UserDataBean userDataBean) {
        UserExample userExample=new UserExample();
        UserExample.Criteria criteria=userExample.createCriteria();
        criteria.andUidEqualTo(userDataBean.getUser().getUid());
        Optional<UserExample> optionalUser=Optional.ofNullable(userExample);
        if (optionalUser.isPresent()){
            try {
                if (userMapper.updateByExampleSelective(userDataBean.getUser(),userExample)>0?true:false){
                    return new ResultData().ok(optionalUser);
                }
            }catch (Exception e){
                e.printStackTrace();
                return new ResultData().error();
            }

        }
        return new ResultData().error();
    }
    /**
     * @Author HONG
     * @Description //TODO7.	删除（自我注销）该用户数据
     * （清理掉该用户的所有数据）
     * 修改用户状态（弹窗让用户确定是否注销
     * @Date 8:38 2020/9/8
     * @Param []
     * @return com.cn.exclusiveGirlfriend.common.ResultData
     **/
    @Override
    public ResultData deleteUserAll(UserDataBean userDataBean) {
        Optional<User> optionalUser=Optional.ofNullable(userDataBean.getUser());
        if (optionalUser.isPresent()){
            try {
                if (userMapper.insertSelective(userDataBean.getUser())>0){
                    return new ResultData().ok(optionalUser);
                }
            }catch (Exception e){
                e.printStackTrace();
                return new ResultData().error();
            }

        }
        return new ResultData().error();
    }
    /**
     * @Author HONG
     * @Description //TODO 管理员）模糊分页查询
     * @Date 8:29 2020/9/8
     * @Param []
     * @return com.cn.exclusiveGirlfriend.common.ResultData
     **/
    @Override
    public ResultData selectUserAll(UserDataBean userDataBean) {
        if (Optional.ofNullable(userDataBean).isPresent()){
            UserExample userExample=new UserExample();
            UserExample.Criteria criteria=userExample.createCriteria();
            if (userDataBean.getUser().getName()!=null){
                criteria.andNameLike(userDataBean.getUser().getName());
            }
            if (userDataBean.getUser().getSex()!=null){
                criteria.andSexEqualTo(userDataBean.getUser().getSex());
            }
            if (userDataBean.getUser().getQq()!=null){
                criteria.andQqEqualTo(userDataBean.getUser().getQq());
            }
            if (userDataBean.getUser().getWechat()!=null){
                criteria.andWechatEqualTo(userDataBean.getUser().getWechat());
            }
            if (userDataBean.getUser().getIdentity()!=null){
                criteria.andIdentityEqualTo(userDataBean.getUser().getIdentity());
            }
            if (userDataBean.getUser().getPhone()!=null){
                criteria.andPhoneEqualTo(userDataBean.getUser().getPhone());
            }
            if (userDataBean.getCreatetime()!=null){
                criteria.andCreatetimeGreaterThanOrEqualTo(userDataBean.getCreatetime());
            }
            if (userDataBean.getEndtime()!=null){
                criteria.andCreatetimeLessThanOrEqualTo(userDataBean.getEndtime());
            }
            long count = userMapper.countByExample(userExample);
            userDataBean.setPage(userDataBean.getPage()-1*userDataBean.getLimit());
            List<User> list=userMapper.selectUserAll(userDataBean);
            for (User user : list) {
                user.setIdentity(EncryptUtil.zdyjiemi(user.getIdentity()));
            }
            if(Optional.ofNullable(list).isPresent()){
                Map<String,Object> map=new LinkedHashMap<>();
                map.put("list",list);
                map.put("count",count);
                return new ResultData().ok("请查看数据",map);
            }
        }
        return new ResultData().error();
    }
    /**
    *@Description: 通过编号查询用户数据
    *@Param: [userDataBean]
    *@return: com.cn.exclusiveGirlfriend.common.ResultData
    *@Author: Yang Fang Hong
    *@date: 2020/9/19
    */
    @Override
    public ResultData selectUserId(UserDataBean userDataBean) {
        if (Optional.ofNullable(userDataBean).isPresent()){
            UserExample userExample=new UserExample();
            UserExample.Criteria criteria=userExample.createCriteria();
           criteria.andUidEqualTo(userDataBean.getUser().getUid());
           List<User> users=userMapper.selectByExample(userExample);
           if (Optional.ofNullable(users).isPresent()){
               for (User user : users) {
                   user.setIdentity(EncryptUtil.zdyjiemi(user.getIdentity()));
                   return new ResultData().ok("请查看数据",user);
               }
           }
        }
        return new ResultData().error();
    }
}
