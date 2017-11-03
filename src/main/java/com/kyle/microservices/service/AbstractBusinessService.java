package com.kyle.microservices.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

public abstract class AbstractBusinessService {
    @Value("${business.endpoint.host}")
    protected  String serviceHost;
    @Value("${business.endpoint.port}")
    protected  String servicePort;
    @Value("${business.endpoint.protocol}")
    protected  String serviceProtocol;
}
