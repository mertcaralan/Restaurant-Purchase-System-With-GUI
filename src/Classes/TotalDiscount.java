package Classes;

import Interfaces.Discount;

public class TotalDiscount implements Discount {
    
    public TotalDiscount(){
        
    }
    
    @Override
    public double calculateDiscount(double price) {
        if (price > 1000) {
            return price * 0.20; 
        } else if (price > 500) {
            return price * 0.15; 
        } else if (price > 200) {
            return price * 0.10; 
        }
        return 0; 
    }

    @Override
    public boolean isDiscountApplicable(double price) {
        return price > 200; 
    }
}
