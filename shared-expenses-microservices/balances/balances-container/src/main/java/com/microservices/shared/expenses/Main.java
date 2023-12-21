package com.microservices.shared.expenses;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.microservices.shared.expenses.out.jpa")
@EntityScan(basePackages = {"com.microservices.shared.expenses.out.jpa"})
@SpringBootApplication(scanBasePackages = {"com.microservices.shared.expenses.pilotes"})
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}