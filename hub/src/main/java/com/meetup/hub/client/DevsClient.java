package com.meetup.hub.client;

import com.meetup.hub.dto.DeveloperDto;

import java.util.List;

public interface DevsClient<T extends DeveloperDto> {
    List<T> loadDevelopers();
}
