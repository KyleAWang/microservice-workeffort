package com.kyle.microservices.service;

import org.springframework.beans.factory.annotation.Value;


public abstract class AbstractMSService {
    @Value("${ms.user.endpoint.host}")
    protected String serviceHost;
    @Value("${ms.user.endpoint.port}")
    protected String servicePort;
    @Value("${ms.user.endpoint.protocol}")
    protected String serviceProtocol;

}
