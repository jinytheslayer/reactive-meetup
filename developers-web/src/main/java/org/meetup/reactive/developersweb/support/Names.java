package org.meetup.reactive.developersweb.support;

import java.util.Random;
import java.util.stream.Stream;

public enum Names {
    NOAH, OLIVIA,
    MASON, AVA,
    ETHAN, SOPHIA,
    LOGAN, ISABELLA,
    LUCAS, MIA,
    JACKSON, CHARLOTTE,
    AIDEN, AMELIA,
    OLIVER, EMILY,
    JACOB, MADISON,
    ELIJAH, HARPER,
    ALEXANDER, ABIGAIL,
    JAMES, AVERY,
    BENJAMIN, LILY,
    JACK, ELLA,
    LUKE, CHLOE,
    WILLIAM, EVELYN,
    MICHAEL, SOFIA,
    OWEN, ARIA,
    DANIEL, ELLIE,
    CARTER, AUBREY,
    GABRIEL, SCARLETT,
    HENRY, ZOEY,
    MATTHEW, HANNAH,
    WYATT, AUDREY,
    CALEB, GRACE,
    JAYDEN, ADDISON,
    NATHAN, ZOE,
    RYAN, ELIZABETH,
    ISAAC, NORA;

    public static String getRandomName() {
        return Stream.of(Names.values()).skip(new Random().nextInt(values().length - 1)).findFirst().map(Enum::name).orElse("DEF");
    }

}
