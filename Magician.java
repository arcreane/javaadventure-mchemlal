package com.dungeon_and_monsters;

public class Magician extends Characters {
    // properties
    Weapons magicianWeapon = new Weapons("Sword", 10);
    String name;

    //constructor
    public Magician(String name, int pointOfLife, int maxLife, boolean alive){
        super(name, pointOfLife, maxLife, alive);
    }

    //accessors


}
