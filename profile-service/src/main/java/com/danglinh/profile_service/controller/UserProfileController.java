package com.danglinh.profile_service.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.danglinh.profile_service.dto.request.UserProfileCreationReq;
import com.danglinh.profile_service.dto.response.UserProfileRes;
import com.danglinh.profile_service.entity.UserProfile;
import com.danglinh.profile_service.service.UserProfileService;

@RestController
public class UserProfileController {
    private final UserProfileService userProfileService;

    public UserProfileController(UserProfileService userProfileService) {
        this.userProfileService = userProfileService;
    }

    @GetMapping("/user-profile/{id}")
    public ResponseEntity<UserProfile> getUserProfile(@PathVariable String id) {
        return ResponseEntity.ok(userProfileService.getUserProfileById(id));
    }
}
