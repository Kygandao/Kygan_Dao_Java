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
    public void shouldCreateTwoIdenticalCharacters() {
        String failMsg = "Expected to create two identical characters";

        Villager villager1 = new Villager();
        villager1.setName("Boring Plain Villager");
        villager1.setStrength(5);
        villager1.setStamina(5);
        villager1.setSpeed(5);
        villager1.setAttackPower(5);
        villager1.setHealth(100);
        villager1.isRunning(true);
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

}