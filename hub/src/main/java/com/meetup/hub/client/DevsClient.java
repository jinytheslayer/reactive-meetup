package com.meetup.hub.client;

import com.meetup.hub.dto.DeveloperDto;
import reactor.core.publisher.Flux;

public interface DevsClient<T extends DeveloperDto> {
    Flux<T> loadDevelopers();
}
