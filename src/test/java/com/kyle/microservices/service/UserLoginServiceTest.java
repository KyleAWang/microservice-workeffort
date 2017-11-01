package com.kyle.microservices.service;

import com.kyle.microservices.WorkEffortServer;
import com.kyle.microservices.beans.UserLogin;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {WorkEffortServer.class})
@WebAppConfiguration
public class UserLoginServiceTest {
    @Autowired
    private UserLoginService userLoginService;

    private String serviceEndpoint = "http://localhost:2223";

    @Test
    public void getUserLogin() throws Exception {
        String userLoginId = "admin";
        UserLogin userLogin = userLoginService.getUserLogin(userLoginId, serviceEndpoint);

        assertNotNull(userLogin);
        assertEquals(userLogin.getUserLoginId(), userLoginId);
    }

}