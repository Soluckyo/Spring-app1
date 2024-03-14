package ru.bykov.spring.genres;

import ru.bykov.spring.Music;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ClassicalMusic implements Music {
    @PostConstruct
    public void doMyInit() {
        System.out.println("Downloading classical music..");
        wait(1000);
        System.out.println("Setting up the equalizer..");
    }
    @PreDestroy
    public void doMyDestroy(){
        System.out.println("Turning off the classical music..");
    }

    List<String> classicalSongs = new ArrayList<>();

    {
        classicalSongs.add("Classical music:\"Hungarian Rhapsody\"");
        classicalSongs.add("Classical music:\"Вальс цветов\"");
        classicalSongs.add("Classical music:\"Dies irae\"");
    }

    public String randomClassicalSong(List<String> classicalSongs){
        int length = classicalSongs.size();
        int rnd = new Random().nextInt(length);
        return classicalSongs.get(rnd);
    }

    @Override
    public String getSong() {
        return randomClassicalSong(classicalSongs);
    }

    public static void wait(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
}