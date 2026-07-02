package AdapterPattern;

public class StripeGateway {
    public void sendmoney(double amount){
        System.out.println("Amount of Rs."+amount+" paid using Stripe Gateway");
    }
}
