package org.example.model;

public class Bag {
    private Integer wood;

    private Integer rock;

    private Integer food;

    private Integer iron;

    public Bag(Integer wood, Integer rock, Integer food, Integer iron) {
        this.wood = 0;
        this.rock = 0;
        this.food = 0;
        this.iron = 0;
    }

    public Integer getWood() {
        return wood;
    }

    public void addWood() {
        this.wood++;
    }

    public void takeWood() {
        this.wood--;
    }

    public Integer getRock() {
        return rock;
    }

    public void addRock() {
        this.rock++;
    }

    public void takeRock() {
        this.rock--;
    }

    public Integer getFood() {
        return food;
    }

    public void addFood() {
        this.food++;
    }

    public void takeFood() {
        this.food--;
    }

    public Integer getIron() {
        return iron;
    }

    public void addIron() {
        this.iron++;
    }

    public void takeIron() {
        this.iron--;
    }
}
