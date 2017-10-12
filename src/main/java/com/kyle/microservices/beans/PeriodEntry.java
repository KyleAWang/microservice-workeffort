package com.kyle.microservices.beans;

import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * Created by Kyle on 9/25/2017.
 */
public @Data
class PeriodEntry {
    private CalendarEntries calendarEntriesByDateRange;
    private CalendarEntries calendarEntries;
    private Date start;
    private Date end;
}
