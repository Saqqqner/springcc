package ru.adel.springcc;

import org.springframework.stereotype.Component;

@Component
public class Jazz implements Music {
    @Override
    public String getSongs() {
        return "Arriva";
    }
}
