package org.meetup.reactive.developersweb.service;


import lombok.RequiredArgsConstructor;
import org.meetup.reactive.developersweb.dto.DeveloperDto;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.meetup.reactive.developersweb.support.Names.getRandomName;
import static org.meetup.reactive.developersweb.support.SecondNames.getRandomSecondName;


@Service
@RequiredArgsConstructor
public class DeveloperService {
    public Flux<DeveloperDto> loadDeveloper() {

        final Stream<DeveloperDto> developersStream = IntStream.range(0, 10).mapToObj(obj ->
                DeveloperDto.builder()
                        .email("test-web-dev@mail.ru")
                        .firstName(getRandomName())
                        .createdDate(LocalDateTime.now())
                        .login("login")
                        .lastName(getRandomSecondName())
                        .build()
        );
        return Flux.fromStream(developersStream);
    }

    public static int randInt(int min, int max) {
        Random rand = new Random();
        return rand.nextInt((max - min) + 1) + min;
    }
}
