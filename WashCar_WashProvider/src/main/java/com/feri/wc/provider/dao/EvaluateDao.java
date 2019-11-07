package com.feri.wc.provider.dao;

import com.feri.wc.entity.Evaluate;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface EvaluateDao extends JpaRepository<Evaluate,Integer> {
    //方法名解析查询
    List<Evaluate> getByOid(int oid);
}
