package ru.bykov.spring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music{
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
}
