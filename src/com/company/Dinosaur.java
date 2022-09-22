package com.company.OOP;


public class Dinosaur {

    public Dinosaur() {
        System.out.println("I am a dinosaur");
        countDinosaurs++;
    }

    private static int countDinosaurs;

    public Dinosaur(PlantEating plantEating) {
        countDinosaurs++;
    }

    public Dinosaur(Zauropod zauropod) {
        countDinosaurs++;
    }


    public static int getCountDinosaurs() {
        return countDinosaurs;
    }


    private int legsCount;
    public int getLegsCount() {
        return legsCount;
    }

    public void setLegsCount(int legsCount) {
        if (legsCount >= 0) {
            this.legsCount = legsCount;
        }
    }

    void dinoEats() {
        System.out.println("Dinosaur is eating");
    }

    void dinoPlays() {
        System.out.println("Dinosaur is playing");
    }


}