package com.company;

import java.util.Objects;

public class Villager {

    //common properties
    private String name;
    private int strength;
    private int stamina;
    private int speed;
    private int attackPower;

    //only these properties share common value
    private int health = 100;
    private boolean running = false;
    private boolean arrested = false;

    //common ability
    private String attackAnotherCharacter;


    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public boolean isRunning(boolean b) {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

    public boolean isArrested(boolean b) {
        return arrested;
    }

    public void setArrested(boolean arrested) {
        this.arrested = arrested;
    }


    //villager abilities
    public void attackAnotherCharacter() {
        System.out.println("The Villager Character Attacks!!!");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Villager villager = (Villager) o;
        return strength == villager.strength && stamina == villager.stamina && speed == villager.speed && attackPower == villager.attackPower && health == villager.health && running == villager.running && arrested == villager.arrested && Objects.equals(name, villager.name) && Objects.equals(attackAnotherCharacter, villager.attackAnotherCharacter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, strength, stamina, speed, attackPower, health, running, arrested, attackAnotherCharacter);
    }

    @Override
    public String toString() {
        return "Villager{" +
                "name='" + name + '\'' +
                ", strength=" + strength +
                ", stamina=" + stamina +
                ", speed=" + speed +
                ", attackPower=" + attackPower +
                ", health=" + health +
                ", running=" + running +
                ", arrested=" + arrested +
                ", attackAnotherCharacter='" + attackAnotherCharacter + '\'' +
                '}';
    }
}
