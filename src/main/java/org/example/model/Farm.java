package org.example.model;

public class Farm {

    private int crops;

    public Farm() {
        this.crops = 0;
    }

    public void GetCrops(Villager villager) {
        if (crops > 0) {
            villager.addFood();
            System.out.println("Getting food, Great Work");
            crops--;
        } else {
            System.out.println("Not enough crops in stock, try to cultivate some");
        }
    }

    public void MakeCrops(Villager villager) {


         if (villager.getHealth() > 0) {
             villager.TakeDamage();
             System.out.println("Making crops, Great Work");
             crops++;
         } else {
             System.out.println("Not enough Health to make crops, Hint : Maybe go to sleep !!");
         }
    }
}
