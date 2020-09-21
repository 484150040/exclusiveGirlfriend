package com.cn.exclusiveGirlfriend.service;

import com.cn.exclusiveGirlfriend.common.ResultData;
import com.cn.exclusiveGirlfriend.dataBean.UserDataBean;

/**
 * @program: exclusiveGirlfriend
 * @description: 用户信息数据接口
 * @author: Yang Fang Hong
 * @create: 2020-09-14 14:38
 */
public interface UserService {
    /**
     * @Author HONG
     * @Description //TODO 新增用户数据
     * @Date 8:29 2020/9/8
     * @Param []
     * @return com.cn.exclusiveGirlfriend.common.ResultData
     **/
    ResultData addUser(UserDataBean userDataBean);
    /**
    *@Description: 修改用户数据
    *@Param: [userDataBean]
    *@return: com.cn.exclusiveGirlfriend.common.ResultData
    *@Author: Yang Fang Hong
    *@date: 2020/9/14
    */
    ResultData updateUserAll(UserDataBean userDataBean);
    /**
     * @Author HONG
     * @Description //TODO7.	删除（自我注销）该用户数据
     * （清理掉该用户的所有数据）
     * 修改用户状态（弹窗让用户确定是否注销
     * @Date 8:38 2020/9/8
     * @Param []
     * @return com.cn.exclusiveGirlfriend.common.ResultData
     **/
    ResultData deleteUserAll(UserDataBean userDataBean);
    /**
     * @Author HONG
     * @Description //TODO 管理员）模糊分页查询
     * @Date 8:29 2020/9/8
     * @Param []
     * @return com.cn.exclusiveGirlfriend.common.ResultData
     **/
    ResultData selectUserAll(UserDataBean userDataBean);
    /**
    *@Description: 根据编号查询用户数据
    *@Param: [userDataBean]
    *@return: com.cn.exclusiveGirlfriend.common.ResultData
    *@Author: Yang Fang Hong
    *@date: 2020/9/19
    */
    ResultData selectUserId(UserDataBean userDataBean);
}
