import java.util.Scanner;

class Course {
    String courseName;
    int duration; // in months
    double fee;
    static String instituteName = "ABC Institute"; // Class variable

    Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }
    void displayCourseDetails() {
        System.out.println("Institute: " + instituteName);
        System.out.println("Course: " + courseName);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Fee: " + fee);
    }

    static void updateInstituteName(String newName) {
        instituteName = newName;
    }
}

public class Online_Course_Management {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter course name: ");
        String name = sc.nextLine();

        System.out.print("Enter duration (months): ");
        int duration = sc.nextInt();

        System.out.print("Enter fee: ");
        double fee = sc.nextDouble();

        Course c1 = new Course(name, duration, fee);

        System.out.println("\n--- Course Details ---");
        c1.displayCourseDetails();

        sc.nextLine(); // consume newline
        System.out.print("\nEnter new Institute Name: ");
        String newName = sc.nextLine();

        Course.updateInstituteName(newName);

        System.out.println("\n--- Updated Course Details ---");
        c1.displayCourseDetails();

        sc.close();
    }
}
