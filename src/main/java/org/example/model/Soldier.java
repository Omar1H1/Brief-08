package org.example.model;

public class Soldier extends Character {
    protected Location location;
    public Soldier(Location location) {
        super();
        this.health = 15;
        this.strength = 5;
        this.location = location;
    }

    public void attack (Soldier soldier) {
        if (this.location == Location.Wall) {

        if (soldier.strength > this.strength) {
                if (this.health > 0) {
                    this.health--;
                    System.out.println("Too bad, he's stronger than you, be careful  you're taking damage ");
                } else {
                    System.out.println("Game over you're dead");
                }
            } else if (soldier.strength == this.strength) {
                System.out.println("Woow!! he's as Strong as you !!");
            } else {
                if (soldier.health == 0) {
                    System.out.println("You have Won the fight, congratulations!");
                } else {
                    soldier.health--;
                    System.out.println("Great you're dealing damage, keep going");
                }
            }

        } else {
            System.out.println("You can't fight outside the Wall");
        }

    }
    @Override
    public void addResources(Resources resources) {
        if (resources == Resources.Iron) {
            this.strength++;
        }

        switch (resources) {
            case Food -> bag.addFood();
            case Wood -> bag.addWood();
            case Iron -> bag.addIron();
            default -> bag.addRock();
        }
    }
}
