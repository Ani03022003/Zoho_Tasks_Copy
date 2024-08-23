public class Book {
    private String bookTitle;
    private String bookAuthor;
    private String isbnNumber;
    private String publisher;
    private float rate;

    public void setBookTitle(String bookName){
        this.bookTitle=bookName;
    }

    public void  setBookAuthor(String AuthorName){
        this.bookAuthor=AuthorName;
    }

    public void setISBNNumber(String isbn){
        this.isbnNumber=isbn;
    }

    public void setPublisher(String publisherName){
        this.publisher=publisherName;
    }

    public void setRate(float amount){
        this.rate=amount;
    }

    public String getBookTitle(){
        return bookTitle;
    }

    public String getBookAuthor(){
        return bookAuthor;
    }

    public String getISBNNumber(){
        return isbnNumber;
    }

    public String getPublisher(){
        return publisher;
    }

    public float getRate(){
        return rate;
    }
}

