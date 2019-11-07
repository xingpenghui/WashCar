package com.feri.wc.common.myenum;

/**
 * 枚举 定义统一返回码
 * 200 成功
 * 4000 失败*/
public enum ResultCode {
    SUCCESS(200),FAIL(400);
    private int code;
    private ResultCode(int v){
        code=v;
    }
    public int getCode(){
        return code;
    }
}
