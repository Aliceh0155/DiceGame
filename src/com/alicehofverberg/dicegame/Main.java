package com.alicehofverberg.dicegame;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random(); // Startar switch sats

        //variables
        int die;
        int sum1 = 0; // the sum off the dices
        int sum2 = 0;
        int sum3 = 0;

        System.out.println("How many players? 2 or 3");
        int playerAmount = sc.nextInt();
        String useless = sc.nextLine(); // a scan.nextLine to not skip my player 1 name input
        switch (playerAmount){

            case 2:
                System.out.println("Input the name of Player 1! ");
                Player player1 = new Player(sc.nextLine());
                System.out.println("Player 1 is:  " + player1.name);

                System.out.println("Input the name of Player 2! ");
                Player player2 = new Player(sc.nextLine());
                System.out.println("Player 2 is:  " + player2.name);

                System.out.println("How many dice would you like to throw?");
                int dicesAmount = sc.nextInt();
                System.out.println("Player " + player1.name + " is throwing!");
                for (int i = 0; i< dicesAmount; i++ ){

                    die = random.nextInt(6) + 1;
                    System.out.println(die);

                    sum1 += die;
                    System.out.println("Score is " + sum1);

                }

                System.out.println("How many dice would you like to throw? Pick the same amount as the previous player.");
                int dicesAmount2 = sc.nextInt();
                System.out.println("Player " + player2.name + " is throwing!");
                for (int i = 0; i< dicesAmount2; i++ ){

                    die = random.nextInt(6) + 1;
                    System.out.println(die);

                    sum2 += die;
                    System.out.println("Score is " + sum2);

                }

                if (sum1 > sum2){
                    System.out.println("The winner is! " + player1.name);

                } else if (sum1==sum2){
                    System.out.println("Its a tie!");

                }else {
                    System.out.println("The winner is! " + player2.name);
                }
                break;

            case 3:

                System.out.println("Input the name of Player 1! ");
                Player playerOne = new Player(sc.nextLine());
                System.out.println("Player 1 is:  " + playerOne.name);

                System.out.println("Input the name of Player 2! ");
                Player playerTwo = new Player(sc.nextLine());
                System.out.println("Player 2 is:  " + playerTwo.name);

                System.out.println("Input the name of player 3");
                Player player3 = new Player(sc.nextLine());
                System.out.println("Player 3 is: " + player3.name);

                System.out.println("How many dice would you like to throw?");
                int dicesAmountOne = sc.nextInt();
                System.out.println("Player " + playerOne.name + " is throwing!");
                for (int i = 0; i< dicesAmountOne; i++ ){

                    die = random.nextInt(6) + 1;
                    System.out.println(die);

                    sum1 += die;
                    System.out.println("Score is " + sum1);

                }

                System.out.println("How many dice would you like to throw? Pick the same amount as the previous player.");
                int dicesAmountTwo = sc.nextInt();
                System.out.println("Player " + playerTwo.name + " is throwing!");
                for (int i = 0; i< dicesAmountTwo; i++ ){

                    die = random.nextInt(6) + 1;
                    System.out.println(die);

                    sum2 += die;
                    System.out.println("Score is " + sum2);

                }

                System.out.println("How many dice would you like to throw? Pick the same amount as the previous player.");
                int dicesAmount3 = sc.nextInt();
                System.out.println("Player " + player3.name + " is throwing!");
                for (int i = 0; i< dicesAmount3; i++ ){

                    die = random.nextInt(6) + 1;
                    System.out.println(die);

                    sum3 += die;
                    System.out.println("Score is " + sum3);

                }

                int highestNumber;
                if (sum1 > sum2 && sum1 > sum3) {
                    highestNumber = sum1;
                } else if (sum2 > sum1 && sum2 > sum3) {
                    highestNumber = sum2;
                } else {
                    highestNumber = sum3;
                }
                System.out.println("Winner is: " + highestNumber);

                break;

            default:
                System.out.println("Not a valid number");
        }
    }

    /*TODO- HAR LAGT TILL SÅ ATT MAN VÄLJA ANTAL SPELARE 2 ELLER 3. MEN DET ÄR MYCKET KOD OCH UPPREPNING.
    TODO- NÄSTA STEG ÄR ATT FÖRSÖKA MINIMERA MÄNGDEN KOD I MAIN
     */

     */

*/
     */
    //belongs to die method System.out.println(die());
    //            sum += die();
    //            System.out.println("sum is " + sum);
    public static int die (){ //method with a die roll

        Random random = new Random();
        return random.nextInt(6)+1; //the span is 1-6


    }

}

