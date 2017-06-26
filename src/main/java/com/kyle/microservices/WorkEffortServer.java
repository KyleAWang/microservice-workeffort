package com.kyle.microservices;

import com.kyle.microservices.controllers.WorkEffortController;
import com.kyle.microservices.service.WorkEffortService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

/**
 * Created by Kyle on 6/25/2017.
 */
@EnableAutoConfiguration
@EnableDiscoveryClient
public class WorkEffortServer {

    public static void main(String[] args) {
        System.setProperty("spring.config.name", "workeffort-server");

        SpringApplication.run(WorkEffortServer.class, args);
    }

    @Bean
    public WorkEffortService workEffortService() {
        return new WorkEffortService();
    }

    @Bean
    public WorkEffortController workEffortController() {
        return new WorkEffortController();
    }
}
