package ru.bykov.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import java.util.Random;

@Component
public class MusicPlayer {
    private Music classicalMusic;
    private Music rockMusic;
    private Music jazzMusic;
    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") Music classicalMusic, @Qualifier("rockMusic") Music rockMusic, @Qualifier("jazzMusic") Music jazzMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
        this.jazzMusic = jazzMusic;
    }
    public String playMusic(MusicGenre genre) {
        Random random = new Random();

        // случайное целое число между 0 и 3
        int randomNumber = random.nextInt(3);

        if (genre == MusicGenre.CLASSICAL) {
            // случайная Classical песня
            return (classicalMusic.getSong().get(randomNumber));
        }if (genre == MusicGenre.ROCK) {
            // случайная Rock песня
            return (rockMusic.getSong().get(randomNumber));
        }if (genre == MusicGenre.JAZZ) {
            // случайная Jazz песня
            return (jazzMusic.getSong().get(randomNumber));
        }return null;
    }
}
