package Classes;

import java.util.Scanner;

public abstract class Meal {
    private String name;
    private String size;
    private int counter;
    private double price;
    private int itemID;

    public Meal() {
    	this.name = "No Name";
        this.size = "No Size";
        this.counter = 0;
        this.price = 0;
    }
    
    public Meal(String name,String size,int counter,double price) {
        this.name = name;
        this.size = size;
        this.counter = counter;
        this.price = price;
    }
    
    // Abstract method to be implemented by subclasses
    public abstract String getDescription();

    // Getters and setters for name
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getters and setters for size
    public String getSize() {
        return this.size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    // Getters and setters for counter
    public int getCounter() {
        return this.counter;
    }

    public void setCounter() {
        this.counter++;
    }

    // Getters and setters for price
    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Getters and setters for itemID
    public int getItemID() {
        return this.itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    // toString
    @Override
    public String toString() {
        return "\nSize = " + this.size +
               "\nCounter = " + this.counter;
    }
}