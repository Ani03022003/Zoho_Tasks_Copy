package Product;

public class ElectronicsProduct extends Product {

    private int warrantyPeriod;
    
    ElectronicsProduct(String productName, String brandname, int itemId, float price, String description) {
        super(productName, brandname, itemId, price, description);
        this.warrantyPeriod = 0;
    }

    void setWarrantyPeriod(int warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    int getWarrantyPeriod() {
        return this.warrantyPeriod;
    }

    public void displayDetails() {
        System.out.println("Product Name: " + getProductName());
        System.out.println("Brand Name: " + getBrandname());
        System.out.println("Item ID: " + getItemId());
        System.out.println("Price: " + getPrice());
        System.out.println("Description: " + getDescription());
        System.out.println("Warranty Period: " + getWarrantyPeriod() + " years");
    }
}
