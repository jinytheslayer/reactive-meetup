package com.meetup.hub.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DeveloperDto {

    private String login;

    private String firstName;

    private LocalDateTime createdDate;

    private String lastName;

    private String email;

}
