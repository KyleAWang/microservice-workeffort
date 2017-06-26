package com.kyle.microservices.service;

import com.kyle.microservices.service.getWorkEfforts.GetWorkEfforts;
import com.kyle.microservices.service.getWorkEfforts.GetWorkEffortsPortType;
import com.kyle.microservices.service.getWorkEfforts.MapMap;
import org.springframework.stereotype.Service;

import javax.xml.namespace.QName;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;
import java.util.logging.Logger;

/**
 * Created by Kyle on 6/25/2017.
 */
@Service
public class WorkEffortService {
    private Logger logger = Logger.getLogger(WorkEffortService.class.getName());
    private static final QName SERVICE_NAME = new QName("http://ofbiz.apache.org/service/", "getWorkEfforts");

    public Map<String, Object> getWorkEfforts() {
        Map<String, Object> result = null;

        URL wsdlURL = GetWorkEfforts.WSDL_LOCATION;

        GetWorkEfforts ss = new GetWorkEfforts(wsdlURL, SERVICE_NAME);
        GetWorkEffortsPortType port = ss.getGetWorkEffortsPort();

        System.out.println("Invoking getWorkEfforts...");
        MapMap _getWorkEfforts_mapMapVal = new MapMap();
        javax.xml.ws.Holder<MapMap> _getWorkEfforts_mapMap = new javax.xml.ws.Holder<MapMap>(_getWorkEfforts_mapMapVal);
        port.getWorkEfforts(_getWorkEfforts_mapMap);
        System.out.println("getWorkEfforts._getWorkEfforts_mapMap=" + _getWorkEfforts_mapMap.value);
        return result;

    }
}
