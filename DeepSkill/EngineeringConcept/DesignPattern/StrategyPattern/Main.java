package StrategyPattern;

public class Main {
    public static void main(String[] args){
        PaymentContext context=new PaymentContext();

        // pay using credit card
        context.setPaymentStrategy(new CreditCardPayment());
        context.executePaymentStrategy(5000);

        // pay using paypal
        context.setPaymentStrategy(new PayPalPayment());
        context.executePaymentStrategy(10000);
    }
}
