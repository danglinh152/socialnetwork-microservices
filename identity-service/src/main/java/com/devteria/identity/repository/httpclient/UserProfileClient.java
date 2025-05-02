package com.devteria.identity.repository.httpclient;


import com.devteria.identity.dto.request.UserProfileCreationReq;
import com.devteria.identity.dto.response.UserProfileRes;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "profile-service", url = "${service.userProfileService}")
public interface UserProfileClient {
    @PostMapping(value = "/user-profile", produces = MediaType.APPLICATION_JSON_VALUE)
    UserProfileRes createUserProfile(@RequestBody UserProfileCreationReq userProfileCreationReq);

}
