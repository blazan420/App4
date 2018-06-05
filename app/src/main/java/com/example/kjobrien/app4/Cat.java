package com.example.kjobrien.app4;

public class Cat extends Object{

    // Instance variables



    private final int numberOfLegs;
    private boolean canHuntOtherAnimals;

    // Constructor

    public Cat(int numberOfLegs, boolean canHuntOtherAnimals){


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
