package com.company;

public abstract class Villager {

    //common properties
    protected String name;
    protected int strength;
    protected int stamina;
    protected int speed;
    protected int attackPower;

    //only these properties share common value
    protected int health = 100;
    protected boolean running = false;
    protected boolean arrested = false;

    //common ability
    protected String attackAnotherCharacter;


    //get & set name
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    //get & set strength
    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getStrength(){
        return strength;
    }

    //get & set health
    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth(){
        return health;
    }

    //get & set stamina
    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getStamina(){
        return stamina;
    }

    //get & set speed
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed(){
        return speed;
    }

    //get & set attackPower
    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public int getAttackPower(){
        return attackPower;
    }

    //get & set running
    public void setRunning(boolean running) {
        this.running = running;
    }

    public boolean getRunning(){
        return running;
    }

    //get & set arrested
    public void setArrested(boolean arrested) {
        this.arrested = arrested;
    }

    public boolean getArrested(){
        return arrested;
    }

    //common ability
    public void attackAnotherCharacter() {
        System.out.println("Attacking Another Character from Villager Class!!!");
    }

}
