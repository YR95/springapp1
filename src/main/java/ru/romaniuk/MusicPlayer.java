package ru.romaniuk;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    private ClassicMusic classicMusic;
    private RockMusic rockMusic;

    @Autowired
    public MusicPlayer(ClassicMusic classicMusic, RockMusic rockMusic) {
        this.classicMusic = classicMusic;
        this.rockMusic = rockMusic;
    }

    public void playMusic() {
        System.out.println("Playing: " + classicMusic.getSong() + "\n " + rockMusic.getSong());
    }
}
