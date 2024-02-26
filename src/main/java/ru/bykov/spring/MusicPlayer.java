package ru.bykov.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import java.util.Random;

@Component
public class MusicPlayer {
    private Music music1;
    private Music music2;
    private Music music3;
    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") Music music1,@Qualifier("rockMusic") Music music2,@Qualifier("jazzMusic") Music music3) {
        this.music1 = music1;
        this.music2 = music2;
        this.music3 = music3;
    }
    public String playMusic(MusicGenre genre) {
        Random random = new Random();

        // случайное целое число между 0 и 3
        int randomNumber = random.nextInt(3);

        if (genre == MusicGenre.CLASSICAL) {
            // случайная Classical песня
            return (music1.getSong().get(randomNumber));
        }if (genre == MusicGenre.ROCK) {
            // случайная Rock песня
            return (music2.getSong().get(randomNumber));
        }if (genre == MusicGenre.JAZZ) {
            // случайная Jazz песня
            return (music3.getSong().get(randomNumber));
        }return null;
    }
}
