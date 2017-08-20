package com.kyle.microservices.controllers;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kyle.microservices.beans.SearchOptionsRequest;
import com.kyle.microservices.beans.WorkEffort;
import com.kyle.microservices.service.WorkEffortService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by Kyle on 6/26/2017.
 */
@Controller
public class WorkEffortController {
    private Logger logger = Logger.getLogger(WorkEffortController.class.getName());

    @Autowired
    private WorkEffortService workEffortService;

    @RequestMapping(value = "/getworkefforts", method = RequestMethod.POST, consumes = "application/json")
    public ResponseEntity getWorkEfforts (@RequestBody(required = false) SearchOptionsRequest searchOptionsRequest) {
        List<WorkEffort> workEfforts = null;
        try {
            workEfforts = workEffortService.getWorkEfforts(searchOptionsRequest);
        } catch (Exception e) {
            e.printStackTrace();
        }

        ObjectMapper mapper = new ObjectMapper();
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        String jsonString = "";
        try {
            jsonString = mapper.writeValueAsString(workEfforts);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        return new ResponseEntity<Object>(jsonString, HttpStatus.OK);
    }
}
