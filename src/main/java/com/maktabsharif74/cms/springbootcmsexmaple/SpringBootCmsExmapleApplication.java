package com.maktabsharif74.cms.springbootcmsexmaple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource(value = "classpath:cookie.properties")
public class SpringBootCmsExmapleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootCmsExmapleApplication.class, args);
    }

}
