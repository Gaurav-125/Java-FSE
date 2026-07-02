package StrategyPattern;

public class CreditCardPayment implements PaymentStrategy{
    
    @Override
    public void pay(double amount){
        System.out.println("payment of Rs."+amount+" using Credit Card");
    }
}
