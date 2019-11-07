package com.feri.wc.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;


/**
 * @program: WashCar
 * @description:
 * @author: Feri
 * @create: 2019-11-06 16:33
 */
@Data
@Entity //标记这是映射类 这个类对应有表
@Table(name = "record") //设置表名
public class Record {
    @Id //标记这是主键
    @GeneratedValue(strategy = GenerationType.IDENTITY)//标记主键的生成策略  自增 Mysql
    private Integer id;
    private Integer oid;
    @Column(length = 35)
    private String type; //预约 订单 评价
    private String info;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date ctime;
}