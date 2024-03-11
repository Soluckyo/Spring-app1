package ru.bykov.spring.genres;

import ru.bykov.spring.Music;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

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

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }

    public static void wait(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
}