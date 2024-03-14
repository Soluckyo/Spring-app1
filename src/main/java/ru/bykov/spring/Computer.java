package ru.bykov.spring;

import org.springframework.beans.factory.annotation.Value;

public class Computer {
    private int id;
    private MusicPlayer musicPlayer;

    @Value("${computer.device}")
    private String device;

    @Value("${computer.volume}")
    private int volume;

    public String getDevice() {
        return device;
    }

    public int getVolume() {
        return volume;
    }
    public Computer(MusicPlayer musicPlayer) {
        this.id = 1;
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String toString(){
        return "Computer " + id + " " + musicPlayer.playMusic()
                + "\nDevice: " + getDevice()
                + "\nVolume: " + getVolume();
    }
}
