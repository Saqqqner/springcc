package ru.adel.springcc;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

public class RapMusic implements Music {
    private List<String> songs = new ArrayList<>();

    {
        songs.add("Arriva");
        songs.add("Sant'ago");
        songs.add("Mexico");
    }
    @Override
    public List<String> getSongs() {
        return songs;
    }
}
