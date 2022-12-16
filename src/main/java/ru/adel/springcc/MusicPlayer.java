package ru.adel.springcc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class MusicPlayer {
    private String name;
    private int volume;
    private List<Music> musicList;

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }


//    public MusicPlayer(RapMusic rapMusic, ClassicalMusic classicalMusic, Jazz jazz) {
//        this.rapMusic = rapMusic;
//        this.classicalMusic = classicalMusic;
//        this.jazz = jazz;
//    }


    public String playMusic() {
        Random random = new Random();
        return "Playing: " + musicList.get(random.nextInt(musicList.size())).getSongs();
        }


public MusicPlayer(){}
}