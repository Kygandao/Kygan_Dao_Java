package com.company;

import com.company.models.Constable;
import com.company.models.Farmer;
import com.company.models.Warrior;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AppTest {

    Villager villager;
    Farmer farmer;
    Constable constable;
    Warrior warrior;


    @Before
    public void setUp() throws Exception {
        villager = new Villager();
        farmer = new Farmer();
        constable = new Constable();
        warrior = new Warrior();
    }

    @Test
    public void shouldCreateTwoIdenticalVillagers() {
        String failMsg = "Expected to create two identical characters";

        Villager villager1 = new Villager();
        villager1.setName("Boring Plain Villager");
        villager1.setStrength(5);
        villager1.setStamina(5);
        villager1.setSpeed(5);
        villager1.setAttackPower(5);
        villager1.setHealth(100);
        villager1.isRunning(false);
        villager1.isArrested(false);
        villager1.attackAnotherCharacter();
        System.out.println(villager1);

        Villager villager2 = new Villager();
        villager2.setName("Boring Plain Villager");
        villager2.setStrength(5);
        villager2.setStamina(5);
        villager2.setSpeed(5);
        villager2.setAttackPower(5);
        villager2.setHealth(100);
        villager2.isRunning(false);
        villager2.isArrested(false);
        villager2.attackAnotherCharacter();
        System.out.println(villager2);

        assertEquals(villager1, villager2);
    }

    @Test
    public void shouldCreateTwoIdenticalFarmers() {
        String failMsg = "Expected to create two identical characters";

        Farmer farmer1 = new Farmer();
        farmer1.setName("Farmer Steve");
        farmer1.setStrength(5);
        farmer1.setStamina(5);
        farmer1.setSpeed(5);
        farmer1.setAttackPower(5);
        farmer1.setHealth(100);
        farmer1.isRunning(false);
        farmer1.isArrested(false);
        farmer1.attackAnotherCharacter();
        System.out.println(farmer1);

        Farmer farmer2 = new Farmer();
        farmer2.setName("Farmer Steve");
        farmer2.setStrength(5);
        farmer2.setStamina(5);
        farmer2.setSpeed(5);
        farmer2.setAttackPower(5);
        farmer2.setHealth(100);
        farmer2.isRunning(false);
        farmer2.isArrested(false);
        farmer2.attackAnotherCharacter();
        System.out.println(farmer2);

        assertEquals(farmer1, farmer2);
    }

    @Test
    public void shouldCreateTwoIdenticalConstables() {
        String failMsg = "Expected to create two identical characters";

        Constable constable1 = new Constable();
        constable1.setName("Constable Harry");
        constable1.setStrength(5);
        constable1.setStamina(5);
        constable1.setSpeed(5);
        constable1.setAttackPower(5);
        constable1.setHealth(100);
        constable1.isRunning(false);
        constable1.isArrested(false);
        constable1.attackAnotherCharacter();
        System.out.println(constable1);

        Constable constable2 = new Constable();
        constable2.setName("Constable Harry");
        constable2.setStrength(5);
        constable2.setStamina(5);
        constable2.setSpeed(5);
        constable2.setAttackPower(5);
        constable2.setHealth(100);
        constable2.isRunning(false);
        constable2.isArrested(false);
        constable2.attackAnotherCharacter();
        System.out.println(constable2);

        assertEquals(constable1, constable2);
    }

    @Test
    public void shouldCreateTwoIdenticalWarriors() {
        String failMsg = "Expected to create two identical characters";

        Warrior warrior1 = new Warrior();
        warrior1.setName("Warrior Bjork");
        warrior1.setStrength(5);
        warrior1.setStamina(5);
        warrior1.setSpeed(5);
        warrior1.setAttackPower(5);
        warrior1.setHealth(100);
        warrior1.isRunning(false);
        warrior1.isArrested(false);
        warrior1.attackAnotherCharacter();
        System.out.println(warrior1);

        Warrior warrior2 = new Warrior();
        warrior2.setName("Warrior Bjork");
        warrior2.setStrength(5);
        warrior2.setStamina(5);
        warrior2.setSpeed(5);
        warrior2.setAttackPower(5);
        warrior2.setHealth(100);
        warrior2.isRunning(false);
        warrior2.isArrested(false);
        warrior2.attackAnotherCharacter();
        System.out.println(warrior2);

        assertEquals(warrior1, warrior2);
    }

}