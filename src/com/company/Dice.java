package com.company;
import java.util.Random;

public class Dice {
    Random userRoll = new Random();
    public int roll(){ return userRoll.nextInt(12) +1; }
}
