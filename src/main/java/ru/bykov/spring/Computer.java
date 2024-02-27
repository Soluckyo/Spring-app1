package ru.bykov.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import java.util.Random;

@Component
public class Computer {
    @Value("${computer.name}")
    private String name;
    @Value("${computer.volume}")
    private int volume;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    private int id;
    private MusicPlayer musicPlayer;
    @Autowired
    public Computer(MusicPlayer musicPlayer) {
        this.id = 1;
        this.musicPlayer = musicPlayer;
    }
    @Override
    public String toString(){
        int min = 1;
        int max = 3;
        int randomNumber = (int) ((Math.random() * ((max - min) + 1)) + min);
        MusicGenre str = null;

        if(randomNumber == 1){
            str = MusicGenre.CLASSICAL;
        }if(randomNumber == 2){
            str = MusicGenre.ROCK;
        }if(randomNumber == 3)
            str = MusicGenre.JAZZ;

        return "Computer " + id + ": " + musicPlayer.playMusic(str);
    }

}
