package ru.adel.springcc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
@PropertySource("classpath:musicPlayer.properties")
@ComponentScan("ru.adel.springcc")
public class SpringConf {
    @Bean
    public ClassicalMusic musicBean(){
        return new ClassicalMusic();
    }
    @Bean
    public Jazz musicBean1(){
        return new Jazz();
    }
    @Bean
    public RapMusic musicBean2(){
        return new RapMusic();
    }
    @Bean
    public List<Music> musicList(){
        return Arrays.asList(musicBean(), musicBean1(), musicBean2());
    }
    @Bean
    public MusicPlayer musicPlayer (){
        return new MusicPlayer(musicList());
    }



}
