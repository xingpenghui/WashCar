package com.feri.wc.provider.service;

import com.feri.wc.common.vo.R;
import com.feri.wc.entity.Appointment;
import com.feri.wc.entity.Evaluate;

/**
 * @program: WashCar
 * @description:
 * @author: Feri
 * @create: 2019-11-06 16:57
 */
public interface EvaluateService {
   //新增评价
    R save(Evaluate evaluate);
    //查询订单的所有评价
    R queryByOid(int oid);


}
