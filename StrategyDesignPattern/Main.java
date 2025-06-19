package StrategyDesignPattern;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.PaymentStrategy(new CCPaymentStrategy());
        cart.checkout(200);

        ShoppingCart cart2 = cart;
        cart2.PaymentStrategy(new UPIPaymentStrategy());
        cart2.checkout(1000);


    }
}
