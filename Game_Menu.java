package com.dungeon_and_monsters;

import java.util.Scanner;

public class Game_Menu {




    public void menu (){
        System.out.println("Welcome to the Dungeon Game, have you got the balls to play ... ");
        System.out.println("----------------------------------------");
        System.out.println("1 - Play");
        System.out.println("2 - Quit");

        Scanner sc = new Scanner(System.in);
        int select = sc.nextInt();

        switch (select) {
            case 1:
                System.out.println("1 - Play");
                Game_Launcher room = new Game_Launcher();
                room.dongeon();
                break;
            case 2:
                System.out.println("if you don't feel like playing, i can recommand a good C'Jérôme concert");
                System.exit(1);
                break;
            default:
                System.out.println("Please make sure you select an option");
        }

    }

}
