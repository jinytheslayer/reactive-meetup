package org.meetup.reactive.developersweb.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class DeveloperDto {

    private String login;

    private String firstName;

    private LocalDateTime createdDate;

    private String lastName;

    private String email;

}
