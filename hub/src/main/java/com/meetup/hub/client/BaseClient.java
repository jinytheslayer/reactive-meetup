package com.meetup.hub.client;

import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.ClientResponse;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

public class BaseClient {
    private final WebClient client;
    private final String baseUrl;

    BaseClient(String baseUrl) {
        this.client = WebClient.create(baseUrl);
        this.baseUrl = baseUrl;
    }

    protected Mono<ClientResponse> getDevelopers() {
        return client.get()
                .uri(baseUrl)
                .accept(MediaType.APPLICATION_STREAM_JSON)
                .exchange();
    }
}
