package Inheritance;

import java.util.Scanner;

class Multi {
    Scanner sc = new Scanner(System.in);

    // Convert any matrix to diagonal
    public void input() {
        System.out.println("What is the order of your Matrix (or ratio)");
        System.out.print("Rows :");// 3
        int Rows = sc.nextInt();
        System.out.print("Columns :");
        int Columns = sc.nextInt();// 3

        int[][] array = new int[Rows][Columns];

        for (int i = 0; i < Rows; i++) {
            for (int j = 0; j < Columns; j++) {
                System.out.println("Enter  " + array[i][j]);
                array[i][j] = sc.nextInt();
                System.out.println(array[i][j]);

            }

            System.out.println(" ");
        }

    }
}

public class Multidimensional_Arrays {
    public static void main(String[] args) {
        Multi obj1 = new Multi();
        obj1.input();

    }
}
