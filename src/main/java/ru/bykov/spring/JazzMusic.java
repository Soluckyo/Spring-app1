package ru.bykov.spring;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

@Component
public class JazzMusic implements Music{
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
    List<String> jazzSong = new ArrayList<>();
    {
        jazzSong.add("Jazz:\"Feeling Good\"");
        jazzSong.add("Jazz:\"What a wonderful world\"");
        jazzSong.add("Jazz:\"Nevertheless\"");
    }
    @Override
    public List<String> getSong() {
        return jazzSong;
    }
    public static void wait(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
}
