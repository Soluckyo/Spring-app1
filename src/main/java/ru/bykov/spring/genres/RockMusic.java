package ru.bykov.spring.genres;

import org.springframework.stereotype.Component;
import ru.bykov.spring.Music;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

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
    @Override
    public String getSong() {
        return "Wind cries Mary";
    }
    public static void wait(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
}
