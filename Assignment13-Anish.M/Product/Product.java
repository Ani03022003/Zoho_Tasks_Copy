package Product;

abstract public class Product {
    private String productName;
    private String brandname;
    private int itemId;
    private float price;
    private String description;
    private int quantity;

    Product(String productName, String brandname, int itemId, float price, String description) {
        this.productName = productName;
        this.brandname = brandname;
        this.itemId = itemId;
        this.price = price;
        this.description = description;
    }

    public String getProductName(){
        return this.productName;
    }
    public String getBrandname(){
        return this.brandname;
    }
    public int getItemId(){
        return this.itemId;
    }
    public float getPrice(){
        return this.price;
    }
    public String getDescription(){
        return this.description;
    }
    public int getQuantity(){
        return this.quantity;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    abstract public void displayDetails();
}
