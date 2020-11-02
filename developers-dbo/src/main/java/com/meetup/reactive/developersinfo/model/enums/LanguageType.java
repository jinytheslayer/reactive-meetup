package com.meetup.reactive.developersinfo.model.enums;


import com.meetup.reactive.developersinfo.model.ComputerLanguage;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.stream.Stream;

public enum LanguageType {
    JAVA,
    PYTHON,
    C_SHARP,
    ACTION_SCRIPT,
    COLDFUSION,
    DELPHI,
    DYLAN,
    EIFFEL,
    GROOVY,
    HAXE,
    JAVASCRIPT,
    OBJECT_PASCAL,
    OBJECTIVE_C,
    PERL,
    PHP,
    PIKE,
    RUBY,
    SELF,
    SIMULA,
    SMALLTALK,
    SWIFT,
    VALA,
    VISUAL_BASIC,
    KOTLIN,
    CURRY,
    ERLANG,
    MATHEMATICA,
    MOZART,
    NEMERLE,
    RUST,
    SCALA,
    ZONNON;

    public static Set<ComputerLanguage> getRandomLanguages() throws Exception {
        int rand = new Random().nextInt(values().length - 1);
        Set<ComputerLanguage> collect = new HashSet<>(rand);
        for (int i = 0; i < rand; i++) {
            ComputerLanguage computerLanguage = new ComputerLanguage();
            computerLanguage.setLanguageType(LanguageType.getRandomLanguage());
            computerLanguage.setGettingStarted(LocalDateTime.now());
            collect.add(computerLanguage);
        }
        return collect;
    }

    public static LanguageType getRandomLanguage() throws Exception {
        return Stream.of(LanguageType.values()).skip(new Random().nextInt(values().length - 1)).findFirst().orElseThrow(() -> new Exception("Почему-то не найдена фамилия"));
    }
}
