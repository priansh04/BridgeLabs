import java.util.Scanner;

class Product {
    String productName;   // Instance Variable
    double price;         // Instance Variable
    static int totalProducts = 0;  // Class Variable (shared)

    // Constructor
    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;  // Increment whenever a product is created
    }

    // Instance Method
    void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
    }

    // Class Method
    static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }
}

public class Product_Inventory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter product name: ");
        String name = sc.nextLine();

        System.out.print("Enter product price: ");
        double price = sc.nextDouble();

        Product p1 = new Product(name, price);

        System.out.println("\n--- Product Details ---");
        p1.displayProductDetails();

        System.out.println("\n--- Total Products ---");
        Product.displayTotalProducts();

        sc.close();
    }
}
