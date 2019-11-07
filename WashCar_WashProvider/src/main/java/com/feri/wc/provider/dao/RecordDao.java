package com.feri.wc.provider.dao;

import com.feri.wc.entity.Record;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecordDao extends JpaRepository<Record,Integer> {

}
