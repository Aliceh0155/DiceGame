package com.alicehofverberg.dicegame;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Name of player1? ");
        Player player1 = new Player(sc.nextLine());
        System.out.println("player 1 is: " + player1.playerName);

    }
}
