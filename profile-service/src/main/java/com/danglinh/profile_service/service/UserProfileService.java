package com.danglinh.profile_service.service;

import org.springframework.stereotype.Service;

import com.danglinh.profile_service.dto.request.UserProfileCreationReq;
import com.danglinh.profile_service.dto.response.UserProfileRes;
import com.danglinh.profile_service.entity.UserProfile;
import com.danglinh.profile_service.mapper.UserProfileMapper;
import com.danglinh.profile_service.repository.UserProfileRepository;

@Service
public class UserProfileService {
    private final UserProfileRepository userProfileRepository;
    private final UserProfileMapper userProfileMapper;

    public UserProfileService(UserProfileRepository userProfileRepository, UserProfileMapper userProfileMapper) {
        this.userProfileRepository = userProfileRepository;
        this.userProfileMapper = userProfileMapper;
        System.out.println("====>> userProfileMapper = " + userProfileMapper);
    }

    public UserProfileRes createUserProfile(UserProfileCreationReq userProfileCreationReq) {
        System.out.println("===> REQ: " + userProfileCreationReq);
        UserProfile userProfile = userProfileMapper.toUserProfile(userProfileCreationReq);
        System.out.println("===> ENTITY: " + userProfile);
        userProfileRepository.save(userProfile);
        return userProfileMapper.toUserProfileRes(userProfile);
    }

    public UserProfile getUserProfileById(String id) {
        return userProfileRepository.findById(id).orElse(null); // or throw an exception if you prefer
    }
}
