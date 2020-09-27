package com.cn.exclusiveGirlfriend.dataBean;

import com.cn.exclusiveGirlfriend.pojo.Transporttype;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

/**
 * @ClassName TransportTypeDataBean
 * @Author ASUS
 * @Description TODO;
 * @Date 2020/9/27 11:40
 * @Hodified By:
 **/
@DynamicUpdate
@Data
public class TransportTypeDataBean {
    private Integer loginid;    //登录编号
    private Integer roleid;    //角色编号
    private Integer page;   //页数
    private Integer limit;  //每页显示条数
    private String createtime;  //开始创建时间
    private String endtime;  //开始结束时间
    private Transporttype transporttype;    //传输类型

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("TransportTypeDataBean{");
        sb.append("loginid=").append(loginid);
        sb.append(", roleid=").append(roleid);
        sb.append(", page=").append(page);
        sb.append(", limit=").append(limit);
        sb.append(", createtime='").append(createtime).append('\'');
        sb.append(", endtime='").append(endtime).append('\'');
        sb.append(", transporttype=").append(transporttype);
        sb.append('}');
        return sb.toString();
    }
}
