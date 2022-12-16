package ru.adel.springcc;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

public class ClassicalMusic implements Music{
        private List<String> songs = new ArrayList<>();
        {
            songs.add("Sirena");
            songs.add("Milena");
            songs.add("Sochi");
        }
        @Override
    public List<String> getSongs(){
        return songs;

    }
public void doMyInit(){
    System.out.println("Initmethod!");}
public void doMyDestr(){
    System.out.println("destroy");
}
}
