package Classes;

import java.util.Scanner;

public class Wrap extends Food{

	private int wrapChoice;

	public Wrap(String name,String size,int counter,double price) {
		super(name,size,counter,price);
	}
	@Override
    public String getDescription() {
        return "Wrap: A delicious meal wrapped in a tortilla.";
    }

	@Override
    public String toString() {
        return super.toString() + 
		"\nWrap Name : " + this.getName() +
		"\nWrap Price : " + this.getPrice(); 
		
    }

}
