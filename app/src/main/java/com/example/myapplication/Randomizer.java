package com.example.myapplication;

import java.util.Random;

public class Randomizer {

    private int min;
    private int max;

    public Randomizer(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public int getRandomValue() {
        Random rdm = new Random();
        return rdm.nextInt(max - min + 1) + min;
    }
}
