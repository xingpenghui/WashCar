package com.feri.wc.api.web;

import com.feri.wc.api.service.EvaluateService;
import com.feri.wc.api.service.OrderService;
import com.feri.wc.common.vo.R;
import com.feri.wc.entity.Evaluate;
import com.feri.wc.entity.Order;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @program: WashCar
 * @description:
 * @author: Feri
 * @create: 2019-11-07 11:38
 */
@Api(value = "订单相关操作",tags = "订单相关操作")
@RestController
public class OrderContoller {
    @Autowired
    private OrderService orderService;

    //新增
    @ApiOperation(value = "新增订单信息",notes = "新增订单信息")
    @PostMapping("/api/order/save.do")
    public R save(@RequestBody Order order){
        return orderService.save(order);
    }
    //查询所有订单信息
    @GetMapping("/api/order/all.do")
    @ApiOperation(value = "查询所有订单信息",notes = "查询所有订单信息")
    public R all(){
        return orderService.all();
    }
}
