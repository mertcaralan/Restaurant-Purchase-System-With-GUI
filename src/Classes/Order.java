package Classes;
import java.util.ArrayList;

public class Order {
    
    private Customer customer;
    private ArrayList<Meal> meals;
    private double orderPrice;
    private int orderID;
    private int orderCount;
    private TotalDiscount discount;

    public Order(Customer customer) {
        this.customer = customer;
        this.meals = new ArrayList<>();
        this.orderID = generateRandomID();
        this.orderCount = 0;
        this.discount = new TotalDiscount();
    }

    private int generateRandomID() {
        int min = 1000;
        int max = 9999;
        return (int) (Math.random() * (max - min + 1)) + min;
    }

    public void addMeal(Meal meal) {
        this.meals.add(meal);
        this.orderPrice = meal.getPrice() * meal.getCounter();
        this.orderCount = meal.getCounter();
    }

    public boolean deleteMeal(Meal meal) {
        return this.meals.remove(meal);
    }

    public void calculateOrderPrice() {
        if (discount.isDiscountApplicable(this.orderPrice)) {
            double discountAmount = discount.calculateDiscount(this.orderPrice);
            this.orderPrice -= discountAmount;
        }
    }

    // Getters
    public Customer getCustomer() {
        return customer;
    }

    public ArrayList<Meal> getMeals() {
        return meals;
    }

    public int getOrderID(){
        return orderID;
    }
    
    public int getOrderCount(){
        return orderCount;
    }

    public double getOrderPrice(){
        return orderPrice;
    }
    
    public void setOrderPrice(double orderPrice) {
    	this.orderPrice = orderPrice * getOrderCount();
    }

    @Override
    public String toString() {
	    StringBuffer sb = new StringBuffer();
	
	    for (Meal meal : meals) {
	        sb.append(meal.toString()).append("\n");
	        sb.append("Total Meal Price: ").append(String.format("%.2f", getOrderPrice())).append(" TL\n");
	        sb.append(meal.getDescription()).append("\n");
	        sb.append("--------------------------------------\n");
	    }
	    
	    if (discount.isDiscountApplicable(orderPrice)) {
	    	calculateOrderPrice();
		    sb.append("Total Price (After Discount): ").append(String.format("%.2f", getOrderPrice())).append(" TL\n");
		    sb.append("\n======================================\n");
        }
	
	    return sb.toString();
}
}
