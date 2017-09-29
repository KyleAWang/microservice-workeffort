/**
 * GetWorkEffortEventsByPeriodTest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.6  Built on : Jul 30, 2017 (09:08:31 BST)
 */
package com.kyle.microservices.service.axis2.workEfforts;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.math.BigInteger;
import java.util.Calendar;

/*
 *  GetWorkEffortEventsByPeriodTest Junit test case
 */
public class GetWorkEffortEventsByPeriodTest extends junit.framework.TestCase {
    /**
     * Auto generated test method
     */
    public void testgetWorkEffortEventsByPeriod() throws java.lang.Exception {
        com.kyle.microservices.service.axis2.workEfforts.GetWorkEffortEventsByPeriodStub stub =
            new com.kyle.microservices.service.axis2.workEfforts.GetWorkEffortEventsByPeriodStub(); //the default implementation should point to the right endpoint

        com.kyle.microservices.service.axis2.workEfforts.GetWorkEffortEventsByPeriodStub.GetWorkEffortEventsByPeriod getWorkEffortEventsByPeriod4 =
            (com.kyle.microservices.service.axis2.workEfforts.GetWorkEffortEventsByPeriodStub.GetWorkEffortEventsByPeriod) getTestObject(com.kyle.microservices.service.axis2.workEfforts.GetWorkEffortEventsByPeriodStub.GetWorkEffortEventsByPeriod.class);

        GetWorkEffortEventsByPeriodStub.MapMap mapMap = new GetWorkEffortEventsByPeriodStub.MapMap();

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




        GetWorkEffortEventsByPeriodStub.MapEntry[] mapEntries = new GetWorkEffortEventsByPeriodStub.MapEntry[]{mapEntry,
                calendarTypeMapEntry, numPeriodsMapEntry, periodTypeMapEntry, loginMapEntry, loginPssMapEntry};
        mapMap.setMapEntry(mapEntries);
        getWorkEffortEventsByPeriod4.setMapMap(mapMap);

        GetWorkEffortEventsByPeriodStub.GetWorkEffortEventsByPeriodResponse getWorkEffortEventsByPeriodResponse =
                stub.getWorkEffortEventsByPeriod(getWorkEffortEventsByPeriod4);

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


        assertNotNull(getWorkEffortEventsByPeriodResponse);
    }

    /**
     * Auto generated test method
     */
    public void testStartgetWorkEffortEventsByPeriod()
        throws java.lang.Exception {
        com.kyle.microservices.service.axis2.workEfforts.GetWorkEffortEventsByPeriodStub stub =
            new com.kyle.microservices.service.axis2.workEfforts.GetWorkEffortEventsByPeriodStub();
        com.kyle.microservices.service.axis2.workEfforts.GetWorkEffortEventsByPeriodStub.GetWorkEffortEventsByPeriod getWorkEffortEventsByPeriod4 =
            (com.kyle.microservices.service.axis2.workEfforts.GetWorkEffortEventsByPeriodStub.GetWorkEffortEventsByPeriod) getTestObject(com.kyle.microservices.service.axis2.workEfforts.GetWorkEffortEventsByPeriodStub.GetWorkEffortEventsByPeriod.class);
        // TODO : Fill in the getWorkEffortEventsByPeriod4 here
        stub.startgetWorkEffortEventsByPeriod(getWorkEffortEventsByPeriod4,
            new tempCallbackN1000C());
    }

    //Create an ADBBean and provide it as the test object
    public org.apache.axis2.databinding.ADBBean getTestObject(
        java.lang.Class type) throws java.lang.Exception {
        return (org.apache.axis2.databinding.ADBBean) type.newInstance();
    }

    private class tempCallbackN1000C extends com.kyle.microservices.service.axis2.workEfforts.GetWorkEffortEventsByPeriodCallbackHandler {
        public tempCallbackN1000C() {
            super(null);
        }

        public void receiveResultgetWorkEffortEventsByPeriod(
            com.kyle.microservices.service.axis2.workEfforts.GetWorkEffortEventsByPeriodStub.GetWorkEffortEventsByPeriodResponse result) {
        }

        public void receiveErrorgetWorkEffortEventsByPeriod(
            java.lang.Exception e) {
            fail();
        }
    }
}
