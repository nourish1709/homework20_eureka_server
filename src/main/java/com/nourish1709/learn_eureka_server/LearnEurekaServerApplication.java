package com.nourish1709.learn_eureka_server;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class LearnEurekaServerApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(LearnEurekaServerApplication.class).run(args);
    }

}
