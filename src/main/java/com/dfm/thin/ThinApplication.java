package com.dfm.thin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan(basePackages = {"com.dfm.thin.model"})
public class ThinApplication {

    public static void main(String[] args) {
        SpringApplication.run(ThinApplication.class, args);
    }

}
