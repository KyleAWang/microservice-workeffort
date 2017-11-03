package com.kyle.microservices.service.impl;

import com.kyle.microservices.beans.*;
import com.kyle.microservices.service.AbstractBusinessService;
import com.kyle.microservices.service.UserLoginService;
import com.kyle.microservices.service.WorkEffortEventsByPeriodService;
import com.kyle.microservices.service.axis2.workEfforts.GetWorkEffortEventsByPeriodStub;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Logger;

/**
 * Created by Kyle on 9/24/2017.
 */
@Service
public class WorkEffortEventsByPeriodServiceImpl extends AbstractBusinessService implements WorkEffortEventsByPeriodService{
    private final Logger logger = Logger.getLogger(WorkEffortEventsByPeriodServiceImpl.class.getName());
//    @Value("${business.endpoint.host}")
//    private String serviceHost;
//    @Value("${business.endpoint.port}")
//    private String servicePort;
//    @Value("${business.endpoint.protocol}")
//    private String serviceProtocol;

    @Autowired
    private UserLoginService userLoginService;

    public WorkEffortEventsByPeriod getWorkEffortEventsByPeriod(GetWorkEffortEventsByPeriodRequest periodRequest) throws Exception {
        return getWorkEffortEventsByPeriod(periodRequest, null);
    }


    public WorkEffortEventsByPeriod getWorkEffortEventsByPeriod(GetWorkEffortEventsByPeriodRequest periodRequest, String serviceUrl) throws Exception {
        return getWorkEffortEventsByPeriod(periodRequest, serviceUrl, null);
    }

