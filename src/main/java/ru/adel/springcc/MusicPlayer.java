package ru.adel.springcc;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private List<Music> musicList = new ArrayList<>();
    private Music music;
    private String name;
    private int volume;

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    @Override
    public String toString() {
        return "MusicPlayer{" +
                "music=" + music +
                ", name='" + name + '\'' +
                ", volume=" + volume +
                '}';
    }

    public void setMusic(Music music) {
        this.music = music;
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

    public MusicPlayer(Music music){
        this.music = music;
    }
    public void playMusic(){
        for (Music music:musicList){
            System.out.println("Playing : " + music.getSongs());
        }
    }
    public MusicPlayer(){}


}
