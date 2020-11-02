package com.meetup.reactive.developersinfo.controller;


import com.meetup.reactive.developersinfo.dto.DeveloperDto;
import com.meetup.reactive.developersinfo.service.DeveloperService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import static org.springframework.http.MediaType.APPLICATION_STREAM_JSON_VALUE;

@RestController
@RequestMapping(value = "public/v1")
@AllArgsConstructor
public class DeveloperController {
    private final DeveloperService developerService;

    @GetMapping(value = "/developers", produces = APPLICATION_STREAM_JSON_VALUE)
    public Flux<DeveloperDto> getDevelopers() {
        return developerService.loadDeveloper();
    }
}
