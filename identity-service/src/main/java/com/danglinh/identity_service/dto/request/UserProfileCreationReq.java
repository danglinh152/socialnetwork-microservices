package com.danglinh.identity_service.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

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
