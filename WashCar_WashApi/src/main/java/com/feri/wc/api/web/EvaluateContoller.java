package com.feri.wc.api.web;

import com.feri.wc.api.service.EvaluateService;
import com.feri.wc.common.vo.R;
import com.feri.wc.entity.Evaluate;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @program: WashCar
 * @description:
 * @author: Feri
 * @create: 2019-11-07 11:38
 */
@Api(value = "评价操作",tags = "评价操作")
@RestController
public class EvaluateContoller {
    @Autowired
    private EvaluateService evaluateService;

    //新增
    @ApiOperation(value = "新增评价信息",notes = "新增评价信息")
    @PostMapping("/api/evaluate/save.do")
    public R save(@RequestBody Evaluate evaluate){
        return evaluateService.save(evaluate);
    }
    //查询订单的所有评价信息
    @ApiOperation(value = "查询订单的所有评价信息",notes = "查询订单的所有评价信息")
    @GetMapping("/api/evaluate/all.do")
    public R all(@RequestParam int oid){
        return evaluateService.all(oid);
    }
}
