package com.feri.wc.api.service;

import com.feri.wc.common.vo.R;
import com.feri.wc.entity.Evaluate;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "WashProvider")
public interface EvaluateService {
    //新增
    @PostMapping("/provider/evaluate/save.do")
    R save(@RequestBody Evaluate evaluate);
    //查询所有订单信息
    @GetMapping("/provider/evaluate/all.do")
    R all(@RequestParam int oid);
}
