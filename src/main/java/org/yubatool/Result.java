package org.yubatool;



import java.io.Serializable;



public class Result<T> implements Serializable {
    private String code;
    private String msg;
    private T obj;

    public static <T> Result<T> success(T obj) {
        return success(String.valueOf(200),"success", obj);
    }

    public static <T> Result<T> error(String code, String msg) {
        Result<T> result = new Result<>();
        result.msg = msg;
        result.code = code;
        return result;
    }

    public static <T> Result<T> success(String code, String msg, T obj) {
        Result<T> result = new Result<>();
        result.obj = obj;
        result.msg = msg;
        result.code = code;
        return result;
    }
}
