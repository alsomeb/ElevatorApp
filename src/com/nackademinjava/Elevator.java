package com.nackademinjava;

public class Elevator {
    private int level; // -2 till 10 restricted


    // Constructor
    public Elevator(int level) {
        // Ternary Operator:
        // If level is -2 or above and less or equal to 10
        // set it to the constructor argument, else default value 0
        this.level = (level >= -2 && level <= 10) ? level : 0;
    }


    // Class methods
    public int where() {
        return getLevel();
    }

    public void goTo(int targetLevel) {
        int currentLevel = getLevel();

        if (checkLevelIsAcceptable(targetLevel)) {
            if (currentLevel < targetLevel) {
                setLevel(targetLevel);
                System.out.println("Hissen åker upp till våning " + targetLevel + " från våning " + currentLevel);
            } else if (currentLevel > targetLevel) {
                setLevel(targetLevel);
                System.out.println("Hissen åker ner till våning " + targetLevel + " från våning " + currentLevel);
            } else {
                System.out.println("Hissen står redan på våning " + targetLevel);
            }
        } else {
            System.out.println("Bara mellan våning -2 till 10 tillåtet!");
        }
    }


    // Returns true if within level -2 to 10 else false
    public boolean checkLevelIsAcceptable(int level) {
        return level >= -2 && level <= 10;
    }

    // Getters & Setters
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
