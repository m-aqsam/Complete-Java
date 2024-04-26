import java.util.ArrayList;

import java.util.*;

public class Ad_Two_Lists {
    public static void main(String[] args) {

        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        ArrayList<Integer> l3 = new ArrayList<>();

        l1.add(0, 2);
        l1.add(1, 4);
        l1.add(2, 3);

        l2.add(0, 5);
        l2.add(1, 6);
        l2.add(2, 4);

        for (int i = l1.size() - 1; i >= 0; i--) {
            for (int j = i; j >= i; j--) {

                l3.add(l1.get(i) + l2.get(j));
                if(l3.add>)

            }
        }

        System.out.println(l3);

    }
}
