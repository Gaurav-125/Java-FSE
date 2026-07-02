package DecoratorPattern;

public abstract class NotifierDecorator implements Notifier {
    protected Notifier noti;

    NotifierDecorator(Notifier noti){
        this.noti=noti;
    }

    @Override
    public void send(String message){
        noti.send(message);
    }
}
