package ru.bykov.spring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class JazzMusic implements Music{
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
}
