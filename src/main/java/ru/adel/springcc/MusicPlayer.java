package ru.adel.springcc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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





public void playMusic(MusicGenre musicGenre){
    Random random = new Random();
    int rNumber = random.nextInt(3);
    if(musicGenre==MusicGenre.CLASSICAL) {
        System.out.println(classicalMusic.getSongs().get(rNumber));
    } else if (musicGenre==MusicGenre.RAP) {
        System.out.println(rapMusic.getSongs().get(rNumber));
    }else {
        System.out.println(jazz.getSongs().get(rNumber));
    }
}

    public MusicPlayer(){}

}
