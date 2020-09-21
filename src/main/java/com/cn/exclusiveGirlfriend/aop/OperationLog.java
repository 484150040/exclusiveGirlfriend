package com.cn.exclusiveGirlfriend.aop;


import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
public @interface OperationLog {

    /**
     * 操作说明
     */
    public String operteContent() default "";
    public String operteType() default "";

}



