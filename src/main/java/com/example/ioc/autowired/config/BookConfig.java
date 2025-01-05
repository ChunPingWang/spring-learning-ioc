package com.example.ioc.autowired.config;

import com.example.ioc.autowired.dao.BookDao;
import com.example.ioc.autowired.service.BookService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BookConfig {

    @Bean
    public BookService bookService(){
        return new BookService(new BookDao());
    }

    @Bean
    public BookDao bookDao(){
        return new BookDao();
    }
}
