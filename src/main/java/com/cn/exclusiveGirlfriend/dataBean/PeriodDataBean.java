package com.cn.exclusiveGirlfriend.dataBean;

import com.cn.exclusiveGirlfriend.pojo.Period;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

/**
 * @ClassName PeriodDataBean
 * @Author ASUS
 * @Description TODO;   经期注意事项传输数据
 * @Date 2020/9/20 12:53
 * @Hodified By:
 **/
@DynamicUpdate
@Data
public class PeriodDataBean {
    private Period period;      //经期注意事项
    private Integer loginid;    //登录编号
    private Integer roleid;    //角色编号
    private Integer page;   //页数
    private Integer limit;  //每页显示条数
    private String createtime;  //开始创建时间
    private String endtime;  //开始结束时间

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("PeriodDataBean{");
        sb.append("period=").append(period);
        sb.append(", loginid=").append(loginid);
        sb.append(", roleid=").append(roleid);
        sb.append(", page=").append(page);
        sb.append(", limit=").append(limit);
        sb.append(", createtime='").append(createtime).append('\'');
        sb.append(", endtime='").append(endtime).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
