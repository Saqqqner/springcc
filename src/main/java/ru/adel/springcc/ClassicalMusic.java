package ru.adel.springcc;

import org.springframework.stereotype.Component;
@Component
public class ClassicalMusic implements Music{

    @Override
    public String getSongs(){
        return "Sirena";

    }
public void doMyInit(){
    System.out.println("Initmethod!");}
public void doMyDestr(){
    System.out.println("destroy");
}
}
