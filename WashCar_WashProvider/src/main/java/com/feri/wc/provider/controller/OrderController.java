package com.feri.wc.provider.controller;

import com.feri.wc.common.vo.R;
import com.feri.wc.entity.Appointment;
import com.feri.wc.entity.Order;
import com.feri.wc.provider.service.AppointmentService;
import com.feri.wc.provider.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


/**
 * @program: WashCar
 * @description:
 * @author: Feri
 * @create: 2019-11-06 16:59
 */
@RestController
public class OrderController {
    @Autowired
    private OrderService service;

    //新增
    @PostMapping("/provider/order/save.do")
    public R save(@RequestBody Order order){
        return service.save(order);
    }
    //查询所有订单信息
    @GetMapping("/provider/order/all.do")
    public R all(){
        return service.queryAll();
    }
}
