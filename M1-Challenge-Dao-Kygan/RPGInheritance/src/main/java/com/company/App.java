package com.company;

import com.company.models.Constable;
import com.company.models.Farmer;
import com.company.models.Warrior;

public class App {
    public static void main(String[] args) {
        Villager villager = new Villager();
        Farmer farmer = new Farmer();
        Constable constable = new Constable();
        Warrior warrior = new Warrior();

        //NON-CLASS VILLAGER CREATION
        System.out.println("=======");
        villager.setName("Boring Villager #1");
        System.out.println(villager.getName());
        System.out.println(villager.getName() + " Health : " + villager.getHealth());
        System.out.println(villager.getName() + " Strength : " + villager.getStrength());
        System.out.println(villager.getName() + " Stamina : " + villager.getStamina());
        System.out.println(villager.getName() + " Speed : " + villager.getSpeed());
        System.out.println(villager.getName() + " Attack Power : " + villager.getAttackPower());
        System.out.println(villager.getName() + " Is Running? : " + villager.isRunning(false));
        System.out.println(villager.getName() + " Is Arrested? : " + villager.isArrested(false));
        villager.attackAnotherCharacter();

        //FARMER CREATION
        System.out.println("=======");
        farmer.setName("Bob The Peanut Farmer");
        System.out.println(farmer.getName());
        System.out.println(farmer.getName() + " Health : " + farmer.getHealth());
        System.out.println(farmer.getName() + " Strength : " + farmer.getStrength());
        System.out.println(farmer.getName() + " Stamina : " + farmer.getStamina());
        System.out.println(farmer.getName() + " Speed : " + farmer.getSpeed());
        System.out.println(farmer.getName() + " Attack Power : " + farmer.getAttackPower());
        System.out.println(farmer.getName() + " Is Plowing : " + farmer.isPlowing());
        System.out.println(farmer.getName() + " Is Harvesting : " + farmer.isHarvesting());
        System.out.println(farmer.getName() + " Is Running? : " + farmer.isRunning(false));
        System.out.println(farmer.getName() + " Is Arrested? : " + farmer.isArrested(false));
        farmer.attackAnotherCharacter();

        //CONSTABLE CREATION
        System.out.println("=======");
        constable.setName("PoPo The Constable");
        System.out.println(constable.getName());
        System.out.println(constable.getName() + " Health : " + constable.getHealth());
        System.out.println(constable.getName() + " Strength : " + constable.getStrength());
        System.out.println(constable.getName() + " Stamina : " + constable.getStamina());
        System.out.println(constable.getName() + " Speed : " + constable.getSpeed());
        System.out.println(constable.getName() + " Attack Power : " + constable.getAttackPower());
        System.out.println("Does " + constable.getName() + " Have Jurisdiction? : " + constable.isJurisdiction());
        System.out.println(constable.getName() + " Is Running? : " + constable.isRunning(false));
        System.out.println(constable.getName() + " Is Arrested? : " + constable.isArrested(false));
        constable.attackAnotherCharacter();
        constable.arrestAnotherCharacter();

        //WARRIOR CREATION
        System.out.println("=======");
        warrior.setName("Sturla Bonecrusher");
        System.out.println(warrior.getName());
        System.out.println(warrior.getName() + " Health : " + warrior.getHealth());
        System.out.println(warrior.getName() + " Strength : " + warrior.getStrength());
        System.out.println(warrior.getName() + " Stamina : " + warrior.getStamina());
        System.out.println(warrior.getName() + " Speed : " + warrior.getSpeed());
        System.out.println(warrior.getName() + " Attack Power : " + warrior.getAttackPower());
        System.out.println(warrior.getName() + " Shield Strength : " + warrior.getShieldStrength());
        System.out.println(warrior.getName() + " Is Running? : " + warrior.isRunning(false));
        System.out.println(warrior.getName() + " Is Arrested? : " + warrior.isArrested(false));
        warrior.attackAnotherCharacter();



    }
}
