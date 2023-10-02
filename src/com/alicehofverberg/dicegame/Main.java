package com.alicehofverberg.dicegame;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random(); // test

        //players
        System.out.println("Welcome, this is a game for 2 players!");
        System.out.println("Input the name of Player 1! ");
        Player player1 = new Player(sc.nextLine());
        System.out.println("Player 1 is:  " + player1.name);

        System.out.println("Input the name of Player 2! ");
        Player player2 = new Player(sc.nextLine());
        System.out.println("Player 2 is:  " + player2.name);


        //variables
        int die;
        int sum1 = 0; // the sum off the dices
        int sum2 = 0;

        System.out.println("How many dice would you like to throw?");
        int dicesAmount = sc.nextInt();
        System.out.println("Player " + player1.name + " is throwing!");
        for (int i = 0; i< dicesAmount; i++ ){

            die = random.nextInt(6) + 1;
            System.out.println(die);

            sum1 += die;
            System.out.println("Score is " + sum1);

        }

        System.out.println("How many dice would you like to throw?");
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


    }

    //belongs to die method System.out.println(die());
    //            sum += die();
    //            System.out.println("sum is " + sum);
    public static int die (){ //method with a die roll

        Random random = new Random();
        return random.nextInt(6)+1; //the span is 1-6


    }

}

