package com.devteria.identity.mapper;

import com.devteria.identity.dto.request.UserCreationRequest;
import com.devteria.identity.dto.request.UserProfileCreationReq;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserProfileMapper {
    UserProfileCreationReq toUserProfileCreationReq(UserCreationRequest userCreationRequest);
}
