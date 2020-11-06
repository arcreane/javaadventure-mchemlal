package com.dungeon_and_monsters;



public class Monsters extends Characters {

    // properties
    Weapons weapon1 = new Weapons("axe", 0);
    Weapons weapon2 = new Weapons("thunder", 0);
    String name;

    //constructor
    public Monsters(String name, int pointOfLife, int maxLife, boolean alive){
        super(name, pointOfLife, maxLife, alive);
        this.setWeapon1(weapon1);
        this.setWeapon2(weapon2);
    }

    public void setWeapon1(Weapons weapon1) {
        this.weapon1 = weapon1;
    }

    public Weapons getWeapon1(){
        return weapon1;
    }

    public void setWeapon2(Weapons weapon2){
        this.weapon2 = weapon2;
    }

    public Weapons getWeapon2(){
        return weapon2;
    }

    public


    //accessors





    }

