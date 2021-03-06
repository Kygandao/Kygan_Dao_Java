package com.company.models;

import com.company.Villager;

import java.util.Objects;

public class Farmer extends Villager {

    //initial property values
    private int strength = 75;
    private int stamina = 75;
    private int speed = 10;
    private int attackPower = 1;
    private boolean plowing = false;
    private boolean harvesting = false;


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

    public boolean isPlowing() {
        return plowing;
    }

    public void setPlowing(boolean plowing) {
        this.plowing = plowing;
    }

    public boolean isHarvesting() {
        return harvesting;
    }

    public void setHarvesting(boolean harvesting) {
        this.harvesting = harvesting;
    }

    //abilities
    @Override
    public void attackAnotherCharacter() {
        System.out.println("The Farmer Class Character Attacks!!!");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Farmer farmer = (Farmer) o;
        return strength == farmer.strength && stamina == farmer.stamina && speed == farmer.speed && attackPower == farmer.attackPower && plowing == farmer.plowing && harvesting == farmer.harvesting;
    }

    @Override
    public int hashCode() {
        return Objects.hash(strength, stamina, speed, attackPower, plowing, harvesting);
    }

    @Override
    public String toString() {
        return "Farmer{" +
                "strength=" + strength +
                ", stamina=" + stamina +
                ", speed=" + speed +
                ", attackPower=" + attackPower +
                ", plowing=" + plowing +
                ", harvesting=" + harvesting +
                '}';
    }
}
