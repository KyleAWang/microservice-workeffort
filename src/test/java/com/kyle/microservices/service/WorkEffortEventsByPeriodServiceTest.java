package com.kyle.microservices.service;

import com.kyle.microservices.WorkEffortServer;
import com.kyle.microservices.beans.GetWorkEffortEventsByPeriodRequest;
import com.kyle.microservices.beans.WorkEffortEventsByPeriod;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Timestamp;
import java.util.Calendar;

import static org.junit.Assert.*;

/**
 * Created by Kyle on 9/24/2017.
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {WorkEffortServer.class})
public class WorkEffortEventsByPeriodServiceTest {
    @Autowired
    private WorkEffortEventsByPeriodService workEffortEventsByPeriodService;

    
//    {
//        "calendarType": "CAL_PERSONAL",
//            "numPeriods":35,
//            "password": "ofbiz",
//            "periodType": 5,
//            "start": "2017-09-23",
//            "username": "admin",
//            "workEffortTypeId": "string"
//    }
    @Test
    public void getWorkEffortEventsByPeriod() throws Exception {
        GetWorkEffortEventsByPeriodRequest request = new GetWorkEffortEventsByPeriodRequest();
        request.setUsername("admin");
        request.setPassword("ofbiz");
        request.setCalendarType("CAL_PERSONAL");
        request.setNumPeriods(35);
        request.setPeriodType(5);
        Calendar startCal = Calendar.getInstance();
        startCal.set(2017, 07, 23, 0, 0, 0);
        request.setStart(new Timestamp(startCal.getTimeInMillis()));

        WorkEffortEventsByPeriod workEffortEventsByPeriod = workEffortEventsByPeriodService.getWorkEffortEventsByPeriod(request);

        assertNotNull(workEffortEventsByPeriod);
    }


}