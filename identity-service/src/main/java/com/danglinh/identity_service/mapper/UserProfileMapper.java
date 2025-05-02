package com.danglinh.identity_service.mapper;

import com.danglinh.identity_service.dto.request.UserCreationRequest;
import com.danglinh.identity_service.dto.request.UserProfileCreationReq;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserProfileMapper {
    UserProfileCreationReq toUserProfileCreationReq(UserCreationRequest userCreationRequest);
}
