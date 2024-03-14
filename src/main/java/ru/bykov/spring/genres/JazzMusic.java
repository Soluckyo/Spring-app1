package ru.bykov.spring.genres;

import ru.bykov.spring.Music;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class JazzMusic implements Music {
    @PostConstruct
    public void doMyInit() {
        System.out.println("Downloading jazz music..");
        wait(1000);
        System.out.println("Setting up the equalizer..");
    }
    @PreDestroy
    public void doMyDestroy(){
        System.out.println("Turning off the jazz music..");
    }

    List<String> jazzSongs = new ArrayList<>();
    {
        jazzSongs.add("Jazz:\"Feeling Good\"");
        jazzSongs.add("Jazz:\"What a wonderful world\"");
        jazzSongs.add("Jazz:\"Nevertheless\"");
    }

    public String randomJazzSong(List<String> jazzSongs){
        int length = jazzSongs.size();
        int rnd = new Random().nextInt(length);
        return jazzSongs.get(rnd);
    }

    @Override
    public String getSong() {
        return randomJazzSong(jazzSongs);
    }
    public static void wait(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
}
