package com.company;
import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
	// write your code here
        Dice dice = new Dice();
        Game game = new Game();
        Scanner myScanner = new Scanner(System.in);
        Account test = new Account(10000);


        while (test.balance > 0) {
            System.out.println(test.getBalance());
            System.out.println("How much do you want to bet?");
            int bet = myScanner.nextInt();
            System.out.println();
            if (bet == 0) {
                System.out.println("Successfully ended.");
                break;
            } if (bet > test.balance){
                System.out.println("Bet too high. Try again!");
                break;
            } else {
                int myRoll = dice.roll();
                int houseRoll = dice.houseRoll();
                game.printRolls(myRoll, houseRoll);
                int result = game.compareRolls(myRoll, houseRoll);
                if (result == 1) {
                    test.balance += bet;
                }
                if (result == 2) {
                    test.balance -= bet;
                }
                System.out.println();
            }
        }
        if (test.balance == 0){
            System.out.println("You're broke sorry lol");
        }
    }




}
