package com.feri.wc.api.service;

import com.feri.wc.common.vo.R;
import com.feri.wc.entity.Evaluate;
import com.feri.wc.entity.Order;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "WashProvider")
public interface OrderService {
    //新增
    @PostMapping("/provider/order/save.do")
    R save(@RequestBody Order order);
    //查询所有订单信息
    @GetMapping("/provider/order/all.do")
    R all();
}
