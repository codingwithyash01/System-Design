package StrategyDesignPattern;

// Step 3: Create context class

public class ShoppingCart {
    private PaymentStrategy paymentstrategy;
    public void PaymentStrategy(PaymentStrategy strategy){
        this.paymentstrategy = strategy;
    }
    public void checkout(int amount){
        paymentstrategy.pay(amount);
    }
}
