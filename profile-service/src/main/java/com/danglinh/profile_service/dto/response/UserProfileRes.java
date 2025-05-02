package com.danglinh.profile_service.dto.response;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class UserProfileRes {

    private String id;

    private String userId;

    private String firstName;

    private String lastName;

    private LocalDate dob;

    private String city;
}
