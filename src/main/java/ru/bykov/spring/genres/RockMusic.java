package ru.bykov.spring.genres;

import org.springframework.stereotype.Component;
import ru.bykov.spring.Music;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RockMusic implements Music {
    @PostConstruct
    public void doMyInit() {
        System.out.println("Downloading rock music..");
        wait(1000);
        System.out.println("Setting up the equalizer..");
    }
    @PreDestroy
    public void doMyDestroy(){
        System.out.println("Turning off the rock music..");
    }

    private List<String> rockSongs = new ArrayList<>();

    {
        rockSongs.add("Rock:\"Wind cries Mary\"");
        rockSongs.add("Rock:\"Paint it black\"");
        rockSongs.add("Rock:\"Can't seem to make you mine\"");
    }

    public String randomRockSong(List<String> rockSongs){
        int length = rockSongs.size();
        int rnd = new Random().nextInt(length);
        return rockSongs.get(rnd);
    }

    @Override
    public String getSong() {
        return randomRockSong(rockSongs);
    }
    public static void wait(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
}
