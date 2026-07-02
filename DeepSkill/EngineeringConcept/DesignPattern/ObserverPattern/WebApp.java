package ObserverPattern;

public class WebApp implements Observer{
    private String user;
    WebApp(String user){
        this.user=user;
    }

    @Override
    public void update(String stockName, double stockPrice){
        System.out.println("Web App user("+user+") received update: "
        + stockName + "= ₹"+stockPrice  ); 
    }
}
