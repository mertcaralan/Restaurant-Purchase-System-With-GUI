package Classes;

import java.util.Scanner;

public class Burger extends Food{

	private int burgerChoice;

	public Burger(String name,String size,int counter,double price) {
		super(name,size,counter,price);
	}
	
	@Override
    public String getDescription() {
        return "Burger: A tasty sandwich with a patty and bun.";
    }

	@Override
	public String toString() { 
		return super.toString() + 
		"\nBurger Name : " + this.getName() +
		"\nBurger Price : " + this.getPrice(); 
	}
}