    public WorkEffortEventsByPeriod getWorkEffortEventsByPeriod(GetWorkEffortEventsByPeriodRequest periodRequest, String serviceUrl, String businessServiceUrl) throws Exception {
        final String methodName = "getWorkEffortEventsByPeriod";
        logger.info(methodName + " starts...");

        StringBuilder sb = new StringBuilder();

        if (StringUtils.isNotEmpty(serviceUrl)) {
            sb.append(serviceUrl);
        } else {
            sb.append(serviceProtocol).append("://").append(serviceHost).append(":").append(servicePort);
        }
        sb.append("/webtools/control/SOAPService");

        com.kyle.microservices.service.axis2.workEfforts.GetWorkEffortEventsByPeriodStub stub =
                new com.kyle.microservices.service.axis2.workEfforts.GetWorkEffortEventsByPeriodStub(sb.toString()); //the default implementation should point to the right endpoint

        com.kyle.microservices.service.axis2.workEfforts.GetWorkEffortEventsByPeriodStub.GetWorkEffortEventsByPeriod getWorkEffortEventsByPeriod4 =
                (com.kyle.microservices.service.axis2.workEfforts.GetWorkEffortEventsByPeriodStub.GetWorkEffortEventsByPeriod) getTypeObject(com.kyle.microservices.service.axis2.workEfforts.GetWorkEffortEventsByPeriodStub.GetWorkEffortEventsByPeriod.class);

        GetWorkEffortEventsByPeriodStub.MapMap mapMap = new GetWorkEffortEventsByPeriodStub.MapMap();

        List<GetWorkEffortEventsByPeriodStub.MapEntry> listEntries = new ArrayList<>();
        if (periodRequest != null) {
            if (periodRequest.getFilterOutCanceledEvents() != null) {

            }
            if (periodRequest.getCalendarType() != null) {
                GetWorkEffortEventsByPeriodStub.MapEntry calendarTypeMapEntry = new GetWorkEffortEventsByPeriodStub.MapEntry();

                GetWorkEffortEventsByPeriodStub.MapKey calendarTypeMapKey = new GetWorkEffortEventsByPeriodStub.MapKey();
                GetWorkEffortEventsByPeriodStub.StdString_type0 calendarTypeKey = new GetWorkEffortEventsByPeriodStub.StdString_type0();
                calendarTypeKey.setValue("calendarType");
                calendarTypeMapKey.setStdString(calendarTypeKey);
                calendarTypeMapEntry.setMapKey(calendarTypeMapKey);

                GetWorkEffortEventsByPeriodStub.MapValue calndarTypeMapValue = new GetWorkEffortEventsByPeriodStub.MapValue();
                GetWorkEffortEventsByPeriodStub.StdString_type0 calendarTypeValue = new GetWorkEffortEventsByPeriodStub.StdString_type0();
                calendarTypeValue.setValue("CAL_PERSONAL");
                calndarTypeMapValue.setStdString(calendarTypeValue);
                calendarTypeMapEntry.setMapValue(calndarTypeMapValue);
                listEntries.add(calendarTypeMapEntry);

            }
            if (periodRequest.getEntityExprList() != null) {

            }
            if (periodRequest.getFacilityId() != null) {

            }
            if (periodRequest.getNumPeriods() != null) {
                GetWorkEffortEventsByPeriodStub.MapEntry numPeriodsMapEntry = new GetWorkEffortEventsByPeriodStub.MapEntry();

                GetWorkEffortEventsByPeriodStub.MapKey numPeriodsMapKey = new GetWorkEffortEventsByPeriodStub.MapKey();
                GetWorkEffortEventsByPeriodStub.StdString_type0 numPeriodsKey = new GetWorkEffortEventsByPeriodStub.StdString_type0();
                numPeriodsKey.setValue("numPeriods");
                numPeriodsMapKey.setStdString(numPeriodsKey);
                numPeriodsMapEntry.setMapKey(numPeriodsMapKey);

                GetWorkEffortEventsByPeriodStub.MapValue numPeriodsMapValue = new GetWorkEffortEventsByPeriodStub.MapValue();
                GetWorkEffortEventsByPeriodStub.StdInteger_type0 numPeriodsValue = new GetWorkEffortEventsByPeriodStub.StdInteger_type0();
                numPeriodsValue.setValue(new BigInteger("35"));
                numPeriodsMapValue.setStdInteger(numPeriodsValue);
                numPeriodsMapEntry.setMapValue(numPeriodsMapValue);
                listEntries.add(numPeriodsMapEntry);

            }
            if (periodRequest.getPartyId() != null) {

            }
            if (periodRequest.getPartyIds() != null) {

            }
            if (periodRequest.getPeriodType() != null) {
                GetWorkEffortEventsByPeriodStub.MapEntry periodTypeMapEntry = new GetWorkEffortEventsByPeriodStub.MapEntry();

                GetWorkEffortEventsByPeriodStub.MapKey periodTypeMapKey = new GetWorkEffortEventsByPeriodStub.MapKey();
                GetWorkEffortEventsByPeriodStub.StdString_type0 periodTypeKey = new GetWorkEffortEventsByPeriodStub.StdString_type0();
                periodTypeKey.setValue("periodType");
                periodTypeMapKey.setStdString(periodTypeKey);
                periodTypeMapEntry.setMapKey(periodTypeMapKey);

                GetWorkEffortEventsByPeriodStub.MapValue periodTypeMapValue = new GetWorkEffortEventsByPeriodStub.MapValue();
                GetWorkEffortEventsByPeriodStub.StdInteger_type0 periodTypeValue = new GetWorkEffortEventsByPeriodStub.StdInteger_type0();
                periodTypeValue.setValue(new BigInteger("5"));
                periodTypeMapValue.setStdInteger(periodTypeValue);
                periodTypeMapEntry.setMapValue(periodTypeMapValue);
                listEntries.add(periodTypeMapEntry);

            }
            if (periodRequest.getStart() != null) {

                GetWorkEffortEventsByPeriodStub.MapEntry mapEntry = new GetWorkEffortEventsByPeriodStub.MapEntry();
                GetWorkEffortEventsByPeriodStub.MapKey mapKey = new GetWorkEffortEventsByPeriodStub.MapKey();
                GetWorkEffortEventsByPeriodStub.StdString_type0 startKey = new GetWorkEffortEventsByPeriodStub.StdString_type0();
                startKey.setValue("start");
                mapKey.setStdString(startKey);
                mapEntry.setMapKey(mapKey);

                GetWorkEffortEventsByPeriodStub.MapValue mapValue = new GetWorkEffortEventsByPeriodStub.MapValue();
                GetWorkEffortEventsByPeriodStub.SqlTimestamp_type0 startValue = new GetWorkEffortEventsByPeriodStub.SqlTimestamp_type0();
                Calendar startCal = Calendar.getInstance();
                startCal.set(2017, 07, 23, 0, 0, 0);
                startValue.setValue(startCal);
                mapValue.setSqlTimestamp(startValue);
                mapValue.setSqlTimestamp(startValue);
                mapEntry.setMapValue(mapValue);
                listEntries.add(mapEntry);

            }
            if (periodRequest.getWorkEffortTypeId() != null) {

            }
            UserLogin userLogin = null;
            if (StringUtils.isNotEmpty(businessServiceUrl)) {
                userLogin = userLoginService.getUserLogin(periodRequest.getUserLoginId(), businessServiceUrl);
            } else {
                userLogin = userLoginService.getUserLogin(periodRequest.getUserLoginId());
            }
            if (periodRequest.getUserLoginId() != null) {
                if (userLogin != null) {

                    GetWorkEffortEventsByPeriodStub.MapEntry loginMapEntry = new GetWorkEffortEventsByPeriodStub.MapEntry();

                    GetWorkEffortEventsByPeriodStub.MapKey loginMapKey = new GetWorkEffortEventsByPeriodStub.MapKey();
                    GetWorkEffortEventsByPeriodStub.StdString_type0 loginKey = new GetWorkEffortEventsByPeriodStub.StdString_type0();
                    loginKey.setValue("login.username");
                    loginMapKey.setStdString(loginKey);
                    loginMapEntry.setMapKey(loginMapKey);

                    GetWorkEffortEventsByPeriodStub.MapValue loginMapValue = new GetWorkEffortEventsByPeriodStub.MapValue();
                    GetWorkEffortEventsByPeriodStub.StdString_type0 loginValue = new GetWorkEffortEventsByPeriodStub.StdString_type0();
                    loginValue.setValue(userLogin.getUserLoginId());
                    loginMapValue.setStdString(loginValue);
                    loginMapEntry.setMapValue(loginMapValue);
                    listEntries.add(loginMapEntry);


                    GetWorkEffortEventsByPeriodStub.MapEntry loginPssMapEntry = new GetWorkEffortEventsByPeriodStub.MapEntry();

                    GetWorkEffortEventsByPeriodStub.MapKey loginPssMapKey = new GetWorkEffortEventsByPeriodStub.MapKey();
                    GetWorkEffortEventsByPeriodStub.StdString_type0 loginPssKey = new GetWorkEffortEventsByPeriodStub.StdString_type0();
                    loginPssKey.setValue("login.password");
                    loginPssMapKey.setStdString(loginPssKey);
                    loginPssMapEntry.setMapKey(loginPssMapKey);

                    GetWorkEffortEventsByPeriodStub.MapValue loginPssMapValue = new GetWorkEffortEventsByPeriodStub.MapValue();
                    GetWorkEffortEventsByPeriodStub.StdString_type0 loginPssValue = new GetWorkEffortEventsByPeriodStub.StdString_type0();
                    loginPssValue.setValue(userLogin.getPassword());
                    loginPssMapValue.setStdString(loginPssValue);
                    loginPssMapEntry.setMapValue(loginPssMapValue);
                    listEntries.add(loginPssMapEntry);
                }
            }
        }

        GetWorkEffortEventsByPeriodStub.MapEntry[] mapEntries = null;
        if (listEntries.size() > 0) {
            mapEntries = listEntries.toArray(new GetWorkEffortEventsByPeriodStub.MapEntry[listEntries.size()]);
        }
        mapMap.setMapEntry(mapEntries);
        getWorkEffortEventsByPeriod4.setMapMap(mapMap);

        GetWorkEffortEventsByPeriodStub.GetWorkEffortEventsByPeriodResponse getWorkEffortEventsByPeriodResponse =
                stub.getWorkEffortEventsByPeriod(getWorkEffortEventsByPeriod4);

        GetWorkEffortEventsByPeriodStub.MapEntry[] entries = getWorkEffortEventsByPeriodResponse.getMapHashMap().getMapEntry();

        WorkEffortEventsByPeriod workEffortEventsByPeriod = new WorkEffortEventsByPeriod();

        for (int i = 0; i < entries.length; i++) {
            if (entries[i].getMapKey().getStdString().getValue().equals("maxConcurrentEntries")) {
                workEffortEventsByPeriod.setMaxConcurrentEntries(entries[i].getMapValue().getStdInteger().getValue());
            } else if (entries[i].getMapKey().getStdString().getValue().equals("periods")) {
                GetWorkEffortEventsByPeriodStub.MapHashMap[] mapHashMaps = entries[i].getMapValue().getColLinkedList().getMapHashMap();
                List<PeriodEntry> periods = new ArrayList<>();
                workEffortEventsByPeriod.setPeriods(periods);
                for (int j = 0; j < mapHashMaps.length; j++) {
                    PeriodEntry periodEntry = new PeriodEntry();
                    for (int k = 0; k < mapHashMaps[j].getMapEntry().length; k++) {
                        GetWorkEffortEventsByPeriodStub.MapEntry mapEntryJK = mapHashMaps[j].getMapEntry()[k];
                        if (mapEntryJK.getMapKey().getStdString().getValue().equals("calendarEntriesByDateRange")) {
                            GetWorkEffortEventsByPeriodStub.MapEntry[] mapEntries1 = mapEntryJK.getMapValue().getMapTreeMap().getMapEntry();
                            for (GetWorkEffortEventsByPeriodStub.MapEntry mapEntry : mapEntries1) {
                                GetWorkEffortEventsByPeriodStub.MapHashMap[] mapHashMaps1 = mapEntry.getMapValue().getColLinkedList().getMapHashMap();
                                List<CalendarEntry> cEntries = new ArrayList();
                                for (GetWorkEffortEventsByPeriodStub.MapHashMap mapHashMap : mapHashMaps1) {
                                    CalendarEntry calendarEntry = new CalendarEntry();
                                    for (GetWorkEffortEventsByPeriodStub.MapEntry mapEntry1 : mapHashMap.getMapEntry()) {
                                        convertToCalendarEntry(mapEntry1, calendarEntry);
                                    }
                                    cEntries.add(calendarEntry);
                                }
                                CalendarEntries calendarEntriesByDateRange = new CalendarEntries();
                                calendarEntriesByDateRange.setKey(mapEntry.getMapKey().getCusObj());
                                calendarEntriesByDateRange.setCalendarEntries(cEntries);
                                periodEntry.setCalendarEntriesByDateRange(calendarEntriesByDateRange);
                            }
                        } else if (mapEntryJK.getMapKey().getStdString().getValue().equals("calendarEntries")) {
                            GetWorkEffortEventsByPeriodStub.MapHashMap[] mapHashMaps1 = mapEntryJK.getMapValue().getColLinkedList().getMapHashMap();
                            List<CalendarEntry> cEntries = new ArrayList<>();
                            for (GetWorkEffortEventsByPeriodStub.MapHashMap mapHashMap : mapHashMaps1){
                                GetWorkEffortEventsByPeriodStub.MapEntry[] mapEntries2 = mapHashMap.getMapEntry();
                                CalendarEntry calendarEntry = new CalendarEntry();
                                for (GetWorkEffortEventsByPeriodStub.MapEntry mapEntry : mapEntries2) {
                                    convertToCalendarEntry(mapEntry, calendarEntry);
                                }
                                cEntries.add(calendarEntry);
                            }
                            CalendarEntries calendarEntries = new CalendarEntries();
                            periodEntry.setCalendarEntries(calendarEntries);
                            calendarEntries.setCalendarEntries(cEntries);
                        } else if (mapEntryJK.getMapKey().getStdString().getValue().equals("start")) {
                            periodEntry.setStart(mapEntryJK.getMapValue().getSqlTimestamp().getValue().getTime());
                        } else if (mapEntryJK.getMapKey().getStdString().getValue().equals("end")) {
                            periodEntry.setEnd(mapEntryJK.getMapValue().getSqlTimestamp().getValue().getTime());
                        }
                    }
                    periods.add(periodEntry);

                }
            }
        }


//        ObjectMapper mapper = new ObjectMapper();
//        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
//        mapper.setSerializationInclusion(JsonInclude.Include.NON_DEFAULT);
//        mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
//        String jsonString = "";
//        try {
//            jsonString = mapper.writeValueAsString(workEffortEventsByPeriod);
//            System.out.println(jsonString);
//        } catch (JsonProcessingException e) {
//            e.printStackTrace();
//        }


        logger.info(methodName + " ends...");
        return workEffortEventsByPeriod;
    }


