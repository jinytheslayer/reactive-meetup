package com.meetup.hub.client;

import com.meetup.hub.dto.DeveloperDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeveloperWebClient implements DevsClient {
    public final BaseClient baseClient;

    public DeveloperWebClient(@Value("${hub.devWebInfo}") String url) {
        this.baseClient = new BaseClient(url);
    }

    @Override
    public List<DeveloperDto> loadDevelopers() {
        return baseClient.<DeveloperDto>getDevelopers()
                .getBody();
    }

}
