package com.alicehofverberg.dicegame;

import java.util.Arrays;
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
        // nested for loop that "throws" the dice for each player in the array
        for (int i = 0; i < diceAmount; i++) {
            for (int j = 0; j < numberPlayers; j++) {

                die = random.nextInt(6) + 1;
                // prints out each die roll everytime a player "throws" the die
                System.out.println(playerNames[j] + " rolled a " + die);

                //scores are saved in an array
                playerScores[j] += die;

                //updates the variables with the name of the player with the highest score
                if (playerScores[j] > highestScore) {
                    highestScore = playerScores[j];
                    highestScoreName = playerNames[j];

                }
            }
        }

        //for loop to print out each player name + their total dice roll score
        for (int k = 0; k < numberPlayers; k++) {
            System.out.println(playerNames[k] + " total score is : " + playerScores[k]);
        }


        System.out.println("Winner is: " + highestScoreName + " " + highestScore);


    }
}

    /*TODO- Jag kan nu skriva ut vinnaren!!
    TODO- nör jag använde mig av  stream så kunde jag få ut vinnaren men inte namnet på den spelare
    TODO- som vann. därför har jag nu gjort variabler för higestscore och higestscoreName för att spara
    TODO- högsta poäng och tillhörande spelarnamn. i en if sats jämför jag om  spelarens poäng är större än highestscore
    TODO- och om det är så uppdateras variablen highest score men det nya högsta nummret.

    TODO- Jag måste hitta en lösning på om flera spelare får samma poäng..



    //for loop to print out each player name + their total dice roll score
        for (int k = 0; k < numberPlayers; k++) {
            System.out.println(playerNames[i] + " total score is : " + playerScores[i]);
        }
     */
