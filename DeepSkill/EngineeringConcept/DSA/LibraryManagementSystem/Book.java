public class Book {
    private int bookId;
    private String bookName;
    private String Author;

    Book(int bookId,String bookName, String Autor){
        this.bookId=bookId;
        this.bookName=bookName;
        this.Author=Autor;
    }

    public int getBookId(){
        return bookId;
    }

    public String getBookName(){
        return bookName;
    }

    public String getAuthor(){
        return Author;
    }

    @Override
    public String toString(){
        return "BookId: "+bookId
                +" BookName: "+bookName
                +" Author: "+Author;
    }
}