    private org.apache.axis2.databinding.ADBBean getTypeObject(
            java.lang.Class type) throws java.lang.Exception {
        return (org.apache.axis2.databinding.ADBBean) type.newInstance();
    }


    private void convertToCalendarEntry(GetWorkEffortEventsByPeriodStub.MapEntry mapEntry1, CalendarEntry calendarEntry) {
        if (mapEntry1.getMapKey().getStdString().getValue().equals("startOfPeriod")) {
            calendarEntry.setStartOfPeriod(mapEntry1.getMapValue().getStdBoolean().getValue());
        } else if (mapEntry1.getMapKey().getStdString().getValue().equals("workEffort")) {
            WorkEffort workEffort = new WorkEffort();
            GetWorkEffortEventsByPeriodStub.EevalWorkEffortAndPartyAssignAndType_type0 type0 = mapEntry1.getMapValue().getEevalWorkEffortAndPartyAssignAndType();
            convertToWorkEffort(type0, workEffort);
            calendarEntry.setWorkEffort(workEffort);
        } else if (mapEntry1.getMapKey().getStdString().getValue().equals("periodSpan")) {
            calendarEntry.setPeriodSpan(mapEntry1.getMapValue().getStdInteger().getValue());
        } else if (mapEntry1.getMapKey().getStdString().getValue().equals("calEntryRange")) {
            calendarEntry.setCalEntryRange(mapEntry1.getMapValue().getCusObj());
        }
    }

