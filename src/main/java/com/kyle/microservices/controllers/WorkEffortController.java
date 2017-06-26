package com.kyle.microservices.controllers;

import com.kyle.microservices.service.WorkEffortService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Kyle on 6/26/2017.
 */
@Controller
public class WorkEffortController {

    @Autowired
    private WorkEffortService workEffortService;

    @RequestMapping(value = "/getworkefforts", method = RequestMethod.GET)
    public ResponseEntity getWorkEfforts (Model model) {
        workEffortService.getWorkEfforts();
        return new ResponseEntity<Object>("getWorkEfforts", HttpStatus.OK);
    }
}
