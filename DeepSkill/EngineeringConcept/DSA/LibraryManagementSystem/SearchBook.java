

public class SearchBook {
    
    public static Book linearSearch(Book[] books,String bookTitle){
        for(Book book:books){
            if(book.getBookName().equalsIgnoreCase(bookTitle)) return book;
        }
        return null;
    }

    public static Book binarySearch(Book[] books, String bookTitle){
        int low=0;
        int high=books.length-1;

        while (low<=high) {
            int mid=low+(high-low)/2;

            int result=books[mid].getBookName().compareToIgnoreCase(bookTitle);

            if(result==0) return books[mid];

            if(result<0) low=mid+1;
            else high=mid-1;
        }

        return null;
    }
}
