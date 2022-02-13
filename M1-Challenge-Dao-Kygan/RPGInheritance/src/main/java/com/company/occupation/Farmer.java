package com.company.occupation;

import com.company.Villager;

public class Farmer extends Villager {

    //initial property values
    protected int strength = 75;
    protected int stamina = 75;
    protected int speed = 10;
    protected int attackPower = 1;
    protected boolean plowing = false;
    protected boolean harvesting = false;

    //get
    public int getStrength() {
        return strength;
    }

    public int getStamina() {
        return stamina;
    }

    public int getSpeed() {
        return speed;
    }

    public int getAttackPower() {
        return attackPower;
    }

    //get & set farmer unique properties of PLOWING & HARVESTING
//    public void setPlowing(boolean plowing) {
//        this.plowing = plowing;
//    }

    public boolean getPlowing() {
        return plowing;
    }

//    public void setHarvesting(boolean harvesting) {
//        this.harvesting = harvesting;
//    }

    public boolean getHarvesting() {
        return harvesting;
    }


    //abilities
    @Override
    public void attackAnotherCharacter() {
        System.out.println("The Farmer Class Character Attacks!!!");
    }
}
