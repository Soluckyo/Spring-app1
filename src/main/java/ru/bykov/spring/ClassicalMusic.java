package ru.bykov.spring;

import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music {
    @PostConstruct
    public void doMyInit() {
        System.out.println("Downloading music..");
        wait(1000);
        System.out.println("Setting up the equalizer..");
    }
    @PreDestroy
    public void doMyDestroy(){
        System.out.println("Turning off the music..");
    }

    List<String> classicalSong = new ArrayList<>();

    {
        classicalSong.add("Classical music:\"Hungarian Rhapsody\"");
        classicalSong.add("Classical music:\"Вальс цветов\"");
        classicalSong.add("Classical music:\"Dies irae\"");
    }

    @Override
    public List<String> getSong() {
        return classicalSong;
    }

    public static void wait(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
}