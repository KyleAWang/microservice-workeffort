package com.kyle.microservices.service;

import com.kyle.microservices.WorkEffortServer;
import com.kyle.microservices.beans.WorkEffort;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertNotNull;

/**
 * Created by Kyle on 9/24/2017.
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {WorkEffortServer.class})
public class WorkEffortServiceTest {
    @Autowired
    private WorkEffortService workEffortService;

    @Test
    public void getWorkEfforts() throws Exception {
        List<WorkEffort> workEfforts = workEffortService.getWorkEfforts(null);

        assertNotNull(workEfforts);
    }

}