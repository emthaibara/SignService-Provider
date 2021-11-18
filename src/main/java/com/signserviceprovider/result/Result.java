package com.signserviceprovider.result;

/**
 * @Author:SCBC_LiYongJie
 * @time:2021/11/15
 */


public class Result<T> {

    private Integer code ;
    private String codeMsg;
    private T data;

    private Result(String codeMsg){
        this.code = 0;
        this.data = null;
        this.codeMsg = codeMsg;
    }

    private Result(CodeMsg codeMsg){
        this.code = codeMsg.getCode();
        this.data = null;
        this.codeMsg = codeMsg.getCodeMsg();
    }

    private Result(Integer code,String codeMsg){
        this.code = code;
        this.codeMsg = codeMsg;
        this.data = null;
    }

    private Result(T data) {
        code = 1 ;
        this.data = data;
        codeMsg= null;
    }

    public static <T>Result<T> success (T t){
        return new Result<>(t);
    }

    public static  <T>Result<T> error(CodeMsg codeMsg){
        return new Result<>(codeMsg);
    }
    public static  <T>Result<T> error(String codeMsg){
        return new Result<>(codeMsg);
    }
    public static  Result<String> signSuccess(){
        return Result.success("Sign Success");
    }

    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }
    public String getCodeMsg() {
        return codeMsg;
    }
    public void setCodeMsg(String codeMsg) {
        this.codeMsg = codeMsg;
    }
    public T getData() {
        return data;
    }
    public void setData(T data) {
        this.data = data;
    }
}
