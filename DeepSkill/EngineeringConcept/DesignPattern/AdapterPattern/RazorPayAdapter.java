package AdapterPattern;

public class RazorPayAdapter implements PaymentProcessor{
    private RazorPayGateway razorpay;

    public RazorPayAdapter(RazorPayGateway razorpay){
        this.razorpay=razorpay;
    }

    @Override
    public void ProcessPayment(double amount){
        razorpay.makePayment(amount);
    }
}
