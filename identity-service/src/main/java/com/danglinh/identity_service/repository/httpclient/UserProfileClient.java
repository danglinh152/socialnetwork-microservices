package com.danglinh.identity_service.repository.httpclient;


import com.danglinh.identity_service.dto.request.UserProfileCreationReq;
import com.danglinh.identity_service.dto.response.UserProfileRes;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "profile-service", url = "${service.userProfileService}")
public interface UserProfileClient {
    @PostMapping(value = "/user-profile", produces = MediaType.APPLICATION_JSON_VALUE)
    UserProfileRes createUserProfile(@RequestBody UserProfileCreationReq userProfileCreationReq);

}
