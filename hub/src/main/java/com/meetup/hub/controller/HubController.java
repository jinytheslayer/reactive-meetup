package com.meetup.hub.controller;

import com.meetup.hub.dto.DeveloperDto;
import com.meetup.hub.service.RemoteDevsHubService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@RequestMapping("hub")
@RequiredArgsConstructor
@Slf4j
public class HubController {
    private final RemoteDevsHubService remoteDevsHubService;

    @RequestMapping(method = GET, value = "/loadMainDevs", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<DeveloperDto> loadDevelopers() {
        List<DeveloperDto> developerDtos = remoteDevsHubService.loadDevs();
        log.info("LIST{}", developerDtos);
        return developerDtos;
    }
}
