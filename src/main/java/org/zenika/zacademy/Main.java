package org.zenika.zacademy;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Streamer squeezie = new Streamer("Squeezie", 30, 800000, new String[]{"youtube", "twich", "kick"});
        Streamer magda = new Streamer("Magda", 28, 40000, new String[]{"youtube", "twich"});
        Streamer amine = new Streamer("Amine", 26, 99000, new String[]{"kick"});
        Streamer inox = new Streamer("Inox", 17, 760000, new String[]{"youtube", "kick"});
        Streamer jdg = new Streamer("Jdg", 60, 19000, new String[]{"youtube", "twich"});
        Streamer antoineDaniel = new Streamer("Antoine Daniel", 35, 28900, new String[]{"youtube"});
        Streamer horty = new Streamer("Horty", 25, 15000, new String[]{"youtube", "twich"});

        List<Streamer> streamers = new ArrayList<>();
        streamers.add(squeezie);
        streamers.add(magda);
        streamers.add(amine);
        streamers.add(inox);
        streamers.add(jdg);
        streamers.add(antoineDaniel);
        streamers.add(horty);

        streamers.stream()
                .filter(streamer -> streamer.age == 30)
                .forEach(streamer -> System.out.println("Streamer " + streamer.name + " is exactly 30 years old!"));

        streamers.stream()
                .map(streamer -> {
                    streamer.streamMoney = Math.divideExact(streamer.streamMoney, 2);
                    return streamer;
                })
                .forEach(streamer -> System.out.println( streamer.name + " a " + streamer.streamMoney + "€ after taxes ! They got ripped xD"));

    }
}