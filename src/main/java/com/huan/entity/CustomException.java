package com.huan.entity;

/**
 * Created by 马欢欢 on 17-8-10.
 */
    public class CustomException extends Exception{
    public String message;

    public CustomException(String message){
        super(message);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

