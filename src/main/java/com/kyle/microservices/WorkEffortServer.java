package com.kyle.microservices;

import com.kyle.microservices.beans.UserLogin;
import com.kyle.microservices.controllers.WorkEffortController;
import com.kyle.microservices.service.UserLoginService;
import com.kyle.microservices.service.WorkEffortEventsByPeriodService;
import com.kyle.microservices.service.WorkEffortService;
import com.kyle.microservices.service.impl.UserLoginServiceImpl;
import com.kyle.microservices.service.impl.WorkEffortEventsByPeriodServiceImpl;
import com.kyle.microservices.service.impl.WorkEffortServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import java.util.logging.Logger;

/**
 * Created by Kyle on 6/25/2017.
 */
@EnableAutoConfiguration
@EnableDiscoveryClient
@SpringBootApplication
public class WorkEffortServer {
    private static Logger logger = Logger.getLogger(WorkEffortServer.class.getName());

    public static void main(String[] args) {
        SpringApplication.run(WorkEffortServer.class, args);
    }

    @Bean
    public WorkEffortService workEffortService() {
        return new WorkEffortServiceImpl();
    }
    @Bean
    public WorkEffortEventsByPeriodService workEffortEventsByPeriodService() { return new WorkEffortEventsByPeriodServiceImpl(); }

    @Bean
    public WorkEffortController workEffortController() {
        return new WorkEffortController();
    }

    @Bean
    public UserLoginService userLoginService() { return new UserLoginServiceImpl(); }

}
