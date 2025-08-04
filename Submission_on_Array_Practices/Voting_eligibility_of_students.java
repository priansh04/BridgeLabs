package Submission_on_Array_Practices;
import java.util.Scanner;

public class Voting_eligibility_of_students {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Students:- ");
        int n = sc.nextInt();
        int[] ages = new int[n];

        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }

        for (int age : ages) {
            if (age < 0) {
                System.out.println("Invalid age entered.");
            } else if (age >= 18) {
                System.out.println("The student with the age " + age + " can vote.");
            } else {
                System.out.println("The student with the age " + age + " cannot vote.");
            }
        }
    }   
}
