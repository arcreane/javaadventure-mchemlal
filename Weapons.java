package com.dungeon_and_monsters;

public class Weapons{



    //properties
    public String nameWeapon;
    public int damage;

    //constructor
    public Weapons(String nameWeapon, int damage){
        this.setNameWeapon(nameWeapon);
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

    public void setNameWeapon(String nameWeapon) {
        this.nameWeapon = nameWeapon;
    }

    public String getNameWeapon(){
        return nameWeapon;
    }

}
