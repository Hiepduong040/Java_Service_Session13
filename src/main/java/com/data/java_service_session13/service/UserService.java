package com.data.java_service_session13.service;

import com.data.java_service_session13.model.dto.request.UserLogin;
import com.data.java_service_session13.model.dto.request.UserRegister;
import com.data.java_service_session13.model.dto.response.JWTResponse;
import com.data.java_service_session13.model.entity.User;

public interface UserService {
    User registerUser(UserRegister userRegister);

    JWTResponse login(UserLogin userLogin);
}
