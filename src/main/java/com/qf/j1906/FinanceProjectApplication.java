package com.qf.j1906;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.qf.j1906.*"})
@SpringBootApplication
public class FinanceProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(FinanceProjectApplication.class, args);
    }

}
