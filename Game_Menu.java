package com.dungeon_and_monsters;

import javax.swing.*;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Game_Menu {


    public void menu (){
        System.out.println("Welcome to the Dungeon Game, have you got the balls to play ... ");
        System.out.println("----------------------------------------");
        System.out.println("1 - Play");
        System.out.println("2 - Quite");

        Scanner sc = new Scanner(System.in);
        int select = sc.nextInt();

        switch (select) {
            case 1:
                System.out.println("1 - Play");
                break;
            case 2:
                System.out.println("2 - Quite");
                break;
            default:
                System.out.println("Please make sure you select an option");
        }


        System.out.println("Game rules : "
                            + "- ");

    }

}
