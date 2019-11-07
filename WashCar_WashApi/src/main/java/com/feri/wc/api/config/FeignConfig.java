package com.feri.wc.api.config;

import feign.Request;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: WashCar
 * @description: 解决超时 延长时间
 * @author: Feri
 * @create: 2019-11-07 12:00
 */
@Configuration
public class FeignConfig {
    public int connectTime=10000;
    public int readTime=10000;
    @Bean
    public Request.Options createOP(){
        return new Request.Options(connectTime,readTime);
    }
}
