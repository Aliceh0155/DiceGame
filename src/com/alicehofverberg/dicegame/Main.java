package com.alicehofverberg.dicegame;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int die;

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
            System.out.print("Enter the name of player " + (i + 1) + ": ");
            playerNames[i] = sc.nextLine();
        }

        //Option to choose how many die/dice each player "throws"
        System.out.print("Enter the number of dice you want: ");
        int diceAmount = sc.nextInt();

        //loops as many times as dices chosen
        // for each loop inside the for loop that "throws" the dice for each player in the array
        for (int i = 0; i < diceAmount; i++) {
            for (String playerName : playerNames) {
                die = random.nextInt(6) + 1;
                // prints out each die roll everytime a player "throws" the die
                System.out.println(playerName + " rolled a " + die);

                playerScores[i] += die;

            }
        }

        //for loop to print out each player name + their total dice roll score
        for (int i = 0; i < numberPlayers; i++) {
            System.out.println(playerNames[i] + " total score is : " + playerScores[i]);

        }



    }
}


              /*  int highestNumber;
                if (sum1 > sum2 && sum1 > sum3) {
                    highestNumber = sum1;
                } else if (sum2 > sum1 && sum2 > sum3) {
                    highestNumber = sum2;
                } else {
                    highestNumber = sum3;
                }
                System.out.println("Winner is: " + highestNumber);

               */


    /*TODO- Jag har skapat ytterligare en array för att förvara playerScores.
    TODO- Jag har tagit bort valet av rundor för att minska antalet problem att lösa och tänker att jag lägger till det
    TODO- vid ett senare tillfälle när jag har ett fungerande spel först.
    TODO- Nu måste jag skapa ett sätt att skriva ut vinnaren.
     */
