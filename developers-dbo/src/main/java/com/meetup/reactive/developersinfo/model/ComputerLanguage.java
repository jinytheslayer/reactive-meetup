package com.meetup.reactive.developersinfo.model;

import com.meetup.reactive.developersinfo.model.enums.LanguageType;
import com.sun.istack.NotNull;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "computer_language")
@EntityListeners(AuditingEntityListener.class)
@Data
public class ComputerLanguage {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    private UUID id;

    @Enumerated(EnumType.STRING)
    private LanguageType languageType;

    @NotNull
    @CreatedDate
    private LocalDateTime gettingStarted;
}
