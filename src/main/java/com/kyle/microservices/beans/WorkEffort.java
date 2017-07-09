package com.kyle.microservices.beans;

import lombok.Data;


/**
 * Created by Kyle on 7/9/2017.
 */
public @Data class WorkEffort {
    private String workEffortId;
    private String workEffortTypeId;
    private String currentStatusId;
    private String lastStatusUpdate;
    private String workEffortPurposeTypeId;
    private String workEffortParentId;
    private String scopeEnumId;
    private Long priority;
    private Long percentComplete;
    private String workEffortName;
    private String showAsEnumId;
    private String sendNotificationEmail;
    private String description;
    private String locationDesc;
    private String estimatedStartDate;
    private String estimatedCompletionDate;
    private String actualStartDate;
    private String actualCompletionDate;
    private Double estimatedMilliSeconds;
    private Double estimatedSetupMillis;
    private String estimateCalcMethod;
    private Double actualMilliSeconds;
    private Double actualSetupMillis;
    private Double totalMilliSecondsAllowed;
    private Double totalMoneyAllowed;
    private String moneyUomId;
    private String specialTerms;
    private Long timeTransparency;
    private String universalId;
    private String sourceReferenceId;
    private String fixedAssetId;
    private String facilityId;
    private String infoUrl;
    private String recurrenceInfoId;
    private String tempExprId;
    private String runtimeDataId;
    private String noteId;
    private String serviceLoaderName;
    private Double quantityToProduce;
    private Double quantityProduced;
    private Double quantityRejected;
    private Double reservPersons;
    private Double reserv2ndPPPerc;
    private Double reservNthPPPerc;
    private String accommodationMapId;
    private String accommodationSpotId;
    private Long revisionNumber;
    private String createdDate;
    private String createdByUserLogin;
    private String lastModifiedDate;
    private String lastModifiedByUserLogin;
    private String lastUpdatedStamp;
    private String createdStamp;
    private String createdTxStamp;
    private Long sequenceNum;
    private String lastUpdatedTxStamp;
}
