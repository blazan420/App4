package com.example.kjobrien.app4;

public class Lion extends Cat {

    // instance variables for class

    private boolean isBrave;

    //Constructor
    public Lion(String name, String color, int amountOfSpeed, int amountOfPower,
                int numberOfLegs, boolean canHuntOtherAnimals, boolean isBrave) {

        // Instance variables are already declared! They were all inherited and I can use them.
        super(name, color, amountOfSpeed, amountOfPower,numberOfLegs, canHuntOtherAnimals);

        this.isBrave = isBrave;
    }

    public boolean getIsBrave() {
        return isBrave;
    }

    public void setBrave(boolean brave) {
        isBrave = brave;
    }

    @Override //type tostr then press ctrl+space to auto generate
    public String toString() {

        return super.toString() + String.format("&s: %b", "Brave", isBrave);

    }
}
