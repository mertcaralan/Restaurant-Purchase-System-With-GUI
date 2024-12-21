package Classes;

public class Drink extends Meal{

	public Drink(String name,String size,int counter,double price) {
		super(name,size,counter,price);
	}
	
	@Override
    public String getDescription() {
        return "Drink: A refreshing beverage to accompany your meal.";
    }

	@Override
	public String toString() {
		return super.toString();
	}
}
