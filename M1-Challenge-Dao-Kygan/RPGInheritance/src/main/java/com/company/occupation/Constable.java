package com.company.occupation;

import com.company.Villager;

public class Constable extends Villager {

    //initial property values
    protected int strength = 60;
    protected int stamina = 60;
    protected int speed = 20;
    protected int attackPower = 5;

    //constable unique property
    protected boolean jurisdiction = false;

    //get & set constable unique property of JURISDICTION
//    public void setJurisdiction(boolean jurisdiction) {
//        this.jurisdiction = jurisdiction;
//    }

    public boolean getJurisdiction() {
        return jurisdiction;
    }

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


    //abilities
    @Override
    public void attackAnotherCharacter() {
        System.out.println("The Constable Class Character Attacks!!!");
    }

    //constable unique ability
    public void arrestAnotherCharacter() {
        System.out.println("The Constable Class Arrests Another Character!!!");
    }
}
