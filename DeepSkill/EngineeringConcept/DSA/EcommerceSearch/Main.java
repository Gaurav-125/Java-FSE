public class Main {
    public static void main(String[] args) {
         Product[] products = {

                new Product(1, "Keyboard", "Electronics"),
                new Product(2, "Laptop", "Electronics"),
                new Product(3, "Mouse", "Electronics"),
                
        };

        Product linearResult =
                SearchAlgorithms.linearSearch(products, 104);

        if (linearResult != null)
            System.out.println("Linear Search: " + linearResult);

        Product binaryResult =
                SearchAlgorithms.binarySearch(products, 104);

        if (binaryResult != null)
            System.out.println("Binary Search: " + binaryResult);
    
    }
}
