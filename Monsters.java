package com.dungeon_and_monsters;



public class Monsters extends Characters {

    Monsters [] arrayMonsters;
    Weapons weapon1 = new Weapons("axe", 10);
    Weapons weapon2 = new Weapons("thunder", 10);
    //String name;

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


    public boolean magician_attack(Hero hero){
        int damage = this.weapon2.getDamage();
        int lifeLeft = hero.pointOfLife - damage;
        hero.setPointOfLife(lifeLeft);
        return true;
    }

    public boolean barbaric_attack(Hero hero){
        int damage = this.weapon1.getDamage();
        int lifeLeft = hero.pointOfLife - damage;
        hero.setPointOfLife(lifeLeft);
        return true;
    }
}

