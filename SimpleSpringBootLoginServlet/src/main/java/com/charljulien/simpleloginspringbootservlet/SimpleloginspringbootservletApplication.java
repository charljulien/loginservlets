package com.charljulien.simpleloginspringbootservlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SimpleloginspringbootservletApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SimpleloginspringbootservletApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(SimpleloginspringbootservletApplication.class, args);
    }

}

