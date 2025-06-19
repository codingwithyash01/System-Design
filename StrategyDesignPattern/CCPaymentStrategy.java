package StrategyDesignPattern;

public class CCPaymentStrategy implements PaymentStrategy{
    @Override
    public void pay(int amount) {
        System.out.println("Paid a total of " + amount + " Via Credit Card");
    }
}
