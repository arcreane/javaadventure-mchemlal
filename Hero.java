package com.dungeon_and_monsters;

public class Hero extends Characters{

    Weapons weaponHero;

    public Hero(String name, int pointOfLife, int maxLife, boolean alive, Weapons weaponHero){
        super(name, pointOfLife, maxLife, alive);
        this.setWeaponHero(weaponHero);
    }

    public void setWeaponHero(Weapons weaponHero) {
        this.weaponHero = weaponHero;
    }

    public Weapons getWeaponHero() {
        return weaponHero;
    }


    public boolean heroAttack_Magician_Method(Monsters magician){
        int damage = this.weaponHero.getDamage();
        int lifeLeftMagician = magician.pointOfLife - damage;
        magician.setPointOfLife(lifeLeftMagician);
        return true;
    }

    public boolean heroAttack_Barbaric_Method(Monsters barbaric){
        int damage = this.weaponHero.getDamage();
        int lifeLeftBarbaric = barbaric.pointOfLife - damage;
        barbaric.setPointOfLife(lifeLeftBarbaric);
        return true;
    }










}
