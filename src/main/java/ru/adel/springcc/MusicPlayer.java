package ru.adel.springcc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class MusicPlayer {
    private RapMusic rapMusic;
    private ClassicalMusic classicalMusic;
    private Jazz jazz;
    @Autowired
    public MusicPlayer(RapMusic rapMusic, ClassicalMusic classicalMusic, Jazz jazz) {
        this.rapMusic = rapMusic;
        this.classicalMusic = classicalMusic;
        this.jazz = jazz;
    }





public String playMusic(){
        return "Playing :"+"\n" + rapMusic.getSongs() +"\n" +  jazz.getSongs() + "\n" + classicalMusic.getSongs();
}

    public MusicPlayer(){}

}
