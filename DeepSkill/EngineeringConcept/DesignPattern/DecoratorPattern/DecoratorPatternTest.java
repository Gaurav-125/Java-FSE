package DecoratorPattern;

public class DecoratorPatternTest {
    public static void main(String[] args) {
        Notifier notifier=new EmailNotifier();
        notifier.send("Email");

        Notifier smsNotifier=new SmsNotifierDecorator(new EmailNotifier());
        smsNotifier.send("SMS");

        Notifier slackNotifier=new SlackNotifierDecorator(
                                new SmsNotifierDecorator(new EmailNotifier()));
                                slackNotifier.send("SLACK");
    }
}
