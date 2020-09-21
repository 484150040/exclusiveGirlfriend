package com.cn.exclusiveGirlfriend.common;

/**
 * @program: up
 * @description: 返回结果集
 * @author: Yang Fang Hong
 * @create: 2020-08-01 12:22
 */
public class ResultData {
    private boolean flag;
    private Integer code;
    private String message;
    private Object data;
    private Long count;

    public ResultData() {
    }

    private ResultData(boolean flag, Integer code, String message) {
        super();
        this.flag = flag;
        this.code = code;
        this.message = message;
    }

    private ResultData(boolean flag, Integer code, String message, Object data) {
        super();
        this.flag = flag;
        this.code = code;
        this.message = message;
        this.data = data;
    }

    private ResultData(boolean flag, Integer code, String message, Object data, Long count) {
        super();
        this.flag = flag;
        this.code = code;
        this.message = message;
        this.data = data;
        this.count = count;
    }

    public boolean isFlag() {
        return flag;
    }
    public void setFlag(boolean flag) {
        this.flag = flag;
    }
    public Integer getCode() {
        return code;
    }
    public void setCode(Integer code) {
        this.code = code;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public Object getData() {
        return data;
    }
    public void setData(Object data) {
        this.data = data;
    }
    public Long getCount() {
        return count;
    }
    public void setCount(Long count) {
        this.count = count;
    }

    /**
     * 返回成功消息
     * @return ResultData
     */
    public static ResultData ok() {
        return new ResultData(true, StatusCode.OK, "成功");
    }

    /**
     * 返回成功消息
     * @return ResultData
     */
    public static ResultData ok(Object data) {
        return new ResultData(true, StatusCode.OK, "成功", data);
    }

    /**
     * 返回成功消息
     * @return ResultData
     */
    public static ResultData ok(String message, Object data) {
        return new ResultData(true, StatusCode.OK, "成功", data);
    }

    /**
     * 返回成功消息
     * @return ResultData
     */
    public static ResultData ok(Object data, Long count) {
        return new ResultData(true, StatusCode.OK, "成功", data, count);
    }

    /**
     * 返回失败消息
     * @return ResultData
     */
    public static ResultData error() {
        return new ResultData(false, StatusCode.ERROR, "失败");
    }

    /**
     * 返回失败消息
     * @return ResultData
     */
    public static ResultData error(String message) {
        return new ResultData(false, StatusCode.ERROR, message);
    }

    /**
     * 返回失败消息
     * @return ResultData
     */
    public static ResultData error(Integer code, String message) {
        return new ResultData(false, code, message);
    }

    /**
     * 返回登录失败的消息：用户名或密码错误
     * @return ResultData
     */
    public static ResultData loginError() {
        return new ResultData(false, StatusCode.LOGINERROR, "用户名或密码错误");
    }

    /**
     * 返回权限不足
     * @return ResultData
     */
    public static ResultData accessError() {
        return new ResultData(false, StatusCode.ACCESSERROR, "权限不足");
    }

    /**
     * 返回远程调用失败
     * @return ResultData
     */
    public static ResultData remoteError() {
        return new ResultData(false, StatusCode.REMOTEERROR, "远程调用失败");
    }

    /**
     * 返回重复操作
     * @return ResultData
     */
    public static ResultData repError() {
        return new ResultData(false, StatusCode.REPERROR, "重复操作");
    }
}
