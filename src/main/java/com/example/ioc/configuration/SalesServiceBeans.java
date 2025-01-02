package com.example.ioc.configuration;

import com.example.ioc.enyity.SalesService;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service //業務邏輯組件
public class SalesServiceBeans {

    @Bean
    public SalesService carSalesService(){
        return new SalesService("SalesService");
    }

}
