package StrategyDesignPattern;

// Step 2: Create concrete classes and implement common interface

public class UPIPaymentStrategy implements PaymentStrategy{
    @Override
    public void pay(int amount) {
        System.out.println("Paid a total of " + amount + " Via UPI");
    }
}
