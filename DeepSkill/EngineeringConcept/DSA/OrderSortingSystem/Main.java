public class Main {
    public static void main(String[] args) {
        Orders[] orders = {

                new Orders(1, "Rahul", 2500),
                new Orders(1, "Priya", 1200),
                new Orders(1, "Amit", 4500),
                new Orders(1, "Sneha", 3000),
                new Orders(1, "Rohan", 1800)
        };

        System.out.println("Original Orders");
        SortAlgorithm.display(orders);

        SortAlgorithm.BubbleSort(orders);
        System.out.println("After Bubble Sort");
        SortAlgorithm.display(orders);

        Orders[] orders2 = {

                new Orders(101, "Rahul", 2500),
                new Orders(102, "Priya", 1200),
                new Orders(103, "Amit", 4500),
                new Orders(104, "Sneha", 3000),
                new Orders(105, "Rohan", 1800)
        };

        SortAlgorithm.QuickSort(orders2,0,orders2.length-1);
        System.out.println("After Quick Sort");
        SortAlgorithm.display(orders2);
    }
}
