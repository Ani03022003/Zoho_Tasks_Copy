package Product;

import java.util.ArrayList;
import java.util.List;

public class ProductDb {
    List<Product> products = new ArrayList<>();
    void createProducts(){
        Product product1 = new ElectronicsProduct("Laptop", "Dell", 101, 79999.99f, "High-performance laptop");
        Product product6 = new ClothingProduct("Shirt", "NetPlay", 202, 1900.99f, "Cotton Shirt");
        Product product7 = new ClothingProduct("T-Shirt", "Nike", 201, 590.99f, "Cotton T-Shirt");
        Product product2 = new ElectronicsProduct("Smartphone", "Samsung", 102, 59999.99f, "Flagship smartphone");
        Product product8 = new ClothingProduct("Jeans", "Wrangler", 203, 1999.99f, "Denim Jeans");
        Product product3 = new ElectronicsProduct("Headphones", "Sony", 103, 999.99f, "Noise-cancelling headphones");
        Product product11 = new BookProduct("Java Programming", "John Doe", 301, 49.99f, "Learn Java in 24 hours");
        Product product12 = new BookProduct("Python Basics", "Jane Smith", 302, 39.99f, "Master Python programming");
        Product product13= new BookProduct("Data Structures and Algorithms", "John Doe", 303, 59.99f, "Understand data structures");
        Product product14 = new BookProduct("Web Development with React", "Jane Smith", 304, 79.99f, "Build modern web applications");
        Product product15 = new BookProduct("Machine Learning with Python", "John Doe", 305, 69.99f, "Learn machine learning techniques");
        Product product4 = new ElectronicsProduct("Tablet", "Apple", 104, 159999.99f, "Portable device");
        Product product9 = new ClothingProduct("Socks", "Nike", 204, 299.99f, "Cotton socks");
        Product product10 = new ClothingProduct("Shorts", "Wrangler", 205, 399.99f, "Cotton shorts");
        Product product5 = new ElectronicsProduct("Camera", "Canon", 105, 79999.99f, "Professional camera");
        
        products.add((ElectronicsProduct) product1);
        products.add((ElectronicsProduct) product2);
        products.add((ElectronicsProduct) product3);
        products.add((ElectronicsProduct) product4);
        products.add((ElectronicsProduct) product5);
        products.add((ClothingProduct) product6);
        products.add((ClothingProduct) product7);
        products.add((ClothingProduct) product8);
        products.add((ClothingProduct) product9);
        products.add((ClothingProduct) product10);
        products.add((BookProduct) product11);
        products.add((BookProduct) product12);
        products.add((BookProduct) product13);
        products.add((BookProduct) product14);
        products.add((BookProduct) product15);

        ((ElectronicsProduct) product1).setWarrantyPeriod(1);
        ((ElectronicsProduct) product2).setWarrantyPeriod(2);
        ((ElectronicsProduct) product3).setWarrantyPeriod(1);
        ((ElectronicsProduct) product4).setWarrantyPeriod(3);
        ((ElectronicsProduct) product5).setWarrantyPeriod(2);
        ((ClothingProduct) product6).setSize("M");
        ((ClothingProduct) product7).setSize("L");
        ((ClothingProduct) product8).setSize("XL");
        ((ClothingProduct) product9).setSize("S");
        ((ClothingProduct) product10).setSize("M");
        ((ClothingProduct) product6).setColor("Blue");
        ((ClothingProduct) product7).setColor("Green");
        ((ClothingProduct) product8).setColor("Black");
        ((ClothingProduct) product9).setColor("White");
        ((ClothingProduct) product10).setColor("Red");
        ((BookProduct) product11).setAuthor("XYZ");
        ((BookProduct) product12).setAuthor("ABC");
        ((BookProduct) product13).setAuthor("XYZ");
        ((BookProduct) product14).setAuthor("ABC");
        ((BookProduct) product15).setAuthor("XYZ");
        ((BookProduct) product11).setIsbnNumber("9876543210");
        ((BookProduct) product12).setIsbnNumber("1234567890");
        ((BookProduct) product13).setIsbnNumber("9876543210");
        ((BookProduct) product14).setIsbnNumber("1234567890");
        ((BookProduct) product15).setIsbnNumber("9876543210");
    }

    void viewProducts() {
        for (Product product : products) {
            product.displayDetails();
            System.out.println("X--------------------------------------------X");
        }
    }
}
