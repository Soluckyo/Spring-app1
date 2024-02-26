package ru.bykov.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.Random;

@Component
public class Computer {
    private int id;
    private MusicPlayer musicPlayer;
    @Autowired
    public Computer(MusicPlayer musicPlayer) {
        this.id = 1;
        this.musicPlayer = musicPlayer;
    }
    @Override
    public String toString(){
        Random random = new Random();
        int randomNumber = random.nextInt(3);
        MusicGenre str;

        if(randomNumber == 0){
            str = MusicGenre.CLASSICAL;
        }if(randomNumber == 1){
            str = MusicGenre.ROCK;
        }else
            str = MusicGenre.JAZZ;

        return "Computer " + id + ": " + musicPlayer.playMusic(str);
    }

}
