package com.example.kjobrien.app4;

public class Animal extends Object{

    // Instance variables

    protected final String name;
    protected final String color;
    protected int amountOfSpeed;
    protected int amountOfPower;

    public Animal(String name, String color, int amountOfSpeed, int amountOfPower ){

        // Initialized these instance variables
        this.name = name;
        this.color = color;
        this.amountOfSpeed = amountOfSpeed;
        this.amountOfPower = amountOfPower;

    }

    // Getter Methods

    public String getName(){ return name; }
    public String getColor(){return color; }

    public void setAmountOfSpeed(int amountOfSpeed){
        this.amountOfSpeed = amountOfSpeed;
    }

    public int getAmountOfSpeed(){ return amountOfSpeed; }

    public void setAmountOfPower(int amountOfPower){ this.amountOfPower = amountOfPower; }
    public  int getAmountOfPower(){ return amountOfPower; }

    public int evaluateAnumalValue() {

        int result = amountOfSpeed * amountOfPower;
        return result;
    }

    @Override
    public String toString() {

        return String.format("%s: %s %s:%s %s: %d %s: %d ", "Name: ", name, "Color ",  color, "Speed", amountOfSpeed, "Power", amountOfPower);


    }
}
