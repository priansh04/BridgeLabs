package Core_Programming.Assignment1;
import java.util.Scanner;

public class Average_age_in_PCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of maths:- ");
        int math = sc.nextInt();
        System.out.println("Enter the marks of physics:- ");
        int physics = sc.nextInt();
        System.out.println("Enter the marks of chemistry:- ");
        int chemistry = sc.nextInt();

        float average =(math + physics + chemistry) / 3f;
        System.out.println("Sam's average marks in PCM is:- "+ average);
    }
}
