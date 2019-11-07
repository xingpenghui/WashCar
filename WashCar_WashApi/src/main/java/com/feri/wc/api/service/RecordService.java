package com.feri.wc.api.service;

import com.feri.wc.common.vo.R;
import com.feri.wc.entity.Order;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(value = "WashProvider")
public interface RecordService {
    //查询所有订单信息
    @GetMapping("/provider/record/all.do")
    R all();
}
