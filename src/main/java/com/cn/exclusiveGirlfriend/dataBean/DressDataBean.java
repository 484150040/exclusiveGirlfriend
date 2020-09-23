package com.cn.exclusiveGirlfriend.dataBean;

import com.cn.exclusiveGirlfriend.pojo.Dress;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

/**
 * @ClassName DressDataBean
 * @Author ASUS
 * @Description TODO;   用户（女朋友）服饰管理传输数据
 * @Date 2020/9/24 1:35
 * @Hodified By:
 **/
@DynamicUpdate
@Data
public class DressDataBean {
    private Integer loginid;    //登录编号
    private Integer roleid;    //角色编号
    private Integer page;   //页数
    private Integer limit;  //每页显示条数
    private String createtime;  //开始创建时间
    private String endtime;  //开始结束时间
    private Dress dress;    //用户（女朋友）服饰管理

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("DressDataBean{");
        sb.append("loginid=").append(loginid);
        sb.append(", roleid=").append(roleid);
        sb.append(", page=").append(page);
        sb.append(", limit=").append(limit);
        sb.append(", createtime='").append(createtime).append('\'');
        sb.append(", endtime='").append(endtime).append('\'');
        sb.append(", dress=").append(dress);
        sb.append('}');
        return sb.toString();
    }
}
