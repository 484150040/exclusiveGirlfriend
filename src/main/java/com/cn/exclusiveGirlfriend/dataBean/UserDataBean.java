package com.cn.exclusiveGirlfriend.dataBean;

import com.cn.exclusiveGirlfriend.pojo.User;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

/**
 * @program: exclusiveGirlfriend
 * @description: 用户传输数据类
 * @author: Yang Fang Hong
 * @create: 2020-09-14 16:10
 */
@DynamicUpdate
@Data
public class UserDataBean {
    private Integer loginid;    //登录编号
    private Integer roleid;    //角色编号
    private User user;      //用户编号
    private Integer page;   //页数
    private Integer limit;  //每页显示条数
    private String createtime;  //开始创建时间
    private String endtime;  //开始结束时间

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserDataBean{");
        sb.append("loginid=").append(loginid);
        sb.append(", roleid=").append(roleid);
        sb.append(", user=").append(user);
        sb.append(", page=").append(page);
        sb.append(", limit=").append(limit);
        sb.append(", createtime='").append(createtime).append('\'');
        sb.append(", endtime='").append(endtime).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
