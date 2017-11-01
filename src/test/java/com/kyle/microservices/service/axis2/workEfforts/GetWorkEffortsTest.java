/**
 * GetWorkEffortsTest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.6  Built on : Jul 30, 2017 (09:08:31 BST)
 */
package com.kyle.microservices.service.axis2.workEfforts;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.kyle.microservices.beans.WorkEffort;

/*
 *  GetWorkEffortsTest Junit test case
 */
public class GetWorkEffortsTest extends junit.framework.TestCase {
    private static final String service_endpoint = "http://192.168.20.9:8080/webtools/control/SOAPService";
    /**
     * Auto generated test method
     */
    public void testgetWorkEfforts() throws java.lang.Exception {
        com.kyle.microservices.service.axis2.workEfforts.GetWorkEffortsStub stub =
            new com.kyle.microservices.service.axis2.workEfforts.GetWorkEffortsStub(service_endpoint); //the default implementation should point to the right endpoint

        com.kyle.microservices.service.axis2.workEfforts.GetWorkEffortsStub.GetWorkEfforts getWorkEfforts4 =
            (com.kyle.microservices.service.axis2.workEfforts.GetWorkEffortsStub.GetWorkEfforts) getTestObject(com.kyle.microservices.service.axis2.workEfforts.GetWorkEffortsStub.GetWorkEfforts.class);

        GetWorkEffortsStub.MapMap mapMap = new GetWorkEffortsStub.MapMap();
        GetWorkEffortsStub.MapEntry mapEntry = new GetWorkEffortsStub.MapEntry();
        GetWorkEffortsStub.MapKey mapKey = new GetWorkEffortsStub.MapKey();
        GetWorkEffortsStub.StdString_type0 stdString_type0 = new GetWorkEffortsStub.StdString_type0();
        stdString_type0.setValue("workEffortId");
        mapKey.setStdString(stdString_type0);
        mapEntry.setMapKey(mapKey);

        GetWorkEffortsStub.MapValue mapValue = new GetWorkEffortsStub.MapValue();
        GetWorkEffortsStub.StdString_type0 stdString_type01 = new GetWorkEffortsStub.StdString_type0();
        stdString_type01.setValue("DEFAULT_ROUTING");
        mapValue.setStdString(stdString_type01);
        mapEntry.setMapValue(mapValue);

        GetWorkEffortsStub.MapEntry[] mapEntries = new GetWorkEffortsStub.MapEntry[]{};
        mapMap.setMapEntry(mapEntries);
        getWorkEfforts4.setMapMap(mapMap);

        GetWorkEffortsStub.GetWorkEffortsResponse getWorkEffortsResponse = stub.getWorkEfforts(getWorkEfforts4);

//        ObjectMapper mapper = new ObjectMapper();
//        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
//        mapper.setSerializationInclusion(JsonInclude.Include.NON_DEFAULT);
//        mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
//        String jsonString = "";
//        try {
//            jsonString = mapper.writeValueAsString(getWorkEffortsResponse);
//            System.out.println(jsonString);
//        } catch (JsonProcessingException e) {
//            e.printStackTrace();
//        }

        assertNotNull(stub.getWorkEfforts(getWorkEfforts4));
    }

    /**
     * Auto generated test method
     */
    public void testStartgetWorkEfforts() throws java.lang.Exception {
        com.kyle.microservices.service.axis2.workEfforts.GetWorkEffortsStub stub =
            new com.kyle.microservices.service.axis2.workEfforts.GetWorkEffortsStub();
        com.kyle.microservices.service.axis2.workEfforts.GetWorkEffortsStub.GetWorkEfforts getWorkEfforts4 =
            (com.kyle.microservices.service.axis2.workEfforts.GetWorkEffortsStub.GetWorkEfforts) getTestObject(com.kyle.microservices.service.axis2.workEfforts.GetWorkEffortsStub.GetWorkEfforts.class);
        // TODO : Fill in the getWorkEfforts4 here
        stub.startgetWorkEfforts(getWorkEfforts4, new tempCallbackN1000C());
    }

    //Create an ADBBean and provide it as the test object
    public org.apache.axis2.databinding.ADBBean getTestObject(
        java.lang.Class type) throws java.lang.Exception {
        return (org.apache.axis2.databinding.ADBBean) type.newInstance();
    }

    private class tempCallbackN1000C extends com.kyle.microservices.service.axis2.workEfforts.GetWorkEffortsCallbackHandler {
        public tempCallbackN1000C() {
            super(null);
        }

        public void receiveResultgetWorkEfforts(
            com.kyle.microservices.service.axis2.workEfforts.GetWorkEffortsStub.GetWorkEffortsResponse result) {
        }

        public void receiveErrorgetWorkEfforts(java.lang.Exception e) {
            fail();
        }
    }
}
