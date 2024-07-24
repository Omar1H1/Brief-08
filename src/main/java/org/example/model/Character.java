package org.example.model;


public abstract class Character {
    protected Integer health = 10;
    protected Integer strength = 0;

    protected Bag bag = new Bag(0, 0, 0, 0);


    public  Integer getHealth() {
        if (health < 10) {
            this.health += bag.getFood();
        }

        return health;
    };

    public void addHealth() {
        this.health++;
    }

    public void TakeDamage() {
        if (this.health > 0) {
            this.health --;
        } else {
            System.out.println("Game Over, you are dead");
        }
    }

    public Integer getStrength() {
        if (strength < 10) {
            this.strength += bag.getIron();
        }

        return strength;
    };

    public void addResources(Resources resources) {
        switch (resources) {
            case Food -> bag.addFood();
            case Wood -> bag.addWood();
            case Iron -> bag.addIron();
            default -> bag.addRock();
        }
    }


    public Integer getFood() {
        return bag.getFood();
    }

    public void addFood() {
        bag.addFood();
    }

    public Integer getWood() {
        return bag.getWood();
    }

    public Integer getIron() {
        return bag.getIron();
    }

    public Integer getRock() {
        return bag.getRock();
    }

    public void takeFood () {
        bag.takeFood();
    }

    public void takeWood () {
        bag.takeWood();
    }

    public void takeIron () {
        bag.takeIron();
    }

    public void TakeRock () {
        bag.takeRock();
    }
}
