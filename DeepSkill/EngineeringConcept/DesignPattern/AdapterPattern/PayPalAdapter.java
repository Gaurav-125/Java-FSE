package AdapterPattern;

public class PayPalAdapter implements PaymentProcessor{
    private PayPalGateway paypal;

    public PayPalAdapter(PayPalGateway paypal){
        this.paypal=paypal;
    }

    @Override
    public void ProcessPayment(double amount){
        paypal.pay(amount);
    }
}
