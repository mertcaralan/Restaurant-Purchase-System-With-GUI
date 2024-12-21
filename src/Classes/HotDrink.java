package Classes;

import java.util.Scanner;

public class HotDrink extends Drink{
	
	private int hotDrinkChoice;
	
	public HotDrink(String name,String size,int counter,double price) {
		super(name,size,counter,price);
	}
	@Override
    public String getDescription() {
        return "Hot Drink: A warm and soothing beverage.";
    }

	@Override
	public String toString() {
		return super.toString() + 
		"\nHot Drink Name : " + this.getName() +
		"\nHot Drink Price : " + this.getPrice(); 
	}

}
