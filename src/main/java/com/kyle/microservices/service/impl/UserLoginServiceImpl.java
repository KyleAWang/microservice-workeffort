package com.kyle.microservices.service.impl;

import com.kyle.microservices.beans.UserLogin;
import com.kyle.microservices.service.AbstractMSService;
import com.kyle.microservices.service.UserLoginService;
import org.apache.commons.lang.StringUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.logging.Logger;

@Service
public class UserLoginServiceImpl extends AbstractMSService implements UserLoginService{

    private final Logger logger = Logger.getLogger(UserLoginServiceImpl.class.getName());

    public UserLogin getUserLogin(String userLoginId) {
        return getUserLogin(userLoginId, null);
    }

    public UserLogin getUserLogin(String userLoginId, String serviceUrl) {
        final String methodName = "getUserLogin";
        logger.info(methodName + " starts...");

        if (StringUtils.isEmpty(userLoginId)) {
            logger.info(methodName + " ends...");
            return null;
        }

        String serviceEndpoint = serviceProtocol+"://"+serviceHost+":"+servicePort+"";

        RestTemplate restTemplate = new RestTemplate();
        String serviceName = "userLogin";
        String url = serviceUrl;
        StringBuilder sb = new StringBuilder();

        if (StringUtils.isEmpty(serviceUrl)) {
            url = serviceEndpoint + "/" + serviceName;
            sb.append(serviceEndpoint);
        } else {
            sb.append(serviceUrl);
        }

        sb.append("/").append(serviceName).append("?user=").append(userLoginId);

        logger.info("user login url: " + sb.toString());

        ResponseEntity<UserLogin> response = restTemplate.getForEntity(sb.toString(), UserLogin.class);

        if (response.getStatusCode().value() == 200) {
            logger.info("login id: " + response.getBody());
            logger.info(methodName + " ends...");
            return response.getBody();
        } else {
            logger.info(methodName + " ends...");
            return null;
        }

    }

}
