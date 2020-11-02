package com.meetup.hub.service;

import com.meetup.hub.dto.DeveloperDto;
import reactor.core.publisher.Flux;

public interface DevsService {
    Flux<DeveloperDto> loadDevs();
}
