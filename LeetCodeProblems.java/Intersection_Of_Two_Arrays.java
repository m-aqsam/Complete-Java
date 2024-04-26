import java.util.*;

public class Intersection_Of_Two_Arrays {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        int[] num1 = { 1, 2, 3, 4 };
        int[] num2 = { 2, 5, 6, 4 };

        int n = num1.length - 2;
        int m = num1.length - 2;

        int i = 0;
        int j = 0;

        while (i != num1.length && j != num2.length) {

            if (num1[i] > num2[j]) {
                i++;
            } else if (num1[i] < num2[j]) {
                j++;
            } else {
                list.add(num1[i]);
                i++;
                j++;
            }

        }

        int[] result = new int[list.size()];
        for (int k = 0; i <= list.size(); i++) {
            result[k] = list.get(k);

            System.out.println(result);

        }

    }

}
