package ru.adel.springcc;

import org.springframework.stereotype.Component;

@Component("musicBean1")
public class RapMusic implements Music {
    @Override
    public String getSongs() {
        return "Gangsta";
    }
}
