package AdapterDesignPattern;

// Step 2: Create the common contract (abstract interface)

public interface PaymentProcessor {

    // Method for making payments
    void makePayment(String name, long id, String email, int amount);

    // Method for checking status
    PaymentStatus getStatus();
}
