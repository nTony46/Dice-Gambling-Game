package com.company;

public class Game {

    public int compareRolls(int yourRoll, int oppRoll){
        if (yourRoll > oppRoll){
            System.out.println("You win!");
            return 1;
        } else if (yourRoll < oppRoll){
            System.out.println("You lose!");
            return 2;
        } else if (yourRoll == oppRoll){
            System.out.println("It's a tie!");
            return 3;
        }
        return 0;
    }
    public static void printRolls(int yourRoll, int oppRoll){
        System.out.println("Your roll: " + yourRoll);
        System.out.println("House roll: " + oppRoll);
    }
}
