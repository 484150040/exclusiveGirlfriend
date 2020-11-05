package com.cn.exclusiveGirlfriend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created with IntelliJ IDEA.
 * User: zdk
 * Date: 2019/10/08 21:54
 * Description:
 * Version: V1.0
 */
@Controller
public class SwaggerController {
    @RequestMapping("/swagger-ui")
    public String getUserInfo() {
        return "error";
    }

}
