package com.feri.wc.provider.controller;

import com.feri.wc.common.vo.R;
import com.feri.wc.entity.Appointment;
import com.feri.wc.provider.service.AppointmentService;
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
public class AppointmentController {
    @Autowired
    private AppointmentService service;

    //新增
    @PostMapping("/provider/appointment/save.do")
    public R save(@RequestBody Appointment appointment){
        return service.save(appointment);
    }
    //查询所有预约记录
    @GetMapping("/provider/appointment/all.do")
    public R all(){
        return service.all();
    }
}
