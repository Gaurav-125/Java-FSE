package DecoratorPattern;

public class SmsNotifierDecorator extends NotifierDecorator{

    public SmsNotifierDecorator(Notifier notifier){
        super(notifier);
    }
    
    @Override
    public void send(String message){
        super.send(message);
        System.out.println("Sending SMS: " + message);
    }
}
