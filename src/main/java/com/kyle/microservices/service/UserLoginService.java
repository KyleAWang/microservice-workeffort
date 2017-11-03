package com.kyle.microservices.service;

import com.kyle.microservices.beans.UserLogin;

public interface UserLoginService {
    UserLogin getUserLogin(String userLoginId);
    UserLogin getUserLogin(String userLoginId, String serviceUrl);
}
