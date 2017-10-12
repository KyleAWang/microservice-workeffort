package com.kyle.microservices.controllers;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kyle.microservices.beans.*;
import com.kyle.microservices.service.WorkEffortEventsByPeriodService;
import com.kyle.microservices.service.WorkEffortService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kyle on 6/26/2017.
 */
@Controller
@Api(value = "workEffort", description = "Operations on work effort")
public class WorkEffortController {
    private Logger logger = Logger.getLogger(WorkEffortController.class.getName());

    @Autowired
    private WorkEffortService workEffortService;

    @Autowired
    private WorkEffortEventsByPeriodService workEffortEventsByPeriodService;

    @ApiOperation(value = "Find work efforts", response = WorkEfforts.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved list"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    })
    @RequestMapping(value = "/getworkefforts", method = RequestMethod.POST, consumes = "application/json")
    public ResponseEntity getWorkEfforts(@RequestBody(required = false) SearchOptionsRequest searchOptionsRequest) {
        WorkEfforts workEfforts = new WorkEfforts();
        try {
            workEfforts.setWorkEfforts(workEffortService.getWorkEfforts(searchOptionsRequest));
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

    @ApiOperation(value = "Get work efforts by period", response = List.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved list"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    })
    @RequestMapping(value = "/getWorkEffortEventsByPeriod", method = RequestMethod.POST, consumes = "application/json")
    public ResponseEntity getWorkEffortEventsByPeriod(@RequestBody(required = true) GetWorkEffortEventsByPeriodRequest getWorkEffortEventsByPeriodRequest) {
        String jsonString = "";
        WorkEffortEventsByPeriod workEffortEventsByPeriod = null;
        try {
            workEffortEventsByPeriod = workEffortEventsByPeriodService.getWorkEffortEventsByPeriod(getWorkEffortEventsByPeriodRequest);
        } catch (Exception e) {
            e.printStackTrace();
            new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }

        ObjectMapper mapper = new ObjectMapper();
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        try {
            jsonString = mapper.writeValueAsString(workEffortEventsByPeriod);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        return new ResponseEntity(jsonString, HttpStatus.OK);
    }
}
