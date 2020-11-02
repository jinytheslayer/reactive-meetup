package com.meetup.reactive.developersinfo.repository;

import com.meetup.reactive.developersinfo.model.Developer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface DeveloperRepository extends JpaRepository<Developer, UUID> {
}
