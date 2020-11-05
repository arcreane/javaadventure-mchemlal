package com.dungeon_and_monsters;

public class Hero extends Characters{

    //properties
    // à voir - public Weapons heroFlaskWeapon = new Weapons("", 0);
    public Weapons heroSwordWeapon = new Weapons("Sword", 10);

    //constructor

    public Hero(String name, int pointOfLife, int maxLife, boolean alive){
        super(name, pointOfLife, maxLife, alive);
        //this.setHeroFlaskWeapon(heroFlaskWeapon);
        this.setHeroSwordWeapon(heroSwordWeapon);
    }




    private void setHeroSwordWeapon(Weapons heroSwordWeapon) {
        this.heroSwordWeapon = heroSwordWeapon;
    }

    public Weapons getHeroSwordWeapon() {
        return heroSwordWeapon;
    }

    //public void setHeroFlaskWeapon(Weapons heroFlaskWeapon) {
        //this.heroFlaskWeapon = heroFlaskWeapon;
    //}
    //public Weapons getHeroFlaskWeapon(){
        //return heroFlaskWeapon;
    //}

    // method hero attack magician or barbaric
    public void heroAttack_Magician_Method(Magician magician){
        int damage = this.heroSwordWeapon.getDamage();
        int lifeLeftMagician = magician.pointOfLife - damage;
        //magician.pointOfLife = lifeLeftMagician - damage;
        magician.setPointOfLife(lifeLeftMagician);
    }

    public void heroAttack_Barbaric_Method(Barbaric barbaric){
        int damage = this.heroSwordWeapon.getDamage();
        int lifeLeftBarbaric = barbaric.pointOfLife - damage;
        barbaric.setPointOfLife(lifeLeftBarbaric);
    }



    //accessors




}
