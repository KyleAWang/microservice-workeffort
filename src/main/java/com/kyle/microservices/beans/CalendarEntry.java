package com.kyle.microservices.beans;

import lombok.Data;

import java.math.BigInteger;

/**
 * Created by Kyle on 9/25/2017.
 */
public @Data
class CalendarEntry {
    private Boolean startOfPeriod;
    private WorkEffort workEffort;
    private BigInteger periodSpan;
    private String calEntryRange;
}
