package ru.bykov.spring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music{
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
}
