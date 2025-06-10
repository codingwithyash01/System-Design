package AdapterDesignPattern;

public class PayUAPI {
    public void doPay(long id, int amount) {
        System.out.println("PayU payment processed: " + id + " " + amount);
    }

    public PayUStatus verifyStatus() {
        return PayUStatus.SUCCESS;
    }
}
