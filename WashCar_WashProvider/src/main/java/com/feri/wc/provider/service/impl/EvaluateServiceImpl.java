package com.feri.wc.provider.service.impl;

import com.feri.wc.common.myenum.LogType;
import com.feri.wc.common.vo.R;
import com.feri.wc.entity.Evaluate;
import com.feri.wc.entity.Record;
import com.feri.wc.provider.dao.EvaluateDao;
import com.feri.wc.provider.dao.RecordDao;
import com.feri.wc.provider.service.EvaluateService;
import com.feri.wc.provider.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;


/**
 * @program: WashCar
 * @description:
 * @author: Feri
 * @create: 2019-11-06 16:57
 */
@Service
public class EvaluateServiceImpl implements EvaluateService {
    @Autowired
    private EvaluateDao evaluateDao;
    @Autowired
    private RecordService recordService;
    @Override
    public R save(Evaluate evaluate) {
        try{
            evaluateDao.save(evaluate);
            recordService.saveLog(evaluate.getId(),LogType.PingJia.getType(),"完成了评价");
            return R.setR(true,"OK");
        }catch (Exception e){

            return R.fail();
        }
    }

    @Override
    public R queryByOid(int oid) {
        return R.ok(evaluateDao.getByOid(oid));
    }
}
