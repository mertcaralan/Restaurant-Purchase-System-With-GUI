package Interfaces;

public interface Discount {
    double calculateDiscount(double price); // Calculate the discount amount
    boolean isDiscountApplicable(double price); // Check if the discount applies based on thresholds
}
