public class SortAlgorithm {

    // bubble sort
    public static void BubbleSort(Orders[] orders){
        int n=orders.length;

        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1;j++){
                if(orders[j].getOrderPrice() > orders[j+1].getOrderPrice()){
                    Orders temp = orders[j];
                    orders[j] = orders[j+1];
                    orders[j+1] = temp;
                }
            }
        }
    }

    // Quick Sort
    public static void QuickSort(Orders[] orders, int low , int high){
        if(low < high){
            int pivotIndex = partitions(orders,low,high);
            
            QuickSort(orders,low,pivotIndex-1);
            QuickSort(orders, pivotIndex+1, high);
        }
    }

    private static int partitions(Orders[] orders, int low, int high){
        double pivot = orders[high].getOrderPrice();

        int i=low-1;
        
        for(int j=low;j<high;j++){
            if(orders[j].getOrderPrice() < pivot){
                i++;

                Orders temp = orders[i];
                orders[i] = orders[j];
                orders[j] = temp;
            }
        }

        Orders temp = orders[i+1];
        orders[i+1] = orders[high];
        orders[high] = temp;

        return i+1;
    }

    // display orders
    public static void display(Orders[] orders){
        for(Orders order:orders){
            System.out.println(order);
        }
        System.out.println();
    }
}
