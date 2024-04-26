
import java.util.LinkedList;
import java.util.Scanner;

public class Sortingintegers {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter some random inputs (type 'done' when finished):");

        while (input.hasNext()) {

            if (input.hasNextInt()) {
                list.add(input.nextInt());
            } else if (input.next().equals("done")) {
                break;
            } else {
                input.next();
            }

        }

        for (Integer Elements : list) {
            System.out.println(Elements);
        }

    }

}
