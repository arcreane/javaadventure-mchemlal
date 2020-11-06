package com.dungeon_and_monsters;
import java.util.Scanner;
import java.util.Random;


public class Game_Launcher{
    Monsters magician = new Monsters("magician", 200, 200, true);
    Monsters barbarian = new Monsters("barbarian", 200, 200, true);

    Weapons weapon1 = new Weapons("axe", 0);
    Weapons weapon2 = new Weapons("thunder", 0);






    //Magician magician;
    //Barbaric barbaric;
    Hero hero = new Hero("john", 200, 200, true);
    //private Object Dugeon;


    /*public void launchGame(){

    Scanner sc = new Scanner(System.in);

    magician.weapon2

        System.out.println("you are about to enter the game");
        System.out.println("once you open door you run into a monster");
        System.out.println("");

        Dugeon room1 = new Dugeon(1, false);

        Monsters [] arrayMonsters = {magician, barbarian};
        int nbreAttack;
        for(nbreAttack = 0; nbreAttack <6; nbreAttack++){

        }*/
   /* Dugeon room1 = new Dugeon(1, false);
    Dugeon room2 = new Dugeon(2, false);
    Dugeon dugeon [] = {room1, room2};

    for(int room = 0; room < 2; room++){
        if(room1.getInTheRoom()){
            hero.heroAttack_Magician_Method(magician);
        }
    }*/
    Monsters [] arrayMonsters = {magician, barbarian};
        public void room2(){
            Random rand = new Random();
            int monsters = rand.nextInt(arrayMonsters.length);
            System.out.println("Here is the " + monsters);
            System.out.println(hero.getName() + "Type in Sword" + hero.getHeroWeapon() + "and fight");
            Scanner sc = new Scanner(System.in);
            String pickWeapon = sc.nextLine();
            switch (pickWeapon){
                case "Sword" :
                    Weapons weaponHero = new Weapons("Sword", 0);
                break;

                System.out.println("type 1 to get to fight");
                Scanner sc1 = new Scanner(System.in);
                int fight = sc1.nextInt();

            switch (fight){
                case 1:
            //magician.weapon2.getDamage()
            //int attack = 5;
            for(int i = 0; i <= 5; i++){
                boolean b = ;
                //if(hero.heroAttack_Magician_Method(magician)){
                if (hero.heroAttack_Magician_Method(magician)){
                    if(magician.getPointOfLife()<=0) {
                        magician.setPointOfLife(0);
                        System.out.println("Awesome, you have defeated the mighty Magician ! You can move on to the next level.");
                        System.out.println("You still have " + hero.getPointOfLife() + " points of life");
                            }else{
                                System.out.println("The mighty Magician still have " + magician.getPointOfLife() + " left.");

                }

            }

        //swith ()

            inTheRoom = true;
            Magician magician = new Magician("Sim", 200, 200, true );
        }

        }

       /* Scanner sc = new Scanner(System.in);
        System.out.println("select MAGICIAN or BARBARIC");

        //Barbaric barbaric = new Barbaric("C Jérôme", 200, 200, true);
        String chooseMonster = sc.nextLine();

        switch (chooseMonster){
            case "MAGICIAN":
                Magician magician = new Magician("Sim", 200, 200, true );
                System.out.println("choose the flask");
                String flask = sc.nextLine();
                Hero hero1 = new Hero("robert", 50, 50, true);
                int attack;
                for(attack = 0; attack < 5; attack++ ){
                    hero1.heroAttack_Magician_Method(magician);
                    if(magician.isDead()){
                        hero1
                    }
                }

                break;
            case "BARBARIC":
                Barbaric barbaric = new Barbaric("C Jérôme", 200, 200, true);
                System.out.println("choose the sword");
                String sword = sc.nextLine();
                //methode attack
                break;
            default:
                System.out.println("you must choose a weapon moron !");



        }

        //String chooseWeaponRoom1 = sc.nextLine();*/








}



}
