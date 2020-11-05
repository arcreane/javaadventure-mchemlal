package com.dungeon_and_monsters;

public class Weapons extends Characters{

    //properties
    public String name;
    public int damage;

    //constructor
    public Weapons(String name, int damage){
        this.setName(name);
        this.setDamage(damage);
    }

    //___________________________________getter and setter for property damage

    public void setDamage(int damage) {
        this.damage = damage;
    }
    public int getDamage(){
        return damage;
    }

    //___________________________________getter and setter for property name

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

}
