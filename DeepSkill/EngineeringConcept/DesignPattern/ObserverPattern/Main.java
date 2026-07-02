package ObserverPattern;

public class Main {
    public static void main(String[] args) {
        StockMarket market=new StockMarket();

        Observer mobile=new MobileApp("Alice");
        Observer web=new WebApp("Bob");

        market.register(web);
        market.register(mobile);

        market.setStock("TCS", 130.34);
        market.setStock("Infosys", 1321.98);


    }
}
