package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Initializing Dice Gambling Game...");
        Dice dice = new Dice();
        Game game = new Game();
        Scanner myScanner = new Scanner(System.in);

        System.out.print("Enter starting balance: ");
        int startingBalance = myScanner.nextInt();
        Account userAccount = new Account(startingBalance);
        System.out.println();

        while (userAccount.balance > 0) {
            System.out.println(userAccount.getBalance());
            int userBet = game.createGameBet();

            while (userBet > userAccount.balance){
                System.out.println("Bet is too high. Try again!");
                userBet = game.createGameBet();
            }
            if (userBet == 0) {
                System.out.println("Successfully ended with $" + userAccount.balance + ".");
                break;
            }
            else {
                int userRoll = dice.roll();
                int houseRoll = dice.roll();
                game.printRolls(userRoll, houseRoll);
                int result = game.compareRolls(userRoll, houseRoll);

                if (result == 1) userAccount.balance += userBet;
                if (result == 2) userAccount.balance -= userBet;
                System.out.println();
            }
        }
        if (userAccount.balance == 0){ System.out.println("Not enough money to play."); }
    }
}
