package com.kyle.microservices.controllers;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kyle.microservices.beans.GetWorkEffortEventsByPeriodRequest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by Kyle on 9/24/2017.
 */

@RunWith(SpringRunner.class)
@WebMvcTest(WorkEffortController.class)
public class WorkEffortControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private WorkEffortController workEffortController;


    @Test
    public void getWorkEfforts() throws Exception {
        given(this.workEffortController.getWorkEfforts(null))
                .willReturn(new ResponseEntity("", HttpStatus.OK));
        this.mockMvc.perform(post("/getworkefforts")
                .contentType("application/json"))
                .andExpect(status().isOk());
    }

    @Test
    public void getWorkEffortEventsByPeriod() throws Exception {
        GetWorkEffortEventsByPeriodRequest getWorkEffortEventsByPeriodRequest = new GetWorkEffortEventsByPeriodRequest();
        getWorkEffortEventsByPeriodRequest.setCalendarType("CAL_PERSONAL");
        ObjectMapper mapper = new ObjectMapper();
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        String json = mapper.writeValueAsString(getWorkEffortEventsByPeriodRequest);
        given(this.workEffortController.getWorkEffortEventsByPeriod(getWorkEffortEventsByPeriodRequest))
                .willReturn(new ResponseEntity("", HttpStatus.OK));
        this.mockMvc.perform(post("/getWorkEffortEventsByPeriod")
                .param("body", "{\"calendarType\":\"CAL_PERSONAL\"}")
                .contentType("application/json"))
                .andExpect(status().isOk());
    }

}