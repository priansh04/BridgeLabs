package Object_Oriented_Programming.Submission_on_Java_Classes_and_Objects;

import java.util.Scanner;

class Item {
    int itemCode;
    String itemName;
    double price;

    void displayItem(int quantity) {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price per item: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + (price * quantity));
    }
}
public class Program_to_Track_Inventory_of_Items {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        Item item = new Item();

        System.out.print("Enter Item Code: ");
        item.itemCode = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Item Name: ");
        item.itemName = sc.nextLine();

        System.out.print("Enter Price per item: ");
        item.price = sc.nextDouble();

        System.out.print("Enter Quantity: ");
        int qty = sc.nextInt();

        System.out.println("\n--- Item Details ---");
        item.displayItem(qty);
    }
}
