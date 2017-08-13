/**
 * GetWorkEffortsTest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.6  Built on : Jul 30, 2017 (09:08:31 BST)
 */
package com.kyle.microservices.service.axis2.workEfforts;


import com.kyle.microservices.beans.WorkEffort;

/*
 *  GetWorkEffortsTest Junit test case
 */
public class GetWorkEffortsTest extends junit.framework.TestCase {
    /**
     * Auto generated test method
     */
    public void testgetWorkEfforts() throws java.lang.Exception {
        com.kyle.microservices.service.axis2.workEfforts.GetWorkEffortsStub stub =
            new com.kyle.microservices.service.axis2.workEfforts.GetWorkEffortsStub(); //the default implementation should point to the right endpoint

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
        GetWorkEffortsStub.MapEntry[] entries = getWorkEffortsResponse.getMapHashMap().getMapEntry();

        for (GetWorkEffortsStub.MapEntry entry: entries) {
            String key = entry.getMapKey().getStdString().getValue();
            WorkEffort workEffort = new WorkEffort();
            if (key.equals("workEfforts")) {
                GetWorkEffortsStub.ColCollection colLinkedList = entry.getMapValue().getColLinkedList();
                GetWorkEffortsStub.EevalWorkEffort_type0[] eevalWorkEfforts = colLinkedList.getEevalWorkEffort();
            }
        }
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
