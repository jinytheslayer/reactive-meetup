package com.meetup.hub.service;

import com.meetup.hub.client.DevsClient;
import com.meetup.hub.dto.DeveloperDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class RemoteDevsHubService implements DevsService {
    private final List<DevsClient<?>> developerClients;

    @Override
    public List<DeveloperDto> loadDevs() {
        return developerClients.stream()
                .parallel()
                .flatMap(devsClient -> load(devsClient).stream())
                .collect(Collectors.toList());
    }

    @SuppressWarnings("unchecked")
    private List<DeveloperDto> load(DevsClient devsClient) {
        return devsClient.loadDevelopers();
    }

}
