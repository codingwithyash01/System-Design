package AdapterDesignPattern;

// Step 1: Create the external classes (incompatible interfaces)

public class RazorpayAPI {

    public void makePay(String name, long id, int amount){
        System.out.println("Razorpay payment processed: " + name +" " + amount);
    }

    public int checkStatus(long id){
        System.out.println("Payment done for: " + id);
        return 1;
    }
}
