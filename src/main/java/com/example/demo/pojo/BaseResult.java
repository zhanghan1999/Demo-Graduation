package com.example.demo.pojo;

public class BaseResult<T> {

    //200 成功 success
    private int code;

    //错误信息
    private String msg;

    private T data;

    public BaseResult() {

    }

    public BaseResult(T data) {
        this.code = 200;
        this.data = data;
    }

    public BaseResult(String msg) {
        this.code = -1;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setSuccess() {
        setCode(200);
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
