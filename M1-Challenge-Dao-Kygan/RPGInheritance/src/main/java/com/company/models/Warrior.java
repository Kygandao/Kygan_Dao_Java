package com.company.models;

import com.company.Villager;

import java.util.Objects;

public class Warrior extends Villager {

    //initial property values
    public int strength = 75;
    private int stamina = 100;
    private int speed = 50;
    private int attackPower = 10;

    //initial warrior unique property
    private int shieldStrength = 100;


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

    public int getShieldStrength() {
        return shieldStrength;
    }

    public void setShieldStrength(int shieldStrength) {
        this.shieldStrength = shieldStrength;
    }

    //abilities
    @Override
    public void attackAnotherCharacter() {
        System.out.println("The Warrior Class Character Attacks!!!");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Warrior warrior = (Warrior) o;
        return strength == warrior.strength && stamina == warrior.stamina && speed == warrior.speed && attackPower == warrior.attackPower && shieldStrength == warrior.shieldStrength;
    }

    @Override
    public int hashCode() {
        return Objects.hash(strength, stamina, speed, attackPower, shieldStrength);
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "strength=" + strength +
                ", stamina=" + stamina +
                ", speed=" + speed +
                ", attackPower=" + attackPower +
                ", shieldStrength=" + shieldStrength +
                '}';
    }
}
