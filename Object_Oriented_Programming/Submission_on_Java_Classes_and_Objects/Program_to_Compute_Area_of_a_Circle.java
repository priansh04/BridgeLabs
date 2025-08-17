package Object_Oriented_Programming.Submission_on_Java_Classes_and_Objects;

import java.util.Scanner;
class Circle {
    double radius;

    double calculateArea() {
        return Math.PI * radius * radius;
    }

    double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
}

public class Program_to_Compute_Area_of_a_Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle c = new Circle();

        System.out.print("Enter radius of circle: ");
        c.radius = sc.nextDouble();

        System.out.println("Area: " + c.calculateArea());
        System.out.println("Circumference: " + c.calculateCircumference());
    }
}
