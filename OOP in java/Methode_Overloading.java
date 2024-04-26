package Inheritance;

import java.util.*;

class Methodes {
    Scanner sc = new Scanner(System.in);

    public void input(){
        System.out.println("How many numbers do you want to Enter : ");
        int numbers=sc.nextInt();
        for(int i=1;i<=numbers;)
    }

    public int sum(int... arr) {
        int result = 0;
        for (int i : arr) {
            result = result + i;
        }
        return result;

    }
}

public class Methode_Overloading {
    public static void main(String[] args) {
        Methodes obj = new Methodes();

        System.out.println("Sum of nothing is  " + (obj.sum()));
        System.out.println("Sum of a is " + (obj.sum(3)));
        System.out.println("Sum of a and b is " + (obj.sum(3, 4)));
        System.out.println("Sum of a ,b and c is " + (obj.sum(3, 4, 5)));
        System.out.println("Sum of a ,b,c and d is " + (obj.sum(3, 4, 5, 6)));

    }
}
