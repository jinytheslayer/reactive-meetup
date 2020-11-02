package com.meetup.hub.controller;

import com.meetup.hub.dto.DeveloperDto;
import com.meetup.hub.service.RemoteDevsHubService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@RequestMapping("hub")
@RequiredArgsConstructor
public class HubController {
    private final RemoteDevsHubService remoteDevsHubService;

    @RequestMapping(method = GET, value = "/loadMainDevs", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<DeveloperDto> loadDevelopers() {
        return remoteDevsHubService.loadDevs().log();
    }
}
