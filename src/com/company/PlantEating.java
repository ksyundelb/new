package com.company.OOP;

public class PlantEating extends Dinosaur {

    public PlantEating(int legsCount) {
        setLegsCount(legsCount);
        System.out.println("I am a plant-eating dinosaur");
    }

    private String dinoName;

    public StringBuilder getDinoName() {
        StringBuilder sbDinoName = new StringBuilder(this.dinoName);
        return sbDinoName;
    }

    public void setDinoName(String dinoName) {
        this.dinoName = dinoName;
    }

    private final int dinoHead = 1;

    public int getDinoHead() {
        return dinoHead;
    }

    private int dinoTeeth = 40;

    public int getDinoTeeth() {
        return dinoTeeth;
    }

    public void setDinoTeeth(int dinoTeeth) {
        if (dinoTeeth >= 0 && dinoTeeth <= 40) {
            this.dinoTeeth = dinoTeeth;
        }
    }

    public void alive() {
        System.out.println("Dinosaur is alive");
    }


}