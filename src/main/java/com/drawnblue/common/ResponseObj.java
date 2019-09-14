package com.drawnblue.common;

import com.drawnblue.util.DateUtil;

import java.util.Date;

public class ResponseObj {
    private int code = 0;
    private String message = "success";
    private Date timestamp = DateUtil.getNow();

    private  Object data;

    public ResponseObj() {
    }

    public ResponseObj(int code, String message,  Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }


}
