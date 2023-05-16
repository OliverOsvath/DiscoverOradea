package com.sda.discover.oradea;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class DiscoverOradeaApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(DiscoverOradeaApplication.class)
                .run(args);
    }
}