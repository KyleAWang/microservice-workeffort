package com.kyle.microservices.beans;

import lombok.Data;

import java.math.BigInteger;
import java.util.List;

/**
 * Created by Kyle on 9/25/2017.
 */
public @Data class WorkEffortEventsByPeriod {
    private BigInteger maxConcurrentEntries;
    private List<PeriodEntry> periods;
}

