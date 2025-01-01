package Classes;

import java.util.Scanner;

public class Snack extends Food{

	public Snack(String name,String size,int counter,double price) {
		super(name,size,counter,price);
	}
	@Override
    public String getDescription() {
        return "Snack: A light and crispy treat to enjoy.";
    }

	@Override
	public String toString() { 
		return super.toString() + 
		"\nSnack Name : " + this.getName() +
		"\nSnack Price : " + this.getPrice(); 
	}

}