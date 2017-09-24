package com.kyle.microservices.service;

import com.kyle.microservices.WorkEffortServer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Created by Kyle on 9/24/2017.
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {WorkEffortServer.class})
public class WorkEffortEventsByPeriodServiceTest {
    @Autowired
    private WorkEffortEventsByPeriodService workEffortEventsByPeriodService;

    @Test
    public void getWorkEffortEventsByPeriod() throws Exception {
    }

}