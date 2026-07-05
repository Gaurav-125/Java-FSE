public class Main{
    public static void main(String[] args) {
        Book[] books = { new Book(1,"DSA",  "Mark"),
                         new Book(2,"OS","William"),
                         new Book(3,"Java","James")
        };

        Book linearResult=SearchBook.linearSearch(books,"OS");
        System.out.println(linearResult);

        Book binaryResult=SearchBook.binarySearch(books,"Java");
        System.out.println(binaryResult);
    }
}