package Classes;

import java.util.Scanner;

public class ColdDrink extends Drink{

	public ColdDrink(String name,String size,int counter,double price) {
		super(name,size,counter,price);
	}

	@Override
    public String getDescription() {
        return "Cold Drink: A chilled beverage to refresh you.";
    }
	
	@Override
	public String toString() {
		return super.toString() + 
		"\nCold Drink Name : " + this.getName() +
		"\nCold Drink Price : " + this.getPrice(); 
	}

}
