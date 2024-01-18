import java.util.*;

public class StringsMethodes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // ---------------------------> (1) <--------------------------

        // String str1="Java Exercises !";
        // System.out.println(str1.charAt(0));
        // System.out.println(str1.charAt(10));

        // // ---------------------------> (2) <---------------------------

        // String str1=" w3resource.com ! ";
        // System.out.println(str1.codePointAt(1));
        // System.out.println(str1.codePointAt(10));

        // // ---------------------------> (3) <----------------------------

        // String str2=" w3resource.com ! ";
        // System.out.println(str2.codePointBefore(1));
        // System.out.println(str2.codePointBefore(10));

        // // ---------------------------> (4) <----------------------------

        // // The codePointCount() method returns the number of Unicode values found in
        // a
        // // string.

        // String str1 = "Hello";
        // System.out.println(str1.codePointCount(0, 5));

        // // --------------------------> (5) <------------------------------

        // // Two strings are lexicographically equal if they are the same length and
        // // contain the same characters in the same positions.

        // String str1 = "Hello 1";
        // String str2 = "Hello";
        // int compare = str1.compareTo(str2);

        // if (compare < 0) {
        // System.out.println(str1 + " is less than " + str2);
        // } else if (compare == 0) {
        // System.out.println(str1 + " is lexicographically equal to " + str2);
        // } else {
        // System.out.println(str1 + " is greater than " + str2);
        // }

        // // ---------------------------> (6) <------------------------------

        // String str1 = "Hello";
        // String str2 = "hello";
        // int compare = str1.compareToIgnoreCase(str2);

        // if (compare < 0) {
        // System.out.println(str1 + " is less than " + str2);
        // } else if (compare == 0) {
        // System.out.println(str1 + " is lexicographically equal to " + str2);
        // } else {
        // System.out.println(str1 + " is greater than " + str2);
        // }

        // // ---------------------------> (7) <------------------------------

        // String str1 = " PHP Exercises and ";
        // String str2 = " Python Exercises ";
        // String str3 = str1 + str2;
        // System.out.println(str3); // OR

        // System.out.println(str1.concat(str2));

        // ---------------------------> (8) <------------------------------

        // The contains() method checks whether a string contains a sequence of
        // characters. Returns true if the sequence of characters exist and false if
        // not.

        // String str1 = "PHP Exercises and ";
        // String str2 = "and"; // In other words str2 contains a character sequence of
        // str1
        // System.out.println(str1.contains(str2));

        // // ---------------------------> (9) <------------------------------

        // String str1 = "Compairing example.com and example.com ";
        // String str2 = "Compairing Example.com and example.com";
        // System.out.println(str1.contains(str2));

        // ---------------------------> (9) <------------------------------

    }
}
