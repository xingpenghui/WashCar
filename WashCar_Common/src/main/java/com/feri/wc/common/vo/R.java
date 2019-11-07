package com.feri.wc.common.vo;

import com.feri.wc.common.myenum.ResultCode;
import lombok.Data;

/**
 * @program: WashCar
 * @description:
 * @author: Feri
 * @create: 2019-11-06 16:42
 */
@Data
public class R {
    private int code;
    private String msg;
    private Object data;

    public static R ok(String msg,Object obj){
        R r=new R();
        r.setCode(ResultCode.SUCCESS.getCode());
        r.setMsg(msg);
        r.setData(obj);
        return r;
    }
    public static R ok(Object obj){
        return ok("OK",obj);
    }
    public static R ok(){
        return ok(null);
    }
    public static R fail(String msg){
        R r=new R();
        r.setCode(ResultCode.FAIL.getCode());
        r.setMsg(msg);
        r.setData(null);
        return r;
    }
    public static R fail(){
       return fail("FAIL");
    }

    public static R setR(boolean issuccess,Object obj){
        if(issuccess){
            return ok(obj);
        }else {
            return fail();
        }
    }
}
