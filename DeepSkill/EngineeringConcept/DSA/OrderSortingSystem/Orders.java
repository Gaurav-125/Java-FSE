public class Orders {
    private int orderId;
    private String orderName;
    private double price;

    Orders(int orderId,String orderName, double price){
        this.orderId=orderId;
        this.orderName=orderName;
        this.price=price;
    }

    public int getOrderId(){
        return orderId;
    }

    public String getOrderName(){
        return orderName;
    }

    public double getOrderPrice(){
        return price;
    }

    @Override
    public String toString(){
        return "OrderId: "+orderId+" OrderName: "+orderName+" Price: "+price;
    }
}
