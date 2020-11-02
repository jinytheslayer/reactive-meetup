package com.meetup.hub.service;

import com.meetup.hub.client.DevsClient;
import com.meetup.hub.dto.DeveloperDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class RemoteDevsHubService implements DevsService {
    private final List<DevsClient<?>> developerClients;

    @Override
    public Flux<DeveloperDto> loadDevs() {
        List<Flux<DeveloperDto>> fluxList = developerClients.stream()
                .map(this::load)
                .collect(Collectors.toList());
        return Flux.merge(fluxList);
    }

    @SuppressWarnings("unchecked")
    private Flux<DeveloperDto> load(DevsClient devsClient) {
        return devsClient.loadDevelopers()
                .onErrorResume(err -> Flux.empty())
                .take(Duration.ofSeconds(6));
    }
}
