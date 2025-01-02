package com.example.ioc.configuration;

import com.example.ioc.enyity.StudentEntity;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

@Repository //資料庫組件
public class StudentRepositoryBeans {
    @Bean
    public StudentEntity student(){
        return new StudentEntity(123456, "John");
    }
}
