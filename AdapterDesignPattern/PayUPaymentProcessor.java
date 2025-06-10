package AdapterDesignPattern;

public class PayUPaymentProcessor implements PaymentProcessor{
    private PayUAPI api = new PayUAPI();
    @Override
    public void makePayment(String name, long id, String email, int amount) {
        api.doPay(id, amount);
    }

    @Override
    public PaymentStatus getStatus() {
        return toStatus(api.verifyStatus());
    }
    public PaymentStatus toStatus(PayUStatus status){
        return (status == PayUStatus.SUCCESS)?PaymentStatus.OK:PaymentStatus.ERROR;
    }
}
