import java.util.LinkedList;
import java.util.Scanner;

public class Sort_Integers_From_input {
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

        System.out.println("List of integers entered:");
        for (Integer num : list) {
            System.out.print(num + " ");
        }
    }
}
