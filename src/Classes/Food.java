package Classes;

public class Food extends Meal{

	public Food(String name,String size,int counter,double price) {
		super(name,size,counter,price);
	}
	
	@Override
    public String getDescription() {
        return "Food: A generic meal item.";
    }

	@Override
	public String toString() {
		return super.toString();
	}
}
