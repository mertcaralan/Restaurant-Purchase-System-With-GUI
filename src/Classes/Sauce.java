package Classes;

import java.util.Scanner;

public class Sauce extends Meal{

	public Sauce(String name,String size,int counter,double price) {
		super(name,size,counter,price);
	}
	
	@Override
    public String getDescription() {
        return "Sauce: A delicious condiment to enhance your meal.";
    }
	
	@Override
	public String toString() { 
		return super.toString() + 
		"\nSauce Name : " + this.getName() +
		"\nSauce Price : " + this.getPrice(); 
	}

}
