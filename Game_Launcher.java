package com.dungeon_and_monsters;
import java.util.Scanner;
import java.util.Random;


public class Game_Launcher {
    Monsters magician = new Monsters("Jean Rouccas the magician", 200, 200, true);
    Monsters barbarian = new Monsters("Carlos the barbarian", 200, 200, true);

    Weapons weaponHero = new Weapons("Sword", 100);
    Hero hero = new Hero("Christian Clavier", 200, 200, true, weaponHero);

    String[] arrayMonsters = {"Jean Rouccas the magician with his thunder", "Carlos the barbarian with his axe"};


    public void dongeon() {
        int[] arrayRoom = {1, 2, 3, 4};
        for (int i = 0; i < arrayRoom.length; i++) {
            System.out.println("------------------------------------");
            System.out.println("");
            System.out.println("Welcome in room " + arrayRoom[i]);
            System.out.println("");
            do {
                Random rand = new Random();
                int monsters = rand.nextInt(arrayMonsters.length);
                System.out.println("Here is the " + arrayMonsters[monsters]);
                System.out.println(hero.getName() + " pick up your Sword and fight");
                System.out.println("TYPE IN \"Sword\".");
                Scanner sc = new Scanner(System.in);
                String pickWeapon = sc.nextLine();
                switch (pickWeapon) {
                    case "Sword":
                        Weapons weaponHero = new Weapons("Sword", 100);
                        System.out.println("You now have your Sword and you are ready to fight");
                        System.out.println("Walk down top to the first door and enter the first room to challenge your first monster");
                }


                Scanner sc1 = new Scanner(System.in);
                System.out.println("-------------------------------------------------------------------");
                System.out.println("Your turn to hit " + arrayMonsters[monsters]);
                System.out.println("Type in \"1st hit\" to Strike first");
                System.out.println("Type in \"2nd hit\" to get stroke by " + arrayMonsters[monsters]);
                System.out.println("Type in \"3rd hit \" to strike again");
                System.out.println("Type in \"4th hit\" to get stroke by " + arrayMonsters[monsters]);
                System.out.println("Now type in \"1st hit\".");
                System.out.println("--------------------------------------------------------------------");
                String strike1 = sc1.nextLine();
                switch (strike1) {
                    case "1st hit":
                        if (hero.heroAttack_Magician_Method(magician) || hero.heroAttack_Barbaric_Method(barbarian)) {
                            magician.magician_attack(hero);
                            barbarian.barbaric_attack(hero);
                            if (magician.getPointOfLife() <= 0 || barbarian.getPointOfLife() <= 0) {

                                magician.setPointOfLife(0);
                                barbarian.setPointOfLife(0);

                                System.out.println("Awesome, you have killed the " + arrayMonsters[monsters]);
                            } else
                                System.out.println("Great shot ! The mighty " + arrayMonsters[monsters] + " still have " + magician.getPointOfLife() + " left.");
                            System.out.println("Type in \"2rd hit\" and watch out for the " + arrayMonsters[monsters] + "'s hit");
                        }

                        Scanner sc2 = new Scanner(System.in);
                        String strike2 = sc2.nextLine();
                        switch (strike2) {
                            case "2nd hit":
                                if (magician.magician_attack(hero) || barbarian.barbaric_attack(hero)) {
                                    magician.magician_attack(hero);
                                    barbarian.barbaric_attack(hero);
                                    if (magician.getPointOfLife() <= 0 || barbarian.getPointOfLife() <= 0) {

                                        hero.setPointOfLife(0);

                                        System.out.println("oh you loose ! You can always start over a new game and get a new shot at winning");
                                    } else
                                        System.out.println("Oh too bad ! But You still have " + hero.getPointOfLife() + " points left");
                                    System.out.println("Type in \"3rd hit\" and watch out for the " + arrayMonsters[monsters] + "'s hit");
                                }
                            }

                        Scanner sc3 = new Scanner(System.in);
                        String strike3 = sc3.nextLine();
                        switch (strike3) {
                            case "3rd hit":
                                if (hero.heroAttack_Magician_Method(magician) || hero.heroAttack_Barbaric_Method(barbarian)) {
                                    magician.magician_attack(hero);
                                    barbarian.barbaric_attack(hero);
                                    if (magician.getPointOfLife() <= 0 || barbarian.getPointOfLife() <= 0) {

                                        magician.setPointOfLife(0);
                                        barbarian.setPointOfLife(0);

                                        System.out.println("Awesome, you have killed the " + arrayMonsters[monsters]);
                                        break;
                                    } else
                                        System.out.println("Great shot ! The mighty Magician still have " + magician.getPointOfLife() + " left.");
                                    System.out.println("Type in \"4th hit\" and watch out for the " + arrayMonsters[monsters] + "'s hit");
                                }
                        }
                }
                break;
            } while(hero.alive || magician.alive || barbarian.alive);
            }
        }
    }











