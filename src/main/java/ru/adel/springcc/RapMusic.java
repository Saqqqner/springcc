package ru.adel.springcc;

import org.springframework.stereotype.Component;

@Component()
public class RapMusic implements Music {
    @Override
    public String getSongs() {
        return "Gangsta";
    }
}
