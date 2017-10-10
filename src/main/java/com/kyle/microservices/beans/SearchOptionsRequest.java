package com.kyle.microservices.beans;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Created by Kyle on 8/13/2017.
 */
public @Data class SearchOptionsRequest {
    @ApiModelProperty(notes = "The work effort unique ID")
    private String workEffortId;
    @ApiModelProperty(notes = "The work effort's parent unique ID")
    private String workEffortParentId;
    @ApiModelProperty(notes = "The type ID of work effort")
    private String[] workEffortTypeId;
    @ApiModelProperty(notes = "The purpose type ID of work effort")
    private String[] workEffortPurposeTypeId;
    @ApiModelProperty(notes = "The current status of work effort")
    private String[] currentStatusId;
}
