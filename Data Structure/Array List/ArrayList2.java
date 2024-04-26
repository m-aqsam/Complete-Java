import java.util.*;

class Array2 {
    ArrayList<Integer> list = new ArrayList<>();

    public void ListMethods() {

        // Add element in list

        list.add(0, 1);
        list.add(1, 2);
        list.add(2, 3);
        list.add(3, 4);
        list.add(4, 5);

        // Print of list in list using
        // 1 :

        int a = list.get(0);
        System.out.println(a);

        // 2 :

        System.out.println(list.get(1));

        // 3 : print list in list syntax

        System.out.println(list);

        // To check if the element present in the Array list using contain method

        System.out.println(list.contains(1)); // true
        System.out.println(list.contains(6)); // false

        // To find the index of any number in the list

        System.out.println(list.indexOf(4));// index is 3
        System.out.println(list.indexOf(6));// index is -1(mean not present in the list)

        // set/replace element at specific index in arraylist

        System.out.println("Old list" + list);
        list.set(0, 10);
        System.out.println("Updated list " + list);

    }

    // Print using For loop and foreach

    public void print() {

        System.out.println("Using for loop : ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("Using foreach loop : ");
        for (Integer element : list) {
            System.out.println(element);
        }

    }

    // Sum of list elements using for loop

    public void sum() {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum = sum + list.get(i);
        }
        System.out.println("Sum of list Element is " + sum);
    }

}

public class ArrayList2 {
    public static void main(String[] args) {
        Array2 obj1 = new Array2();
        obj1.ListMethods();
        obj1.print();
        obj1.sum();

    }

}
