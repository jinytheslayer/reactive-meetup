package com.meetup.hub.client;

import com.meetup.hub.dto.DeveloperDto;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.List;

public class BaseClient {
    private final RestTemplate client;
    private final String baseUrl;

    BaseClient(String baseUrl) {
        this.client = new RestTemplate();
        this.baseUrl = baseUrl;
    }

    protected <T> ResponseEntity<List<T>> getDevelopers() {
        return client.exchange(baseUrl,
                HttpMethod.GET, null, new ParameterizedTypeReference<>() {
                });
    }
}
