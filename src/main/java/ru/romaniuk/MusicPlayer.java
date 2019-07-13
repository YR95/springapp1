package ru.romaniuk;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private List<Music> musicList = new ArrayList<>();
    private String name;
    private int volume;

    public MusicPlayer() {
    }

    public MusicPlayer(List musicList) {
        this.musicList = musicList;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setMusicList(List musicList) {
        this.musicList = musicList;
    }

    public void playMusic() {

        System.out.println("Playing: ");
        for (int i = 0; i < musicList.size(); i++) {
            System.out.println("song  number "+i+"  " + musicList.get(i).getSong());
        }

    }

}


