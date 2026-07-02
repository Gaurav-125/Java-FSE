package AdapterPattern;

public class StripeAdapter implements PaymentProcessor{
    private StripeGateway stripe;

    public StripeAdapter(StripeGateway stripe){
        this.stripe=stripe;
    }
    
    @Override
    public void ProcessPayment(double amount){
        stripe.sendmoney(amount);
    }
}
