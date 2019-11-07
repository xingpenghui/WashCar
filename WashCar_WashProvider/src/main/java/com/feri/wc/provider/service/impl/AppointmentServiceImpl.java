package com.feri.wc.provider.service.impl;

import com.feri.wc.common.vo.R;
import com.feri.wc.entity.Appointment;
import com.feri.wc.provider.dao.AppointmentDao;
import com.feri.wc.provider.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: WashCar
 * @description:
 * @author: Feri
 * @create: 2019-11-06 16:58
 */
@Service
public class AppointmentServiceImpl implements AppointmentService {
    @Autowired
    private AppointmentDao dao;
    @Override
    public R save(Appointment appointment) {
        if(dao.save(appointment)!=null){
            return R.ok();
        }else {
            return R.fail();
        }
    }

    @Override
    public R all() {
        return R.ok(dao.findAll());
    }
}
