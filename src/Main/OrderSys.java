package Main;

import Classes.*;
import java.util.ArrayList;

public class OrderSys {
    public static ArrayList<Order> orders = new ArrayList<>();
    public static int totalCount = 0;
    public static double totalPrice = 0;
    public static Customer customer;
    
    public static void addOrder(String name,String size,int counter,double price) {
	        
	        Order order = new Order(customer);
	        Meal meal = null;
	        
	        switch(name) {
	            case "HAMBURGER":
	            case "CHEESEBURGER":
	            case "FISHBURGER":
	            case "CHICKENBURGER":
                    meal = new Burger(name,size,counter,price);
                    break;
	            case "VEGAN WRAP":
	            case "CHICKEN WRAP":
	            case "MEAT WRAP":
	            case "CEASAR WRAP":
                    meal = new Wrap(name,size,counter,price);
                    break;
	            case "FRENCH FRIES":
	            case "NUGGETS":
	            case "STRIPS":
	            case "ONION RING":
                    meal = new Snack(name,size,counter,price);
                    break;
	            case "COCA COLA":
	            case "FANTA":
	            case "SPRITE":
	            case "ICE TEA":
		             meal = new ColdDrink(name,size,counter,price);
		             break;
	            case "TEA":
	            case "COFFEE":
	            case "HOT CHOCOLATE":
	            case "SALEP":
		              meal = new HotDrink(name,size,counter,price);
		              break;
	            case "KETCHUP":
	            case "BBQ":
	            case "MAYONNAISE":
	            case "MUSTARD":
		              meal = new Sauce(name,size,counter,price);
		              break;
	            case "ICE CREAM":
	            case "DUBAI CHOCOLATE":
	            case "DONUT":
	            case "BAKLAVA":
		              meal = new Dessert(name,size,counter,price);
		              break;
	            }
	        
	        	meal.setPrice(calculatePrice(meal));
	            order.setOrderPrice(meal.getPrice());
	            order.addMeal(meal);
	            
	            totalCount += order.getOrderCount();
	            totalPrice += order.getOrderPrice();
	            
	            orders.add(order);
            
    }
    
    public static String displayOrders() {
	    StringBuffer text = new StringBuffer();
	    
	    text.append("\nWelcome ").append(customer.get_NameSurname()).append(" !\n");
	    text.append("Total Orders: ").append(orders.size()).append("\n");
	    text.append("======================================\n");
	
	    double grandTotal = 0;
	
	    for (Order order : orders) {
	        text.append("Order ID: ").append(order.getOrderID()).append("\n");
	        text.append(order.toString()).append("\n");
	        grandTotal += order.getOrderPrice();
    }

    text.append("Grand Total: ").append(String.format("%.2f", grandTotal)).append(" TL\n");

    return text.toString();
}

    public static Order searchOrderByOrderID(int orderID) {
        for (Order order : orders) {
            if (order.getOrderID() == orderID) {
                return order;
            }
        }
        return null;
    }

    public static boolean deleteOrder(int orderID) {
        return orders.remove(searchOrderByOrderID(orderID));
    }

    public static double calculatePrice(Meal meal) {
        double price = meal.getPrice();
        String size = meal.getSize();

        switch (size.toUpperCase()) {
            case "S":
                price *= 0.85;
                break;
            case "M":
                price *= 1;
                break;
            case "L":
                price *= 1.15;
                break;
            default:
                System.out.println("Invalid size: " + size);
        }

        return price;
    }
    
    public static String[] getOrderIDsAsArray(){
    	String[] ids = new String[orders.size()];
    	for(int i=0; i<ids.length; i++) {
    		ids[i] = orders.get(i).getOrderID() + "";
    	}
    	return ids;
    }
}