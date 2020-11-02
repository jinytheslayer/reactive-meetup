package com.meetup.hub.client;

import com.meetup.hub.dto.DeveloperDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeveloperDboClient implements DevsClient {
    public final BaseClient baseClient;

    public DeveloperDboClient(@Value("${hub.devDboInfo}") String url) {
        this.baseClient = new BaseClient(url);
    }

    @Override
    public List<DeveloperDto> loadDevelopers() {
        return baseClient.<DeveloperDto>getDevelopers()
                .getBody();
    }


}
