package com.kyle.microservices.beans;

import lombok.Data;

/**
 * Created by Kyle on 8/13/2017.
 */
public @Data class SearchOptionsRequest {
    private String workEffortId;
    private String workEffortParentId;
    private String[] workEffortTypeId;
    private String[] workEffortPurposeTypeId;
    private String[] currentStatusId;
}
