package com.feri.wc.provider.service;

import com.feri.wc.common.vo.R;
import com.feri.wc.entity.Appointment;

/**
 * @program: WashCar
 * @description:
 * @author: Feri
 * @create: 2019-11-06 16:57
 */
public interface AppointmentService {
    //新增预约
    R save(Appointment appointment);
    R all();
}
