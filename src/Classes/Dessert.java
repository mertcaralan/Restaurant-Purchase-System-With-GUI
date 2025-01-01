package Classes;

import java.util.Scanner;

public class Dessert extends Meal{

	public Dessert(String name,String size,int counter,double price) {
		super(name,size,counter,price);
	}
	
	@Override
    public String getDescription() {
        return "Dessert: A sweet treat to end your meal.";
    }
	
	@Override
	public String toString() { 
		return super.toString() + 
		"\nDessert Name : " + this.getName() +
		"\nDessert Price : " + this.getPrice(); 
	}

}