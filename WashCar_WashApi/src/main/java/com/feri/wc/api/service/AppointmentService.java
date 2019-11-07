package com.feri.wc.api.service;

import com.feri.wc.common.vo.R;
import com.feri.wc.entity.Appointment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(value = "WashProvider")
public interface AppointmentService {
    //新增
    @PostMapping("/provider/appointment/save.do")
    R save(@RequestBody Appointment appointment);
    @GetMapping("/provider/appointment/all.do")
    R all();
}
