package com.dungeon_and_monsters;

/** We will create a class charaters in which we will define the common charaters' properties who
 * will take part in the entire game.
 * 1 method about "isDead" where we use la boolean to
  */

public class Characters {

    //attributes -> related to common properties shared between characters (Hero, the magician, the barbaric)

    public String name;  //private
    public int pointOfLife; //private
    public int maxLife; //private
    public boolean alive; //private
    public Object heroSwordWeapon;

    //constructor
    public Characters() {
        this.name = "";
        this.pointOfLife = 200;
        this.maxLife = 200;
        this.alive = false;
    }

    public Characters(String name, int pointOfLife, int maxLife, boolean alive){
        this.setName(name);
        this.setPointOfLife(pointOfLife);
        this.setMaxLife(maxLife);
        this.setAlive(alive);
    }


    //accessors

    //_______________________ setting and getting alive
    public void setAlive(boolean alive) {
        this.alive = alive;
    }
    public boolean getAlive (){
        return alive;
    }

    //________________________ setting and getting maxLife

    public void setMaxLife(int maxLife) {
        this.maxLife = maxLife;
    }
    public int getMaxLife(){
        return maxLife;
    }

    //_________________________ setting and getting pointOfLife

    public void setPointOfLife(int pointOfLife) {
        this.pointOfLife = pointOfLife;
    }

    public int getPointOfLife() {
        return pointOfLife;
    }
    //__________________________ setting and getting name

    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public boolean isDead (Characters perso) {
        if(perso.getPointOfLife() <= 0) {
            perso.setPointOfLife(0);
            perso.setAlive(false);
            //System.out.println(Characters.);
        }
        return this.getAlive();
    }
}
