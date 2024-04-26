import java.util.*;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // -------------> Introduction to Arrays
        // An array is a data structure that stores a collection of elements
        // of the same type. Arrays are indexed, which means that each element
        // in an array has a unique index. The index of the first element
        // in an array is 0, the index of the second element is 1, and so on.

        // -------------> Declaration

        // Datatype [] arrayname = new datatype [size];
        // int [] array = new int[];

        // ----------> Searching and Sorting Arrays Using Algorithms

        // You can also search and sort arrays using algorithms.
        // Here are some examples of algorithms that you can use to search and sort
        // arrays:

        // Bubble sort

        // Selection sort

        // Insertion sort

        // Merge sort

        // Quicksort

        // -----------> Print elements of an array :

        // int [] marks={78,85,69,71,96};
        // System.out.println("Length of Array is "+marks.length );

        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);
        // System.out.println(marks[3]);
        // System.out.println(marks[4]);

        // ---------> using for loop for printing elements of an array :

        // int [] marks={78,85,69,71,96};

        // for (int i=0; i<marks.length;i++) {
        // System.out.println(marks[i]);
        // }

        // --------------------> Reverse an array <-------------------

        // int[] marks = { 78, 85, 69, 71, 96 };

        // for (int i = marks.length - 1; i >= 0; i--) {
        // System.out.println(marks[i]);
        // }

        // ------> Using for each loop for printing elements of an array :

        // int[] marks = { 78, 85, 69, 71, 96 };

        // for (int elements : marks)
        // System.out.println(elements);

        // }

        // -------------------------Arrays Problems ---------------------------------

        // --------------------------(1)----------------------
        // ------> Print Array element as a string ?

        // int [] a={75,86,99,22,55};
        // System.out.println(Arrays.toString(a));

        // --------------------------(2)----------------------
        // ---------> Sum & Average of Array Elements
        // int sum=0;
        // int []a={2,3,4,7};
        // for(int i=0;i<a.length;i++){
        // sum=sum+a[i];
        // }
        // //System.out.println("Sum is "+sum);
        // int avg=sum/a.length;
        // System.out.println("Average of numbers is : "+avg);

        // --------------------------(3)----------------------
        // --------> Print numeric values of an Array

        // String[] a = { "First", "Second", "Third", "Fourth", "Fifth" };
        // System.out.println("Original Array " + Arrays.toString(a));
        // Arrays.sort(a);
        // System.out.println("Numeric Array " + Arrays.toString(a));

    }
}
