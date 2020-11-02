package com.meetup.reactive.developersinfo.repository;

import com.meetup.reactive.developersinfo.model.Developer;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface DeveloperRepository extends ReactiveCrudRepository<Developer, Long> {
}
