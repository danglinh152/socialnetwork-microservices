package com.danglinh.profile_service.controller;

import com.danglinh.profile_service.dto.request.UserProfileCreationReq;
import com.danglinh.profile_service.dto.response.UserProfileRes;
import com.danglinh.profile_service.entity.UserProfile;
import com.danglinh.profile_service.service.UserProfileService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class InternalUserProfileController {
    private final UserProfileService userProfileService;

    public InternalUserProfileController(UserProfileService userProfileService) {
        this.userProfileService = userProfileService;
    }

    @PostMapping("/internal/user-profile")
    public ResponseEntity<UserProfileRes> createUserProfile(
            @RequestBody UserProfileCreationReq userProfileCreationReq) {
        return ResponseEntity.ok(userProfileService.createUserProfile(userProfileCreationReq));
    }

}
