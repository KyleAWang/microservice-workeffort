package com.kyle.microservices.controllers;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.boot.test.mock.mockito.*;

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
                .willReturn(new ResponseEntity<Object>("", HttpStatus.OK));
        this.mockMvc.perform(post("/getworkefforts")
                .contentType("application/json"))
                .andExpect(status().isOk());
    }

    @Test
    public void getWorkEffortEventsByPeriod() throws Exception {
    }

}