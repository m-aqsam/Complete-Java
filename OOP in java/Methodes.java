package Inheritance;

import java.util.*;

public class Methodes {

    // --------------(1)----------------------

    static int sum(int a, int b) {
        int c = a + b;
        return c;
    }

    // --------------(2)----------------------

    static int sumbyuser(int p, int q) {

        return p + q;
    }

    void getdata() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want Factorial : ");
        sc.nextInt();
    }
    // static void int factorial(int fact,int num){
    // int fact=1;
    // for(int i=1;i<=num;i++){
    // fact=num*i;
    // }
    // }

    static void printdata(int num) {
        System.out.println("Your Number is " + num);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Sum of numbers is " + sum(5, 6)); // ----(1)

        // System.out.println("Enter First number : ");
        // int a = sc.nextInt();
        // System.out.println("Enter Second number : ");
        // int b = sc.nextInt();
        // System.out.println("Sum of numbers is : " + sumbyuser(a, b));

        // System.out.println("The factorial of " + i + " is " + factorial(num));

        // printdata(7);

    }
}
