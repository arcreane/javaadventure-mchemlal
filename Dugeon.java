package com.dungeon_and_monsters;

public class Dugeon {

    public Magician magician;
    public Barbaric barbaric;
    public int salle;
    public boolean inTheRoom;

    public Dugeon {
        this.salle = 2;
        this.inTheRoom = false;
    }



    public Dugeon (int salle, boolean inTheRoom){
        this.setSalle(salle);
        this.setInTheRoom(inTheRoom);
    }

    public void setInTheRoom(boolean inTheRoom) { //private
        this.inTheRoom = inTheRoom;
    }

    private void setSalle(int salle) { //private
        this.salle = salle;
    }

    public int getSalle() {
        return salle;
    }

    public boolean getInTheRoom() {
        return inTheRoom;
    }




}
