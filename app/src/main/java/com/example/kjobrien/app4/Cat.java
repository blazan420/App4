package com.example.kjobrien.app4;

public class Cat extends Animal{

    // Instance variables



    private final int numberOfLegs;
    private boolean canHuntOtherAnimals;

    // Constructor

    public Cat(String name, String color, int amountOfSpeed, int amountOfPower, int numberOfLegs, boolean canHuntOtherAnimals){

        super(name, color, amountOfSpeed, amountOfPower);

        this.numberOfLegs = numberOfLegs;
        this.canHuntOtherAnimals = canHuntOtherAnimals;
    }




    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public boolean getCanHuntOtherAnimals() {
        return canHuntOtherAnimals;
    }

    public void setCanHuntOtherAnimals(boolean canHuntOtherAnimals) {
        this.canHuntOtherAnimals = canHuntOtherAnimals;
    }

    @Override
    public String toString() {


    }
}
