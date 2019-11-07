package com.feri.wc.common.exception;

/**
 * @program: WashCar
 * @description: 自定义 异常
 * @author: Feri
 * @create: 2019-11-06 16:48
 */
public class WashCarException extends Exception {
    public WashCarException(){
        super("洗洗车出现异常");
    }
    public WashCarException(String msg){
        super(msg);
    }

}
