package Product;

public class ClothingProduct extends Product{

    private String size;
    private String color;

    ClothingProduct(String productName, String brandname, int itemId, float price, String description) {
        super(productName, brandname, itemId, price, description);
        this.size = "";
        this.color = "";
    }

    void setSize(String size) {
        this.size = size;
    }
    String getSize() {
        return this.size;
    }

    void setColor(String color) {
        this.color = color;
    }
    String getColor() {
        return this.color;
    }

    public void displayDetails() {
        System.out.println("Product Name: " + getProductName());
        System.out.println("Brand Name: " + getBrandname());
        System.out.println("Item ID: " + getItemId());
        System.out.println("Price: " + getPrice());
        System.out.println("Description: " + getDescription());
        System.out.println("Size: " + getSize());
        System.out.println("Color: " + getColor());
    }
    
}
