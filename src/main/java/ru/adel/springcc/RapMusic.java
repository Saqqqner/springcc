package ru.adel.springcc;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component()
public class RapMusic implements Music {
    private List<String>songs = new ArrayList<>();
    {
        songs.add("Gansta");
        songs.add("Cash");
        songs.add("More");
    }
    @Override
    public List<String> getSongs() {
        return songs;
    }
}
