package AdapterDesignPattern;

public class RazorpayPaymentProcessor implements PaymentProcessor{
    private RazorpayAPI api = new RazorpayAPI();
    @Override
    public void makePayment(String name, long id, String email, int amount) {
        api.makePay(name, id, amount);
    }

    @Override
    public PaymentStatus getStatus() {
        int status = api.checkStatus(1);
        return toStatus(status);
    }

    public PaymentStatus toStatus(int status){
        return (status==1)?PaymentStatus.OK:PaymentStatus.ERROR;
    }
}
