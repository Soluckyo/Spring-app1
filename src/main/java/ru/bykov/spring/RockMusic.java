package ru.bykov.spring;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music{
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
    private List<String> rockSong = new ArrayList<>();

    // Блок инициализации объекта (англ. Instance initialization block)
    // Выполняется каждый раз, когда создается объект класса
    {
        rockSong.add("Rock:\"Wind cries Mary\"");
        rockSong.add("Rock:\"Paint it black\"");
        rockSong.add("Rock:\"Can't seem to make you mine\"");
    }

    @Override
    public List<String> getSong() {
        return rockSong;
    }
    public static void wait(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
}
