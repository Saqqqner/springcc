package ru.adel.springcc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Music music = context.getBean("musicBean",Music.class);
//        MusicPlayer musicPlayer  = new MusicPlayer(music);
        ClassicalMusic classicalMusic= context.getBean("musicBean",ClassicalMusic.class);
        ClassicalMusic classicalMusic1= context.getBean("musicBean",ClassicalMusic.class);
        System.out.println(classicalMusic.getSongs());


        context.close();


    }
}
