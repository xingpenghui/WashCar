package com.feri.wc.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * @program: WashCar
 * @description:
 * @author: Feri
 * @create: 2019-11-06 16:33
 */
@Data
@Entity //标记这是映射类 这个类对应有表
@Table(name = "evaluate") //设置表名
public class Evaluate {
    @Id //标记这是主键
    @GeneratedValue(strategy = GenerationType.IDENTITY)//标记主键的生成策略  自增 Mysql
    private Integer id;
    @Column(name = "order_id")
    private Integer oid;
    @Column(length = 30)
    private String type;
    private Integer score;
    private String comment;




}
