package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class StockMarket implements Stock{

    private List<Observer> observers=new ArrayList<>();

    private String stockName;
    private double stockPrice;

    @Override
    public void register(Observer observer){
        observers.add(observer);
    }

    @Override
    public void deRegister(Observer observer){
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for(Observer ob:observers){
            ob.update(stockName, stockPrice);
        }
    }

    public void setStock(String stockName, double stockPrice){
        this.stockName=stockName;
        this.stockPrice=stockPrice;

        System.out.println("Stock updated: ");
        System.out.println(stockName + "= ₹"+stockPrice); 

        notifyObserver();
    }
}
