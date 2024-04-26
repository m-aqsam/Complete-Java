
import java.util.*;

class Methods {

    // For sorting only Integers

    public void sorting_Integers() {

        LinkedList<Object> list3 = new LinkedList<>(); // for add Elements
        LinkedList<Object> list4 = new LinkedList<>(); // to store only integers

        list3.add(1);
        list3.add(2);
        list3.add(2);
        list3.add("Name");
        list3.add("q");
        list3.add(3);

        for (Object Elements : list3) {

            if (Elements instanceof Integer) {

                list4.add(Elements);
            }
        }

        System.out.println(list4);
    }

    // for sorting Strings

    public void sorting_string() {

        LinkedList<Object> list1 = new LinkedList<>(); // for adding elements
        LinkedList<Object> list2 = new LinkedList<>(); // for sorting only Strings

        list1.add(0);
        list1.add("a");
        list1.add("b");
        list1.add(1);
        list1.add("c");
        list1.add(2);

        for (Object Elements : list1) {

            if (Elements instanceof String) {

                list2.add(Elements);

            }
        }

        System.out.println(list2);
    }

}

public class LinkedList_Assignment {
    public static void main(String[] args) {

        Methods obj1 = new Methods();

        obj1.sorting_Integers();
        obj1.sorting_string();

    }

}
