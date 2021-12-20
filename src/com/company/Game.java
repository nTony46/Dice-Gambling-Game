package com.company;

import java.util.Scanner;

public class Game {

    public int compareRolls(int yourRoll, int oppRoll){
        if (yourRoll > oppRoll){
            System.out.println("You win!");
            return 1;
        } else if (yourRoll < oppRoll){
            System.out.println("You lose!");
            return 2;
        } else {
            System.out.println("It's a tie!");
            return 3;
        }
    }
    public static void printRolls(int yourRoll, int oppRoll){
        System.out.println("Your roll: " + yourRoll);
        System.out.println("House roll: " + oppRoll);
    }

    public static int createGameBet(){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("How much do you want to bet? (Enter 0 to end)");
        int bet = myScanner.nextInt();
        System.out.println();
        return bet;
    }
}
