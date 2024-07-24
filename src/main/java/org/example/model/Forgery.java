package org.example.model;

public class Forgery {

    public void CreateSword(Forger forger){
        if (forger.getIron() > 0) {
            forger.wepeansList.add(Wepeans.Sword);
            forger.strength++;
            forger.takeIron();
            System.out.println("Sword Created Successfully you have : " + forger.wepeansList.size() + " Swords in the inventory ");
        } else {
            System.out.println("Not enough iron in your bag, unable to create sword");
        }
    }
}
