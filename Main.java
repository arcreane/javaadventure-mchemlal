package com.dungeon_and_monsters;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // write your code here

       /* Hero hero1 = new Hero("robert", 50, 50, true);
        Magician magician1 = new Magician("gitan", 50, 50, true);
        Barbaric barbaric1 = new Barbaric("gitan", 50, 50, true);
        hero1.heroAttack_Magician_Method(magician1);
        hero1.heroAttack_Barbaric_Method(barbaric1);
        System.out.println(magician1);

        System.out.println(barbaric1.getPointOfLife());


        //public static void hero1(){
        //int pointsDeVie
        //}*/

        Monsters magician = new Monsters("magician", 200, 200, true);
        Monsters barbarian = new Monsters("barbarian", 200, 200, true);
        Weapons weapon1 = new Weapons("axe", 0);
        Weapons weapon2 = new Weapons("thunder", 0);
        Hero hero;

        Monsters[]arrayMonsters = {magician, barbarian};

        public void room2(){
            Random rand = new Random();
            int monsters = rand.nextInt(arrayMonsters.length);
            if (hero.heroAttack_Magician_Method(magician)) {
                if (hero.getPointOfLife() <= 0) {
                    hero.setPointOfLife(0);
                    System.out.println("you are game over");
                } else {
                    System.out.println("you have " + hero.getPointOfLife() + " can move on to the next level");

                }
            }
        }
    }
}



