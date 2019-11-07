package com.feri.wc.provider.service;

import com.feri.wc.common.vo.R;
import com.feri.wc.entity.Record;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecordService {
    void save(Record record);
    R all();
    void saveLog(int oid,String type,String info);
}
