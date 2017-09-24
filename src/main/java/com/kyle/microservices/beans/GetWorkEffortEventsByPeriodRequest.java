package com.kyle.microservices.beans;

import lombok.Data;

import java.sql.Timestamp;
import java.util.List;

/**
 * Created by Kyle on 8/13/2017.
 */
public @Data class GetWorkEffortEventsByPeriodRequest {
    private String calendarType;
    private String partyId;
    private String[] partyIds;
    private String facilityId;
    private String workEffortTypeId;
    private Timestamp start;
    private Integer numPeriods;
    private Integer periodType;
    private Boolean filterOutCanceledEvents;
    private List entityExprList;
    private String username;
    private String password;
}
