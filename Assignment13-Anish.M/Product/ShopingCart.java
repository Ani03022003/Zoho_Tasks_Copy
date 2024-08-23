package Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ShopingCart {
    static final ProductDb productDb = new ProductDb();
    static List<Product> cart = new ArrayList<>();

    private static void addProductToCart(int productId, int quantity) {
        for(Product product : productDb.products){
            if(product.getItemId() == productId){
                product.setQuantity(quantity);
                cart.add(product);
                System.out.println("Product added to cart: " + product.getProductName());
                return;
            }
        }
    }

    private static void removeProductFromCart(int productId) {
        for(Product product : cart){
            if(product.getItemId() == productId){
                cart.remove(product);
                System.out.println("Product removed from cart: " + product.getProductName());
                return;
            }
        }
    }

    private static void viewCart() {
        if(cart.isEmpty()){
            System.out.println("Your cart is empty.");
        }else{
            System.out.println("Products in your cart:");
            for(Product product : cart){
                System.out.println(product.getProductName() + " - " + product.getQuantity());
            }
        }
    }

    private static void checkout() {
        double total = 0;
        for(Product product : cart){
            total += product.getPrice() * product.getQuantity();
        }
        System.out.println("Total amount: " + total);
    }


    public static void main(String[] args) {
        productDb.createProducts();
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Shopping Cart!");
        while (choice != 6) {
            System.out.println("X--------------------------------------------X");
            System.out.println("1. View Products");
            System.out.println("2. Add Product to Cart");
            System.out.println("3. Remove Product from Cart");
            System.out.println("4. View Cart");
            System.out.println("5. Checkout");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    productDb.viewProducts();
                    break;
                case 2:
                    System.out.print("Enter Product ID: ");
                    int productId = sc.nextInt();
                    System.out.print("Enter Quantity: ");
                    int quantity = sc.nextInt();
                    addProductToCart(productId, quantity);
                    break;
                case 3:
                    System.out.print("Enter Product ID: ");
                    productId = sc.nextInt();
                    removeProductFromCart(productId);
                    break;
                case 4:
                    viewCart();
                    break;
                case 5:
                    checkout();
                    char a=' ';
                    System.out.println("Do you want to pay? (y/n)");
                    a=sc.next().charAt(0);
                    if(a=='y'){
                        System.out.println("Amount paid.\nThank you for shopping with us!");
                        cart.removeAll(cart);
                    }
                    break;
                case 6:
                    System.out.println("Thank you for shopping with us!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        sc.close();
    }
}
