package com.kyle.microservices.service;

import com.kyle.microservices.beans.UserLogin;
import org.apache.commons.lang.StringUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserLoginService extends AbstractMSService {
    public UserLogin getUserLogin(String userLoginId) {
        return getUserLogin(userLoginId, null);
    }

    public UserLogin getUserLogin(String userLoginId, String serviceUrl) {
        RestTemplate restTemplate = new RestTemplate();
        String serviceName = "userLogin";
        String url = serviceUrl;
        StringBuilder sb = new StringBuilder();

        if (StringUtils.isEmpty(serviceUrl)) {
            url = this.service_endpoint + "/" + serviceName;
            sb.append(this.service_endpoint);
        } else {
            sb.append(serviceUrl);
        }

        sb.append("/").append(serviceName).append("?user=").append(userLoginId);

        ResponseEntity<UserLogin> response = restTemplate.getForEntity(sb.toString(), UserLogin.class);

        if (response.getStatusCode().equals("200")) {
            return response.getBody();
        } else {
            return null;
        }

    }

}
