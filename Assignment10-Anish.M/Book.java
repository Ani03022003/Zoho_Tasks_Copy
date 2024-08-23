public class Book {
    private String bookTitle;
    private String bookAuthor;
    private String isbnNumber;
    private String publisher;
    private float rate;

    public Book(String bookName,String AuthorName,String isbn,String publisherName,float amount){
        this.bookTitle=bookName;
        this.bookAuthor=AuthorName;
        this.isbnNumber=isbn;
        this.publisher=publisherName;
        this.rate=amount;
    }

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

class BookDemo{
    static Book[] book=new Book[5];
    
    public static void displayBookDetails(){
        for(int i=0;i<book.length;i++){
            System.out.println("Book Title: "+book[i].getBookTitle());
            System.out.println("Book Author: "+book[i].getBookAuthor());
            System.out.println("ISBN Number: "+book[i].getISBNNumber());
            System.out.println("Publisher: "+book[i].getPublisher());
            System.out.println("Rate: "+book[i].getRate());
            System.out.println();
        }
    }
    public static void main(String[] args) {
        book[0]=new Book("Java Programming","John Doe","1234567890","ABC Publications",250.0f);
        book[1]=new Book("Data Structures and Algorithms","Jane Smith","0987654321","XYZ Publications",300.0f);
        book[2]=new Book("The Great Gatsby","F. Scott Fitzgerald","5678901234","PQR Publications",350.0f);
        book[3]=new Book("The Catcher in the Rye","J.D. Salinger","4321098765","LMN Publications",280.0f);
        book[4]=new Book("To Kill a Mockingbird","Harper Lee","6789012345","DEF Publications",320.0f);
        displayBookDetails();
    }
}

