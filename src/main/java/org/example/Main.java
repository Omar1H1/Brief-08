package org.example;

import org.example.model.*;


public class Main {
    public static void main(String[] args) {
        // Create Farmer
        Villager farmer = new Villager();

        //Make it work at the Farm
        // Create Farm
        Farm farm = new Farm();
        System.out.println("Farmer health before working: " + farmer.getHealth());
        System.out.println("Farmer stock of Food before working : " + farmer.getFood());
        farm.MakeCrops(farmer);

        System.out.println("Farmer health after working: " + farmer.getHealth());


        //Take the profit you Made from the Farm
        farm.GetCrops(farmer);
        System.out.println("Farmer health after getting food: " + farmer.getHealth());
        System.out.println("Farmer stock of Food after getting food: " + farmer.getFood());

        House house = new House();
        // Farmer can get health by sleeping in the house
        house.Sleep(farmer);
        System.out.println("Farmer health After sleeping in the house: " + farmer.getHealth());

        Forger forger = new Forger();

        System.out.println("Forger Strength before creating a weapon: " + forger.getStrength());

        // Forger needs Iron to make weapons
        forger.addResources(Resources.Iron);

        Forgery forgery = new Forgery();

        //Forger needs to go to the Forgery to create weapons
        forgery.CreateSword(forger);

        System.out.println("Forger Strength After creating a weapon: " + forger.getStrength());

        Soldier soldier1 = new Soldier(Location.Wall);
        Soldier soldier2 = new Soldier(Location.Wall);
        System.out.println("Solder 1 health before attacking : " + soldier1.getHealth());

        // soldier1 want to fight with soldier 2
        // but both has the same level of power
        soldier1.attack(soldier2);
        System.out.println("Solder 1 health after first attack : " + soldier1.getHealth());
        //Soldier 2 is getting stronger by having more Iron
        soldier2.addResources(Resources.Iron);

        soldier1.attack(soldier2);
        System.out.println("Solder 1 health After second attack : " + soldier1.getHealth());


        System.out.println("Solder 1 health before sleeping : " + soldier1.getHealth());

        Barrack barrack = new Barrack();

        barrack.sleep(soldier1);

        System.out.println("Solder 1 health after sleeping : " + soldier1.getHealth());


    }
}