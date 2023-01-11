package com.zlyyl.controller;

import lombok.Data;

/**
 * 返回结果类
 * 响应正确则返回code和数据
 * 响应失败则返回code和消息
 */
@Data
public class Result {

    private Object data;
    private Integer code;
    private String msg;

    public Result() {
    }

    /**
     * 成功时
     * @param code
     * @param data
     */
    public Result(Integer code, Object data) {
        this.data = data;
        this.code = code;
    }

    /**
     * 失败时
     * @param code
     * @param msg
     */
    public Result(Integer code, String msg){
        this.code = code;
        this.msg = msg;
    }

    public Result(Integer code, Object data, String msg) {
        this.data = data;
        this.code = code;
        this.msg = msg;
    }
}
