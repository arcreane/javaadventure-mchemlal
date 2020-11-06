package com.dungeon_and_monsters;

public class Hero extends Characters{

    Monsters magician = new Monsters("magician", 200, 200, true);
    Monsters barbarian = new Monsters("barbarian", 200, 200, true);
    public Weapons heroWeapon;




    //properties


    //constructor

    public Hero(String name, int pointOfLife, int maxLife, boolean alive){
        super(name, pointOfLife, maxLife, alive);
        //this.setHeroFlaskWeapon(heroFlaskWeapon);
        this.setHeroWeapon(heroWeapon);
    }




    public void setHeroWeapon(Weapons heroWeapon) {
        this.heroWeapon = heroWeapon;
    }

    public Weapons getHeroWeapon() {
        return heroWeapon;
    }



    // method hero attack magician or barbaric
    public boolean heroAttack_Magician_Method(Monsters magician){
        int damage = this.heroWeapon.getDamage();
        int lifeLeftMagician = magician.pointOfLife - damage;
        //magician.pointOfLife = lifeLeftMagician - damage;
        magician.setPointOfLife(lifeLeftMagician);
        return true;
    }

    public void heroAttack_Barbaric_Method(Monsters barbaric){
        int damage = this.heroWeapon.getDamage();
        int lifeLeftBarbaric = barbaric.pointOfLife - damage;
        barbaric.setPointOfLife(lifeLeftBarbaric);
    }

    //public void attackMonsters



    //accessors




}
