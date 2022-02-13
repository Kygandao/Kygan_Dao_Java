package com.company.occupation;

import com.company.Villager;

public class Constable extends Villager {

    //initial property values
    private int strength = 60;
    private int stamina = 60;
    private int speed = 20;
    private int attackPower = 5;

    //constable unique property
    private boolean jurisdiction = false;


    //getters & setters
    @Override
    public int getStrength() {
        return strength;
    }

    @Override
    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public int getStamina() {
        return stamina;
    }

    @Override
    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public int getAttackPower() {
        return attackPower;
    }

    @Override
    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public boolean isJurisdiction() {
        return jurisdiction;
    }

    public void setJurisdiction(boolean jurisdiction) {
        this.jurisdiction = jurisdiction;
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
