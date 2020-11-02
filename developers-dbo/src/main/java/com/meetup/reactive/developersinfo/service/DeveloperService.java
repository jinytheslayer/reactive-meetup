package com.meetup.reactive.developersinfo.service;

import com.meetup.reactive.developersinfo.dto.DeveloperDto;
import com.meetup.reactive.developersinfo.repository.DeveloperRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
@RequiredArgsConstructor
public class DeveloperService {
    private final DeveloperRepository developerRepository;

    public Flux<DeveloperDto> loadDeveloper() {
        return developerRepository.findAll()
                .map(dev ->
                        DeveloperDto.builder()
                                .email(dev.getEmail())
                                .firstName(dev.getFirstname())
                                .createdDate(dev.getCreateddate())
                                .login(dev.getUsername())
                                .lastName(dev.getLastname())
                                .build());
    }
}
