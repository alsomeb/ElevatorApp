package com.nackademinjava;

public class Main {

    public static void main(String[] args) {
        Elevator elevator1 = new Elevator(5);
        Elevator elevator2 = new Elevator(-5);


        System.out.println("Hissen är just nu på våning: " + elevator1.where());
        System.out.println("Hissen är just nu på våning: " + elevator2.where() + "\n");

        elevator1.goTo(10);
        elevator1.goTo(5);
        elevator1.goTo(-3);
        System.out.println("Hissen är just nu på våning: " + elevator1.where() + "\n");


        elevator2.goTo(-2);
        elevator2.goTo(-2);
    }
}
