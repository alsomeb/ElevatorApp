package com.nackademinjava;

public class Main {

    public static void main(String[] args) {
        Elevator elevator1 = new Elevator(LevelSelector.LEVELMINUS2);
        Elevator elevator2 = new Elevator(LevelSelector.LEVEL0);
        Elevator elevator3 = new Elevator(LevelSelector.LEVEL1);
        System.out.println("\n3e Hiss är just nu: " + elevator3.where() + "\n");


        System.out.println("Hissen är just nu på våning: " + elevator1.where());
        System.out.println("Hissen är just nu på våning: " + elevator2.where() + "\n");

        elevator1.goTo(LevelSelector.LEVEL0);
        elevator1.goTo(LevelSelector.LEVEL4);
        elevator1.goTo(LevelSelector.LEVEL4);
        System.out.println("Hissen är just nu på våning: " + elevator1.where() + "\n");


        elevator2.goTo(LevelSelector.LEVEL5);
        elevator2.goTo(LevelSelector.LEVEL1);
    }
}
