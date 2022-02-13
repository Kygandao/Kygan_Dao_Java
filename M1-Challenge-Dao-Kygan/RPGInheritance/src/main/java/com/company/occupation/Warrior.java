package com.company.occupation;

import com.company.Villager;

public class Warrior extends Villager {

    //initial property values
    protected int strength = 75;
    protected int stamina = 100;
    protected int speed = 50;
    protected int attackPower = 10;

    //initial warrior unique property
    protected int shieldStrength = 100;

    //warrior unique property
    public int getShieldStrength() {
        return shieldStrength;
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
        System.out.println("The Warrior Class Character Attacks!!!");
    }
}
