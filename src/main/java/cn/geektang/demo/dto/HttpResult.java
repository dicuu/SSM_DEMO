package cn.geektang.demo.dto;

/**
 * Author:      TangRui
 * Email:       tr@geektang.cn
 * Date:        2017/6/16
 * Description:
 */
public class HttpResult<T> {
    private int code;
    private String msg;
    private T data;

    public HttpResult() {
    }

    public HttpResult(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public HttpResult(int code, T data) {
        this.code = code;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
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
