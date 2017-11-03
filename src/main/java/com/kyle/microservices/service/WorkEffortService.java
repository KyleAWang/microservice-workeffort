package com.kyle.microservices.service;

import com.kyle.microservices.beans.SearchOptionsRequest;
import com.kyle.microservices.beans.WorkEffort;

import java.util.List;

public interface WorkEffortService {
    List<WorkEffort> getWorkEfforts(SearchOptionsRequest searchOptionsRequest) throws Exception;

}
