package com.danglinh.profile_service.mapper;

import org.mapstruct.Mapper;

import com.danglinh.profile_service.dto.request.UserProfileCreationReq;
import com.danglinh.profile_service.dto.response.UserProfileRes;
import com.danglinh.profile_service.entity.UserProfile;

@Mapper(componentModel = "spring")
public interface UserProfileMapper {
    UserProfile toUserProfile(UserProfileCreationReq userProfileCreationReq);

    UserProfileRes toUserProfileRes(UserProfile userProfile);
}
