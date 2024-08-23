package Product;

public class BookProduct extends Product{

    private String isbnNumber;
    private String authorName;

    BookProduct(String productName, String brandname, int itemId, float price, String description) {
        super(productName, brandname, itemId, price, description);
        this.isbnNumber = "";
        authorName="";
    }

    void setIsbnNumber(String isbnNumber) {
        this.isbnNumber = isbnNumber;
    }
    String getIsbnNumber() {
        return this.isbnNumber;
    }

    void setAuthor(String authorName) {
        this.authorName = authorName;
    }
    String getAuthorName() {
        return this.authorName;
    }

    public void displayDetails() {
        System.out.println("Product Name: " + getProductName());
        System.out.println("Brand Name: " + getBrandname());
        System.out.println("Item ID: " + getItemId());
        System.out.println("Price: " + getPrice());
        System.out.println("Description: " + getDescription());
        System.out.println("ISBN Number: " + getIsbnNumber());
        System.out.println("Author Name: " + getAuthorName());
    }  
}
