package com.alicehofverberg.dicegame;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Welcome, this is a game for 2 players!");
        System.out.println("Input the name of Player 1! ");
        Player player1 = new Player(sc.nextLine());
        System.out.println("Player 1 is:  " + player1.playerName);

        System.out.println("Input the name of Player 2! ");
        Player player2 = new Player(sc.nextLine());
        System.out.println("Player 2 is:  " + player2.playerName);



        System.out.println("How many dice would you like to throw?");
        int rounds = sc.nextInt();
        for (int i = 0; i< rounds; i++ ){

            System.out.println(dieRoll());
        }




    }

    public static int dieRoll (){ //method with a die roll

        Random random = new Random();
        return random.nextInt(6)+1; //the span is 1-6


    }

}