    private void convertToWorkEffort(GetWorkEffortEventsByPeriodStub.EevalWorkEffortAndPartyAssignAndType_type0 item, WorkEffort workEffort) {
        if (item.getWorkEffortId() != null)
            workEffort.setWorkEffortId(item.getWorkEffortId());
        if (item.getActualStartDate() != null)
            workEffort.setActualStartDate(item.getActualStartDate());
        if (item.getCreatedByUserLogin() != null)
            workEffort.setCreatedByUserLogin(item.getCreatedByUserLogin());
        if (item.getCreatedDate() != null)
            workEffort.setCreatedDate(item.getCreatedDate());
        if (item.getDescription() != null)
            workEffort.setDescription(item.getDescription());
        if (item.getEstimatedCompletionDate() != null)
            workEffort.setEstimatedCompletionDate(item.getEstimatedCompletionDate());
        if (item.getEstimatedMilliSeconds() > 0)
            workEffort.setEstimatedMilliSeconds(item.getEstimatedMilliSeconds());
        if (item.getEstimatedStartDate() != null)
            workEffort.setEstimatedStartDate(item.getEstimatedStartDate());
        if (item.getLastModifiedByUserLogin() != null)
            workEffort.setLastModifiedByUserLogin(item.getLastModifiedByUserLogin());
        if (item.getLastModifiedDate() != null)
            workEffort.setLastModifiedDate(item.getLastModifiedDate());
        if (item.getLastStatusUpdate() != null)
            workEffort.setLastStatusUpdate(item.getLastStatusUpdate());
        if (item.getLastStatusUpdate() != null)
            workEffort.setLastStatusUpdate(item.getLastStatusUpdate());
    }
}
