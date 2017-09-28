package com.ob.bus.model;

/**
 * Created by pengds on 2017/7/6.
 *
 */

public class HttpResult<T> {
    //用来模仿resultCode和resultMessage
    private int code;
    private String msg;
    //用来模仿Data
    private T data;

    public int getCode() {
        return code;
    }

    public String getMessge() {
        return msg;
    }

    public T getSubjects() {
        return data;
    }
}
