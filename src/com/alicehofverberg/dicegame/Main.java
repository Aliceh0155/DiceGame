package com.alicehofverberg.dicegame;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Variables and objects
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int die;
        int highestScore = 0;
        String highestScoreName = "";
        int ties = 0;

        //Input the amount of players
        System.out.print("Enter the number of players: ");
        int numberPlayers = sc.nextInt();
        sc.nextLine(); // Only function is to not skip my next sc.nextLine...

        // An array to store the names of the players
        String[] playerNames = new String[numberPlayers];
        // An array to store the scores of the players
        int[] playerScores = new int[numberPlayers];

        // For loop to add a name to each player
        for (int i = 0; i < numberPlayers; i++) {
            System.out.print("What is the name of player " + (i + 1) + "? ");
            playerNames[i] = sc.nextLine();
        }

        //Option to choose how many die/dice each player "throws"
        System.out.print("How many dice? ");
        int diceAmount = sc.nextInt();

        //Loops as many times as dices chosen
        // Nested for loop that "throws" the dice for each player in the array
        for (int i = 0; i < diceAmount; i++) {
            for (int j = 0; j < numberPlayers; j++) {

                die = random.nextInt(6) + 1;
                // Prints out each die roll everytime a player "throws" the die
                System.out.println(playerNames[j] + " rolled a " + die);

                //Dice rolls are saved in the score array
                playerScores[j] += die;

                //Updates the variables with new values: the name of the player with the highest score
                if (playerScores[j] > highestScore) {
                    highestScore = playerScores[j];
                    highestScoreName = playerNames[j];
                }
            }
        }

        //For loop to print out each player name + their total dice roll score
        for (int i = 0; i < numberPlayers; i++) {
            System.out.println(playerNames[i] + " total score is : " + playerScores[i]);

        }

        //When there are multiple players with the same highest score
        for (int playerScore : playerScores){
            if (playerScore == highestScore) {
                ties++;
            }
        }

        //If there's more than 1 player with the highest score it's a tie
        if (ties > 1) {
            System.out.println("It's a tie");
        } else {
            // Otherwise we only have one winner!
            System.out.println("Winner is: " + highestScoreName + " " + highestScore);
        }
    }
}