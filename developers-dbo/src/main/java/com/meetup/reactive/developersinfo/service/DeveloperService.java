package com.meetup.reactive.developersinfo.service;

import com.meetup.reactive.developersinfo.dto.DeveloperDto;
import com.meetup.reactive.developersinfo.repository.DeveloperRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import static com.meetup.reactive.developersinfo.support.DeveloperUUIDs.uuids;

@Service
@RequiredArgsConstructor
public class DeveloperService {
    private final DeveloperRepository developerRepository;
    private static final Random rnd = new Random();

    public List<DeveloperDto> loadDeveloper() {
        int abs = Math.abs(rnd.nextInt(uuids.size() - 10));
        return developerRepository.findAllById(uuids.subList(abs, abs + 5)).stream()
                .map(dev ->
                        DeveloperDto.builder()
                                .email(dev.getEmail())
                                .firstName(dev.getFirstName())
                                .createdDate(dev.getCreatedDate())
                                .login(dev.getUserName())
                                .lastName(dev.getLastName())
                                .build()
                ).collect(Collectors.toList());
    }
}
