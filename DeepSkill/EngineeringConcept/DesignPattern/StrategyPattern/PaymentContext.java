package StrategyPattern;

public class PaymentContext {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy){
        this.paymentStrategy=paymentStrategy;
    }

    // execute strategy
    public void executePaymentStrategy(double amount){

        if(paymentStrategy==null){
            System.out.println("No payment method selected");
            return;
        }
        paymentStrategy.pay(amount);
    }
}
