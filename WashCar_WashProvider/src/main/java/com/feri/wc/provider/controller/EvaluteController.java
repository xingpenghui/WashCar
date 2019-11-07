package com.feri.wc.provider.controller;

import com.feri.wc.common.vo.R;
import com.feri.wc.entity.Evaluate;
import com.feri.wc.entity.Order;
import com.feri.wc.provider.service.EvaluateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * @program: WashCar
 * @description:
 * @author: Feri
 * @create: 2019-11-06 16:59
 */
@RestController
public class EvaluteController {
    @Autowired
    private EvaluateService service;

    //新增
    @PostMapping("/provider/evaluate/save.do")
    public R save(@RequestBody Evaluate evaluate){
        return service.save(evaluate);
    }
    //查询所有订单信息
    @GetMapping("/provider/evaluate/all.do")
    public R all(@RequestParam int oid){
        return service.queryByOid(oid);
    }
}
