package ru.adel.springcc;

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
