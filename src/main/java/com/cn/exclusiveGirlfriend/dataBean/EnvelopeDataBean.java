package com.cn.exclusiveGirlfriend.dataBean;

import com.cn.exclusiveGirlfriend.pojo.Envelope;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

/**
 * @ClassName EnvelopeDataBean
 * @Author ASUS
 * @Description TODO;信封前后端传输数据
 * @Date 2020/9/27 10:57
 * @Hodified By:
 **/
@DynamicUpdate
@Data
public class EnvelopeDataBean {
    private Integer loginid;    //登录编号
    private Integer roleid;    //角色编号
    private Integer page;   //页数
    private Integer limit;  //每页显示条数
    private String createtime;  //开始创建时间
    private String endtime;  //开始结束时间
    private Envelope envelope;  //信封传输数据

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("EnvelopeDataBean{");
        sb.append("loginid=").append(loginid);
        sb.append(", roleid=").append(roleid);
        sb.append(", page=").append(page);
        sb.append(", limit=").append(limit);
        sb.append(", createtime='").append(createtime).append('\'');
        sb.append(", endtime='").append(endtime).append('\'');
        sb.append(", envelope=").append(envelope);
        sb.append('}');
        return sb.toString();
    }
}
