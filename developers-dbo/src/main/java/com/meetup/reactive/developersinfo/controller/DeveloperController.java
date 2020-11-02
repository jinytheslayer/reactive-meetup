package com.meetup.reactive.developersinfo.controller;


import com.meetup.reactive.developersinfo.dto.DeveloperDto;
import com.meetup.reactive.developersinfo.service.DeveloperService;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value = "public/v1")
@AllArgsConstructor
public class DeveloperController {
    private final DeveloperService developerService;

    @GetMapping(value = "/developers", produces = APPLICATION_JSON_VALUE)
    public List<DeveloperDto> getDevelopers() {
        return developerService.loadDeveloper();
    }

    @Data
    static class ResponseDev {
        private String status;
    }
}
