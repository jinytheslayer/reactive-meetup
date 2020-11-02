package com.meetup.reactive.developersinfo.support;

import java.util.Random;
import java.util.stream.Stream;

public enum SecondNames {
    SMITH,
    JOHNSON,
    WILLIAMS,
    JONES,
    BROWN,
    DAVIS,
    MILLER,
    WILSON,
    MOORE,
    TAYLOR,
    ANDERSON,
    THOMAS,
    JACKSON,
    WHITE,
    HARRIS,
    MARTIN,
    THOMPSON,
    WOOD,
    LEWIS,
    SCOTT,
    COOPER,
    KING,
    GREEN,
    WALKER,
    EDWARDS,
    TURNER,
    MORGAN,
    BAKER,
    HILL,
    PHILLIPS;

    public static String getRandomSecondName() throws Exception {
        return Stream.of(SecondNames.values()).skip(new Random().nextInt(values().length - 1)).findFirst().map(Enum::name).orElseThrow(() -> new Exception("Почему-то не найдена фамилия"));
    }

}
