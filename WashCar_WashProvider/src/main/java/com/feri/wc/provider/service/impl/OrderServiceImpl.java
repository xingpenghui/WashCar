package com.feri.wc.provider.service.impl;

import com.feri.wc.common.vo.R;
import com.feri.wc.entity.Order;
import com.feri.wc.provider.dao.OrderDao;
import com.feri.wc.provider.service.OrderService;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: WashCar
 * @description:
 * @author: Feri
 * @create: 2019-11-06 16:57
 */
@Service
public class OrderServiceImpl  implements OrderService {

    @Autowired
    private OrderDao orderDao;
    @Override
    public R save(Order order) {
        return R.setR(orderDao.save(order)!=null,"OK");
    }

    @Override
    public R queryAll() {
        return R.ok(orderDao.findAll());
    }
}
