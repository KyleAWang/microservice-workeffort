package com.kyle.microservices.service;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.kyle.microservices.beans.*;
import com.kyle.microservices.service.axis2.workEfforts.GetWorkEffortEventsByPeriodStub;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Logger;

/**
 * Created by Kyle on 9/24/2017.
 */
public class WorkEffortEventsByPeriodService {
    private Logger logger = Logger.getLogger(WorkEffortEventsByPeriodService.class.getName());

    public String getWorkEffortEventsByPeriod(GetWorkEffortEventsByPeriodRequest periodRequest) throws Exception {

        com.kyle.microservices.service.axis2.workEfforts.GetWorkEffortEventsByPeriodStub stub =
                new com.kyle.microservices.service.axis2.workEfforts.GetWorkEffortEventsByPeriodStub(); //the default implementation should point to the right endpoint

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
            if (periodRequest.getUsername() != null) {
                GetWorkEffortEventsByPeriodStub.MapEntry loginMapEntry = new GetWorkEffortEventsByPeriodStub.MapEntry();

                GetWorkEffortEventsByPeriodStub.MapKey loginMapKey = new GetWorkEffortEventsByPeriodStub.MapKey();
                GetWorkEffortEventsByPeriodStub.StdString_type0 loginKey = new GetWorkEffortEventsByPeriodStub.StdString_type0();
                loginKey.setValue("login.username");
                loginMapKey.setStdString(loginKey);
                loginMapEntry.setMapKey(loginMapKey);

                GetWorkEffortEventsByPeriodStub.MapValue loginMapValue = new GetWorkEffortEventsByPeriodStub.MapValue();
                GetWorkEffortEventsByPeriodStub.StdString_type0 loginValue = new GetWorkEffortEventsByPeriodStub.StdString_type0();
                loginValue.setValue("admin");
                loginMapValue.setStdString(loginValue);
                loginMapEntry.setMapValue(loginMapValue);
                listEntries.add(loginMapEntry);

            }
            if (periodRequest.getPassword() != null) {

                GetWorkEffortEventsByPeriodStub.MapEntry loginPssMapEntry = new GetWorkEffortEventsByPeriodStub.MapEntry();

                GetWorkEffortEventsByPeriodStub.MapKey loginPssMapKey = new GetWorkEffortEventsByPeriodStub.MapKey();
                GetWorkEffortEventsByPeriodStub.StdString_type0 loginPssKey = new GetWorkEffortEventsByPeriodStub.StdString_type0();
                loginPssKey.setValue("login.password");
                loginPssMapKey.setStdString(loginPssKey);
                loginPssMapEntry.setMapKey(loginPssMapKey);

                GetWorkEffortEventsByPeriodStub.MapValue loginPssMapValue = new GetWorkEffortEventsByPeriodStub.MapValue();
                GetWorkEffortEventsByPeriodStub.StdString_type0 loginPssValue = new GetWorkEffortEventsByPeriodStub.StdString_type0();
                loginPssValue.setValue("ofbiz");
                loginPssMapValue.setStdString(loginPssValue);
                loginPssMapEntry.setMapValue(loginPssMapValue);
                listEntries.add(loginPssMapEntry);
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
                for (int j = 0; j < mapHashMaps.length; j++) {
                    for (int k = 0; k < mapHashMaps[j].getMapEntry().length; k++) {
                        GetWorkEffortEventsByPeriodStub.MapEntry mapEntryJK = mapHashMaps[j].getMapEntry()[k];
                        if (mapEntryJK.getMapKey().getStdString().getValue().equals("calendarEntriesByDateRange")) {
                            GetWorkEffortEventsByPeriodStub.MapEntry[] mapEntries1 = mapEntryJK.getMapValue().getMapTreeMap().getMapEntry();
                            for (GetWorkEffortEventsByPeriodStub.MapEntry mapEntry : mapEntries1) {
                                CalendarEntries calendarEntries = new CalendarEntries();
                                calendarEntries.setKey(mapEntry.getMapKey().getCusObj());
                                GetWorkEffortEventsByPeriodStub.MapHashMap[] mapHashMaps1 = mapEntry.getMapValue().getColLinkedList().getMapHashMap();
                                for (GetWorkEffortEventsByPeriodStub.MapHashMap mapHashMap : mapHashMaps1) {
                                    for (GetWorkEffortEventsByPeriodStub.MapEntry mapEntry1 : mapHashMap.getMapEntry()) {
                                        CalendarEntry calendarEntry = new CalendarEntry();
                                        if (mapEntry1.getMapKey().getStdString().equals("startOfPeriod")) {
                                            calendarEntry.setStartOfPeriod(mapEntry1.getMapValue().getStdBoolean().getValue());
                                        }else if (mapEntry1.getMapKey().getStdString().equals("workEffort")) {
                                            WorkEffort workEffort = new WorkEffort();
                                        }
                                    }
                                }
                            }
                        } else if (mapEntryJK.getMapKey().getStdString().getValue().equals("calendarEntries")) {

                        } else if (mapEntryJK.getMapKey().getStdString().getValue().equals("start")) {

                        } else if (mapEntryJK.getMapKey().getStdString().getValue().equals("end")) {

                        }
                    }

                }
            }
        }


        ObjectMapper mapper = new ObjectMapper();
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        mapper.setSerializationInclusion(JsonInclude.Include.NON_DEFAULT);
        mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
        String jsonString = "";
        try {
            jsonString = mapper.writeValueAsString(getWorkEffortEventsByPeriodResponse);
            System.out.println(jsonString);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        return jsonString;
    }



    private org.apache.axis2.databinding.ADBBean getTypeObject(
            java.lang.Class type) throws java.lang.Exception {
        return (org.apache.axis2.databinding.ADBBean) type.newInstance();
    }
}
