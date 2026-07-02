package ObserverPattern;

public class MobileApp implements Observer{
    private String user;

    MobileApp(String user){
        this.user=user;
    }

    @Override
    public void update(String stockName, double stockPrice){
        System.out.println("Mobile App user("+user+") Received updata: "
                                            +stockName+"= ₹"+stockPrice);
    }
}
