package com.nackademinjava;

public class Elevator {
    private LevelSelector level;


    // Constructor
    public Elevator(LevelSelector level) {
        // LÖSTE MED EN ENUM ISTÄLLET

        this.level = level;
    }


    // Class methods
    public int where() {
        return getLevel();
    }

    public void goTo(LevelSelector targetLevel) {
        int currentLevel = getLevel();
        int target = targetLevel.getValue();

        if (currentLevel < target) {
            setLevel(targetLevel);
            System.out.println("Hissen åker upp till våning " + target + " från våning " + currentLevel);
        } else if (currentLevel > targetLevel.getValue()) {
            setLevel(targetLevel);
            System.out.println("Hissen åker ner till våning " + target + " från våning " + currentLevel);
        } else {
            System.out.println("Hissen står redan på våning " + target);
        }
    }


    // Getters & Setters
    public int getLevel() {
        return level.getValue();
    }

    public void setLevel(LevelSelector level) {
        this.level = level;
    }
}
