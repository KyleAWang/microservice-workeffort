package com.kyle.microservices.service.impl;

import com.kyle.microservices.beans.SearchOptionsRequest;
import com.kyle.microservices.beans.WorkEffort;
import com.kyle.microservices.service.AbstractBusinessService;
import com.kyle.microservices.service.UserLoginService;
import com.kyle.microservices.service.WorkEffortService;
import com.kyle.microservices.service.axis2.workEfforts.GetWorkEffortsStub;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/**
 * Created by Kyle on 6/25/2017.
 */
@Service
public class WorkEffortServiceImpl extends AbstractBusinessService implements WorkEffortService{
    private final Logger logger = Logger.getLogger(WorkEffortServiceImpl.class.getName());
    private static final String WORK_EFFORT_ID = "workEffortId";

    @Autowired
    private UserLoginService userLoginService;

    public List<WorkEffort> getWorkEfforts(SearchOptionsRequest searchOptionsRequest) throws Exception {
        final String methodName = "getWorkEfforts";
//        logger.info(methodName + " starts...");
        logger.info(() -> methodName + " starts...");

        String service_endpoint = serviceProtocol + "://" + serviceHost + ":" + servicePort + "/webtools/control/SOAPService";
        logger.info("service endpoint:" + service_endpoint);

        com.kyle.microservices.service.axis2.workEfforts.GetWorkEffortsStub stub =
                new com.kyle.microservices.service.axis2.workEfforts.GetWorkEffortsStub(service_endpoint); //the default implementation should point to the right endpoint

        com.kyle.microservices.service.axis2.workEfforts.GetWorkEffortsStub.GetWorkEfforts getWorkEfforts4 =
                (com.kyle.microservices.service.axis2.workEfforts.GetWorkEffortsStub.GetWorkEfforts) getTypeObject(com.kyle.microservices.service.axis2.workEfforts.GetWorkEffortsStub.GetWorkEfforts.class);

        GetWorkEffortsStub.MapMap mapMap = new GetWorkEffortsStub.MapMap();

        List<GetWorkEffortsStub.MapEntry> listEntries = new ArrayList<>();
        if (searchOptionsRequest != null) {
            if (StringUtils.isNotEmpty(searchOptionsRequest.getWorkEffortId())) {
                GetWorkEffortsStub.MapEntry mapEntry = new GetWorkEffortsStub.MapEntry();
                GetWorkEffortsStub.MapKey mapKey = new GetWorkEffortsStub.MapKey();
                GetWorkEffortsStub.StdString_type0 stdString_type0 = new GetWorkEffortsStub.StdString_type0();
                stdString_type0.setValue(WORK_EFFORT_ID);
                mapKey.setStdString(stdString_type0);
                mapEntry.setMapKey(mapKey);

                GetWorkEffortsStub.MapValue mapValue = new GetWorkEffortsStub.MapValue();
                GetWorkEffortsStub.StdString_type0 stdString_type01 = new GetWorkEffortsStub.StdString_type0();
                stdString_type01.setValue(searchOptionsRequest.getWorkEffortId());
                mapValue.setStdString(stdString_type01);
                mapEntry.setMapValue(mapValue);

                listEntries.add(mapEntry);
            }

            if (StringUtils.isNotEmpty(searchOptionsRequest.getWorkEffortParentId())) {
                GetWorkEffortsStub.MapEntry mapEntry = new GetWorkEffortsStub.MapEntry();
                GetWorkEffortsStub.MapKey mapKey = new GetWorkEffortsStub.MapKey();
                GetWorkEffortsStub.StdString_type0 stdString_type0 = new GetWorkEffortsStub.StdString_type0();
                stdString_type0.setValue("workEffortParentId");
                mapKey.setStdString(stdString_type0);
                mapEntry.setMapKey(mapKey);

                GetWorkEffortsStub.MapValue mapValue = new GetWorkEffortsStub.MapValue();
                GetWorkEffortsStub.StdString_type0 stdString_type01 = new GetWorkEffortsStub.StdString_type0();
                stdString_type01.setValue(searchOptionsRequest.getWorkEffortParentId());
                mapValue.setStdString(stdString_type01);
                mapEntry.setMapValue(mapValue);

                listEntries.add(mapEntry);
            }
        }

        GetWorkEffortsStub.MapEntry[] mapEntries = null;
        if (listEntries.size() > 0) {
            mapEntries = listEntries.toArray(new GetWorkEffortsStub.MapEntry[listEntries.size()]);
        }
        mapMap.setMapEntry(mapEntries);
        getWorkEfforts4.setMapMap(mapMap);
        GetWorkEffortsStub.GetWorkEffortsResponse getWorkEffortsResponse = stub.getWorkEfforts(getWorkEfforts4);
        GetWorkEffortsStub.MapEntry[] entries = getWorkEffortsResponse.getMapHashMap().getMapEntry();

        List<WorkEffort> workEfforts = new ArrayList<>();

        for (GetWorkEffortsStub.MapEntry entry : entries) {
            String key = entry.getMapKey().getStdString().getValue();
            if (key.equals("workEfforts")) {
                GetWorkEffortsStub.ColCollection colLinkedList = entry.getMapValue().getColLinkedList();
                GetWorkEffortsStub.EevalWorkEffort_type0[] eevalWorkEfforts = colLinkedList.getEevalWorkEffort();

                for (GetWorkEffortsStub.EevalWorkEffort_type0 item : eevalWorkEfforts) {
                    WorkEffort workEffort = new WorkEffort();
                    convertToBean(item, workEffort);
                    workEfforts.add(workEffort);
                }
            }
        }

        logger.info(methodName + " ends...");
        return workEfforts;
    }

