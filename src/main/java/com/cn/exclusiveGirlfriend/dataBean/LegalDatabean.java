package com.cn.exclusiveGirlfriend.dataBean;

import com.cn.exclusiveGirlfriend.pojo.Legal;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

/**
 * @program: exclusiveGirlfriend
 * @description: 女生例假传输数据
 * @author: Yang Fang Hong
 * @create: 2020-09-25 16:45
 */
@DynamicUpdate
@Data
public class LegalDatabean {
    private Integer loginid;    //登录编号
    private Integer roleid;    //角色编号
    private Integer page;   //页数
    private Integer limit;  //每页显示条数
    private String createtime;  //开始创建时间
    private String endtime;  //开始结束时间
    private Legal legal;    //女生例假

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("LegalDatabean{");
        sb.append("loginid=").append(loginid);
        sb.append(", roleid=").append(roleid);
        sb.append(", page=").append(page);
        sb.append(", limit=").append(limit);
        sb.append(", createtime='").append(createtime).append('\'');
        sb.append(", endtime='").append(endtime).append('\'');
        sb.append(", legal=").append(legal);
        sb.append('}');
        return sb.toString();
    }
}
