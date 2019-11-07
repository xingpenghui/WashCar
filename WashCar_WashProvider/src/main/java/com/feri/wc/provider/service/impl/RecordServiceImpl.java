package com.feri.wc.provider.service.impl;

import com.feri.wc.common.myenum.LogType;
import com.feri.wc.common.vo.R;
import com.feri.wc.entity.Order;
import com.feri.wc.entity.Record;
import com.feri.wc.provider.dao.OrderDao;
import com.feri.wc.provider.dao.RecordDao;
import com.feri.wc.provider.service.OrderService;
import com.feri.wc.provider.service.RecordService;
import com.netflix.discovery.converters.Auto;
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
public class RecordServiceImpl implements RecordService {
    @Autowired
    private RecordDao recordDao;

    @Override
    public void save(Record record) {
        recordDao.save(record);
    }

    @Override
    public R all() {
        return R.ok(recordDao.findAll());
    }

    @Override
    public void saveLog(int oid, String type, String info) {
        Record record=new Record();
        record.setCtime(new Date());
        record.setOid(oid);
        record.setType(type);
        record.setInfo(info);
        save(record);
    }
}
