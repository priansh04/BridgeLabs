package Submissions_on_Java_String_Practices;

import java.util.Scanner;

public class compare_two_strings_using_char_and_equals {
        public static boolean compareWithCharAt(String str1, String str2) {
            if (str1.length() != str2.length()) return false;
            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i) != str2.charAt(i)) return false;
            }
            return true;
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s1 = sc.next();
        System.out.print("Enter second string: ");
        String s2 = sc.next();

        boolean customResult = compareWithCharAt(s1, s2);
        boolean builtInResult = s1.equals(s2);

        System.out.println("Custom comparison result: " + customResult);
        System.out.println("Built-in equals() result: " + builtInResult);
        System.out.println("Are both results same? " + (customResult == builtInResult));
    }
}
