package com.danglinh.profile_service.dto.request;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class UserProfileCreationReq {

    private String userId;

    private String firstName;

    private String lastName;

    private LocalDate dob;

    private String city;
}
