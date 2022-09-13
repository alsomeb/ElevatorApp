package com.nackademinjava;

public enum LevelSelector {
    LEVELMINUS2(-2),
    LEVELMINUS1(-1),
    LEVEL0(0),
    LEVEL1(1),
    LEVEL2(2),
    LEVEL3(3),
    LEVEL4(4),
    LEVEL5(5),
    LEVEL6(6),
    LEVEL7(7),
    LEVEL8(8),
    LEVEL9(9),
    LEVEL10(10);

    private final int value;


    LevelSelector(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
