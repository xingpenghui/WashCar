package com.feri.wc.api.web;

import com.feri.wc.api.service.OrderService;
import com.feri.wc.api.service.RecordService;
import com.feri.wc.common.vo.R;
import com.feri.wc.entity.Order;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: WashCar
 * @description:
 * @author: Feri
 * @create: 2019-11-07 11:38
 */
@Api(value = "日志相关操作",tags = "日志相关操作")
@RestController
public class RecordContoller {
    @Autowired
    private RecordService recordService;


    //查询所有日志信息
    @GetMapping("/api/record/all.do")
    @ApiOperation(value = "查询所有日志信息",notes = "查询所有日志信息")
    public R all(){
        return recordService.all();
    }
}
