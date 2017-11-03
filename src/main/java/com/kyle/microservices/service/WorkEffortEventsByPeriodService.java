package com.kyle.microservices.service;

import com.kyle.microservices.beans.GetWorkEffortEventsByPeriodRequest;
import com.kyle.microservices.beans.WorkEffortEventsByPeriod;

public interface WorkEffortEventsByPeriodService {
    WorkEffortEventsByPeriod getWorkEffortEventsByPeriod(GetWorkEffortEventsByPeriodRequest periodRequest) throws Exception;
    WorkEffortEventsByPeriod getWorkEffortEventsByPeriod(GetWorkEffortEventsByPeriodRequest periodRequest, String serviceUrl) throws Exception;
    WorkEffortEventsByPeriod getWorkEffortEventsByPeriod(GetWorkEffortEventsByPeriodRequest periodRequest, String serviceUrl, String businessServiceUrl) throws Exception;
}
