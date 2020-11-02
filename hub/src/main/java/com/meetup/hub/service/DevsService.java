package com.meetup.hub.service;

import com.meetup.hub.dto.DeveloperDto;

import java.util.List;

public interface DevsService {
    List<DeveloperDto> loadDevs();
}
