package org.meetup.reactive.developersweb.service;


import lombok.RequiredArgsConstructor;
import org.meetup.reactive.developersweb.dto.DeveloperDto;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.meetup.reactive.developersweb.support.Names.getRandomName;
import static org.meetup.reactive.developersweb.support.SecondNames.getRandomSecondName;


@Service
@RequiredArgsConstructor
public class DeveloperService {
    public List<DeveloperDto> loadDeveloper() {
        try {
            Thread.sleep(randInt(5,5000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return IntStream.range(0, 10).mapToObj(obj ->
                DeveloperDto.builder()
                        .email("test-web-dev@mail.ru")
                        .firstName(getRandomName())
                        .createdDate(LocalDateTime.now())
                        .login("login")
                        .lastName(getRandomSecondName())
                        .build()
        )
                .collect(Collectors.toList());
    }

    public static int randInt(int min, int max) {
        Random rand = new Random();
        return rand.nextInt((max - min) + 1) + min;
    }
}
