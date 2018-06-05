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

    public String outputSomeValueToTheScreen() {

        return "Name: " + getName() + "Color " + getColor() + " Speed " + getAmountOfSpeed() + "Power " + getAmountOfPower();
    }

    @Override
    public String toString() {

        /* return String.format("%s: %s %s: %s %s: %d %s: %d %s: %d %s: %b", "Name", getName(), "Color", getColor(), "Speed", getAmountOfSpeed(), "Power",
                getAmountOfPower(), "Number Of Legs", numberOfLegs, "Fight", canHuntOtherAnimals);
                */

        return super.toString() + String.format("%s: %d %s: %b", "Number Of Legs", numberOfLegs, "Fight", canHuntOtherAnimals) + " Animal Value: " + evaluateAnumalValue();

    }
}
