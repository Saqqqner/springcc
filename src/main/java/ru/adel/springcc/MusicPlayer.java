package ru.adel.springcc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class MusicPlayer {
    @Autowired
    private RapMusic rapMusic;
    @Autowired
    private ClassicalMusic classicalMusic;



    public void playRapMusic(){
            System.out.println("Playing : " +rapMusic.getSongs());
    }
    public void playClassMusic(){
        System.out.println("Playing : " +classicalMusic.getSongs());
    }

    public MusicPlayer(){}

}
