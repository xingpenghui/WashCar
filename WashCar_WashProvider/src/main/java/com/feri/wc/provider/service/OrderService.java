package com.feri.wc.provider.service;

import com.feri.wc.common.vo.R;
import com.feri.wc.entity.Appointment;
import com.feri.wc.entity.Order;

/**
 * @program: WashCar
 * @description:
 * @author: Feri
 * @create: 2019-11-06 16:57
 */
public interface OrderService {
   R save(Order order);
   //查询所有订单
    R queryAll();
    //查询订单详情 包括预约信息 车主信息 评价信息

}