    private void convertToBean(GetWorkEffortsStub.EevalWorkEffort_type0 item, WorkEffort workEffort) {

        if (item.getWorkEffortId() != null)
            workEffort.setWorkEffortId(item.getWorkEffortId());
        if (item.getAccommodationMapId() != null)
            workEffort.setAccommodationMapId(item.getAccommodationMapId());
        if (item.getAccommodationSpotId() != null)
            workEffort.setAccommodationSpotId(item.getAccommodationSpotId());
        if (item.getActualCompletionDate() != null)
            workEffort.setActualCompletionDate(item.getActualCompletionDate());
        if (item.getActualMilliSeconds() > 0)
            workEffort.setActualMilliSeconds(item.getActualMilliSeconds());
        if (item.getActualSetupMillis() > 0)
            workEffort.setActualSetupMillis(item.getActualSetupMillis());
        if (item.getActualStartDate() != null)
            workEffort.setActualStartDate(item.getActualStartDate());
        if (item.getCreatedByUserLogin() != null)
            workEffort.setCreatedByUserLogin(item.getCreatedByUserLogin());
        if (item.getCreatedDate() != null)
            workEffort.setCreatedDate(item.getCreatedDate());
        if (item.getCreatedStamp() != null)
            workEffort.setCreatedStamp(item.getCreatedStamp());
        if (item.getCreatedTxStamp() != null)
            workEffort.setCreatedTxStamp(item.getCreatedTxStamp());
        if (item.getCurrentStatusId() != null)
            workEffort.setCurrentStatusId(item.getCurrentStatusId());
        if (item.getDescription() != null)
            workEffort.setDescription(item.getDescription());
        if (item.getEstimateCalcMethod() != null)
            workEffort.setEstimateCalcMethod(item.getEstimateCalcMethod());
        if (item.getEstimatedCompletionDate() != null)
            workEffort.setEstimatedCompletionDate(item.getEstimatedCompletionDate());
        if (item.getEstimatedMilliSeconds() > 0)
            workEffort.setEstimatedMilliSeconds(item.getEstimatedMilliSeconds());
        if (item.getEstimatedSetupMillis() > 0)
            workEffort.setEstimatedSetupMillis(item.getEstimatedSetupMillis());
        if (item.getEstimatedStartDate() != null)
            workEffort.setEstimatedStartDate(item.getEstimatedStartDate());
        if (item.getFacilityId() != null)
            workEffort.setFacilityId(item.getFacilityId());
        if (item.getFixedAssetId() != null)
            workEffort.setFixedAssetId(item.getFixedAssetId());
        if (item.getInfoUrl() != null)
            workEffort.setInfoUrl(item.getInfoUrl());
        if (item.getLastModifiedByUserLogin() != null)
            workEffort.setLastModifiedByUserLogin(item.getLastModifiedByUserLogin());
        if (item.getLastModifiedDate() != null)
            workEffort.setLastModifiedDate(item.getLastModifiedDate());
        if (item.getLastStatusUpdate() != null)
            workEffort.setLastStatusUpdate(item.getLastStatusUpdate());

        if (item.getLastUpdatedStamp() != null)
            workEffort.setLastUpdatedStamp(item.getLastUpdatedStamp());
        if (item.getLastUpdatedTxStamp() != null)
            workEffort.setLastUpdatedTxStamp(item.getLastUpdatedTxStamp());
        if (item.getLocationDesc() != null)
            workEffort.setLocationDesc(item.getLocationDesc());
        if (item.getMoneyUomId() != null)
            workEffort.setMoneyUomId(item.getMoneyUomId());
        if (item.getNoteId() != null)
            workEffort.setNoteId(item.getNoteId());
        if (item.getPriority() > 0) {
            workEffort.setPriority(item.getPriority());
        }
        if (item.getPercentComplete() > 0)
            workEffort.setPercentComplete(item.getPercentComplete());
        if (item.getLastStatusUpdate() != null)
            workEffort.setLastStatusUpdate(item.getLastStatusUpdate());

    }

    //Create an ADBBean and provide it as the test object
    private org.apache.axis2.databinding.ADBBean getTypeObject(
            java.lang.Class type) throws java.lang.Exception {
        return (org.apache.axis2.databinding.ADBBean) type.newInstance();
    }
}
