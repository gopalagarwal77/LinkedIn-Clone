package com.linkedin.users_service.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class UserInfoDto {
    private String address;
    private String zipCode;
    private String city;
    private String country;
    private String website;
    private String professionalSummary;
    private String headLine;
    private LocalDate dob;
}
