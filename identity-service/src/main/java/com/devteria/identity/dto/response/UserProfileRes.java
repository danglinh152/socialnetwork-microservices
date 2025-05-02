package com.devteria.identity.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

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
