package com.dungeon_and_monsters;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Hero hero1 = new Hero("robert", 50, 50, true);
        Magician magician1 = new Magician("gitan", 50, 50, true);

        hero1.heroAttack_Magician_Method(magician1);

        System.out.println(magician1.getPointOfLife());
        //public static void hero1(){
        //int pointsDeVie
        //}


    }
}