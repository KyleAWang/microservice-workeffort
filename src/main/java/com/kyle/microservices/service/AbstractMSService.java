package com.kyle.microservices.service;

import org.springframework.beans.factory.annotation.Value;


public abstract class AbstractMSService {
    @Value("${ms.user.endpoint.host}")
    private String serviceHost;
    @Value("${ms.user.endpoint.port}")
    private String servicePort;
    @Value("${ms.user.endpoint.protocol}")
    private String serviceProtocol;

    protected String service_endpoint = servicePort+"://"+serviceHost+":"+servicePort+"";

}
