import java.util.Scanner;

class Vehicle {
    String ownerName;
    String vehicleType;
    static double registrationFee = 5000; // Same for all vehicles

    Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    void displayVehicleDetails() {
        System.out.println("Owner: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: " + registrationFee);
    }

    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }
}
public class Vehicle_registration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter owner name: ");
        String owner = sc.nextLine();

        System.out.print("Enter vehicle type: ");
        String type = sc.nextLine();

        Vehicle v1 = new Vehicle(owner, type);

        System.out.println("\n--- Vehicle Details ---");
        v1.displayVehicleDetails();

        System.out.print("\nEnter new Registration Fee: ");
        double fee = sc.nextDouble();

        Vehicle.updateRegistrationFee(fee);

        System.out.println("\n--- Updated Vehicle Details ---");
        v1.displayVehicleDetails();

        sc.close();
    }
}
