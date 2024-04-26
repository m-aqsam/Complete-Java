package Inheritance;

import java.util.*;

class Bank {
    Scanner sc = new Scanner(System.in);
    private int Balnace;
    // private int Deposit;

    public void getData() {
        System.out.println("Enter your balance : ");
        Balnace = sc.nextInt();
        if (Balnace <= 0) {
            System.out.println("No Money in your Account !!!");
        }

    }

    public void showData() {
        System.out.println("Your Balance is : " + Balnace);
    }

}

class WeeksDays {
    Scanner sc = new Scanner(System.in);

    public void input() {
        System.out.println("Enter a number : ");
        int num = sc.nextInt();

        switch (num) {
            case 1:
                System.out.println("Monday's child is fair of face !!");
                break;
            case 2:
                System.out.println("Tuesday's child is full of grace");
                break;
            case 3:
                System.out.println(" Wednesday's child is full of woe ");
                break;
            case 4:
                System.out.println("Thursday's child has far to go.");
                break;
            case 5:
                System.out.println("Friday's child is loving and giving ");
                break;
            case 6:
                System.out.println("Saturday's child works hard for a living ");
                break;
            case 7:
                System.out.println("But the bairn that is born on Sunday Is bonny, and blithe, and good and gay");
                break;

            default:
                System.out.println("You are not born yet !!!");
        }
    }
}

class Variables {
    public void varCheck() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first num : ");
        int num1 = sc.nextInt();
        System.out.println("Enter second num : ");
        int num2 = sc.nextInt();
        System.out.println("Enter third num : ");
        int num3 = sc.nextInt();
        System.out.println("Enter fouth num : ");
        int num4 = sc.nextInt();

        if (num1 > num2 && num1 > num3 && num1 > num4) {
            System.out.println(num1 + "\b is greater . ");
        }

        else if (num2 > num1 && num2 > num3 && num2 > num4) {
            System.out.println(num2 + "\b is greater .");
        }

        else if (num3 > num1 && num3 > num2 && num3 > num4) {
            System.out.println(num3 + "\b is greater .");
        }

        else {
            System.out.println(num4 + "/\b is greater .");
        }
    }

}

public class Lec01_oop {
    public static void main(String[] args) {
        Bank ali = new Bank();
        // ali.getData();
        // ali.showData();

        WeeksDays num = new WeeksDays();
        // num.input();

        Variables var = new Variables();
        var.varCheck();

    }
}
