package com.service.dto;

/**
 * @author Nikolay Smirnov
 */
public class Message {
    private Integer userId;
    private String msg;

    public Message(Integer userId, String msg) {
        this.userId = userId;
        this.msg = msg;
    }

    public Integer getUserId() {
        return this.userId;
    }

    public String getMsg() {
        return this.msg;
    }
}