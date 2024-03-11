package ru.bykov.spring.config;

import org.springframework.context.annotation.*;
import ru.bykov.spring.Computer;
import ru.bykov.spring.Music;
import ru.bykov.spring.MusicPlayer;
import ru.bykov.spring.genres.ClassicalMusic;
import ru.bykov.spring.genres.JazzMusic;
import ru.bykov.spring.genres.RockMusic;
import java.util.Arrays;
import java.util.List;

@Configuration
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    @Bean
    public ClassicalMusic classicalMusic(){
        return new ClassicalMusic();
    }

    @Bean
    public RockMusic rockMusic(){
        return  new RockMusic();
    }

    @Bean
    public JazzMusic jazzMusic(){
        return new JazzMusic();
    }

    @Bean
    public List<Music> musicList(){
        return Arrays.asList(classicalMusic(),rockMusic(),jazzMusic());
    }

    @Bean
    public MusicPlayer musicPlayer(){
        return new MusicPlayer(musicList());
    }

    @Bean
    public Computer computer(){
        return new Computer(musicPlayer());
    }

}
