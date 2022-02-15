package com.company;

import com.company.models.Constable;
import com.company.models.Farmer;
import com.company.models.Warrior;

public class App {
    public static void main(String[] args) {
        Farmer farmer = new Farmer();
        Constable constable = new Constable();
        Warrior warrior = new Warrior();

        //FARMER CREATION
        System.out.println("=======");
        System.out.println("Farmer Health : " + farmer.getHealth());
        System.out.println("Farmer Strength : " + farmer.getStrength());
        System.out.println("Farmer Stamina : " + farmer.getStamina());
        System.out.println("Farmer Speed : " + farmer.getSpeed());
        System.out.println("Farmer Attack Power : " + farmer.getAttackPower());
        System.out.println("Farmer plowing : " + farmer.isPlowing());
        System.out.println("Farmer harvesting : " + farmer.isHarvesting());
        System.out.println("Is Farmer Running? : " + farmer.isRunning());
        System.out.println("Is Farmer Arrested? : " + farmer.isArrested());
        farmer.attackAnotherCharacter();

        //CONSTABLE CREATION
        System.out.println("=======");
        System.out.println("Constable Health : " + constable.getHealth());
        System.out.println("Constable Strength : " + constable.getStrength());
        System.out.println("Constable Stamina : " + constable.getStamina());
        System.out.println("Constable Speed : " + constable.getSpeed());
        System.out.println("Constable Attack Power : " + constable.getAttackPower());
        System.out.println("Does Constable Have Jurisdiction? : " + constable.isJurisdiction());
        System.out.println("Is Constable Running? : " + constable.isRunning());
        System.out.println("Is Constable Arrested? : " + constable.isArrested());
        constable.attackAnotherCharacter();
        constable.arrestAnotherCharacter();

        //WARRIOR CREATION
        System.out.println("=======");
        System.out.println("Warrior Health : " + warrior.getHealth());
        System.out.println("Warrior Strength : " + warrior.getStrength());
        System.out.println("Warrior Stamina : " + warrior.getStamina());
        System.out.println("Warrior Speed : " + warrior.getSpeed());
        System.out.println("Warrior Attack Power : " + warrior.getAttackPower());
        System.out.println("Warrior Shield Strength : " + warrior.getShieldStrength());
        System.out.println("Is Warrior Running? : " + warrior.isRunning());
        System.out.println("Is Warrior Arrested? : " + warrior.isArrested());
        warrior.attackAnotherCharacter();

    }
}
