package com.feri.wc.api.web;

import com.feri.wc.api.service.AppointmentService;
import com.feri.wc.common.vo.R;
import com.feri.wc.entity.Appointment;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: WashCar
 * @description:
 * @author: Feri
 * @create: 2019-11-06 17:26
 */
@Api(value = "预约操作",tags = "预约操作")
@RestController
public class AppointmentController {
    @Autowired
    private AppointmentService appointmentService;

    //新增
    @ApiOperation(value = "新增预约信息",notes = "新增预约信息")
    @PostMapping("/api/appointment/save.do")
    public R save(@RequestBody Appointment appointment){
        return appointmentService.save(appointment);
    }

    @ApiOperation(value = "查看所有的预约信息",notes = "查看所有的预约信息")
    @GetMapping("/provider/appointment/all.do")
    public R all(){
        return appointmentService.all();
    }
}
