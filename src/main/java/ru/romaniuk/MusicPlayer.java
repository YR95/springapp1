package ru.romaniuk;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
class MusicPlayer {
    @Autowired
    private Music music;


    public void playMusic() {
        System.out.println("Playing: " + music.getSong());
    }
}
