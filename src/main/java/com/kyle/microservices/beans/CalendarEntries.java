package com.kyle.microservices.beans;

import lombok.Data;

import java.util.List;

/**
 * Created by Kyle on 9/25/2017.
 */
public @Data
class CalendarEntries {
    private String cusObj;
    private List<CalendarEntry> entries;
}
