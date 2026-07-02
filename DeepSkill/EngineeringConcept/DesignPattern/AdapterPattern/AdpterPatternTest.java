package AdapterPattern;

public class AdpterPatternTest {
    public static void main(String[] args) {
        PaymentProcessor paypal=new PayPalAdapter(new PayPalGateway());
        PaymentProcessor razorpay=new RazorPayAdapter(new RazorPayGateway());
        PaymentProcessor stripe=new StripeAdapter(new StripeGateway());

        paypal.ProcessPayment(5000);
        razorpay.ProcessPayment(7000);
        stripe.ProcessPayment(12000);
 
    }
}
