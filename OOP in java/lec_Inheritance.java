package Inheritance;

import java.util.*;

class Base {
    Scanner sc = new Scanner(System.in);
    // int x,y;

    public int sum(int x, int y) {
        return x + y;

    }

}

class Derived extends Base {
    Scanner sc = new Scanner(System.in);

    public void printData() {
        System.out.println("Enter 1st number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd number : ");
        int num2 = sc.nextInt();
        System.out.println("Sum of numbers is " + sum(num1, num2));
    }
}

public class lec_Inheritance {
    public static void main(String[] args) {
        Derived obj1 = new Derived();
        obj1.printData();

    }
}
