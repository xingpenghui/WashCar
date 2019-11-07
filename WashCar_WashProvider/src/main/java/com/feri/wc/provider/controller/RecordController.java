package com.feri.wc.provider.controller;

import com.feri.wc.common.vo.R;
import com.feri.wc.entity.Order;
import com.feri.wc.provider.service.RecordService;
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
public class RecordController {
    @Autowired
    private RecordService service;

    //查询所有订单信息
    @GetMapping("/provider/record/all.do")
    public R all(){
        return service.all();
    }
}
