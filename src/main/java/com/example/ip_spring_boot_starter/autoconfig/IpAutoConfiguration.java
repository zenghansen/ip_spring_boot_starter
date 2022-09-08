package com.example.ip_spring_boot_starter.autoconfig;

import com.example.ip_spring_boot_starter.service.IpCountService;
import org.springframework.context.annotation.Bean;

public class IpAutoConfiguration {

    @Bean
    public IpCountService ipCountService(){
        return new IpCountService();

    }
}
