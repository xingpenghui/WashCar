package com.feri.wc.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @program: WashCar
 * @description:
 * @author: Feri
 * @create: 2019-11-06 16:54
 */
@SpringBootApplication
@EnableDiscoveryClient //注册服务
@EntityScan(basePackages = "com.feri.wc.entity") //扫描映射类所在的包  原因：实体类和持久层没有在一个项目
public class WashCarProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(WashCarProviderApplication.class,args);
    }
}
