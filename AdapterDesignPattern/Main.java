package AdapterDesignPattern;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PayUPaymentProcessor();
        paymentProcessor.makePayment("Yash", 201, "yash.verma@gmail.com", 2000);
        System.out.println("Status: " + paymentProcessor.getStatus());
    }
}
