package com.company.OOP;

public class Zauropod extends PlantEating {

    public Zauropod(int legsCount, String name){
        super(legsCount);
        setDinoName(name);
        System.out.println("I`m a big zauropod " + name);
    }


    public Zauropod(int legsCount) {
        super(legsCount);
    }

    public void dinoSleeps(){
        System.out.println("Dinosaur is sleeping");
    }

}