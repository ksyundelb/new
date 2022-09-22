package com.company.OOP;

public class DinoTest {

    public static void main(String[] args) {

        Dinosaur dinosaur = new Zauropod(4,"Diplodocus");
        Zauropod zauropod = new Zauropod(4, "Brachiosaurus");
        zauropod.setDinoTeeth(40);
        zauropod.dinoEats();
        zauropod.dinoPlays();
        zauropod.alive();

        String string = String.format("Zauropod %s has - %d legs, %d head, %d teeth. Count of dinosaurs is %d",
                zauropod.getDinoName(), zauropod.getLegsCount(), zauropod.getDinoHead(),zauropod.getDinoTeeth(), Dinosaur.getCountDinosaurs());

        System.out.println(string);
    }

}