import java.util.*;

public class practiceexrcises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // (1) --> Divide two numbers and print .

        System.out.println("                 Divide 2 numbers ");

        System.out.print("Enter first num :");
        int num1 = sc.nextInt();
        System.out.print("Enter second num :");
        int num2 = sc.nextInt();
        int divide = num1 / num2;
        System.out.println(num1 + "/" + num2 + "=" + divide);

        // (2) --> Average of 3 numbers .

        System.out.println("                 Average of 3 numbers ");

        System.out.print("Enter first num ");
        double n1 = sc.nextDouble();
        System.out.print("Enter first num ");
        double n2 = sc.nextDouble();
        System.out.print("Enter first num ");
        double n3 = sc.nextDouble();

        double sum = n1 + n2 + n3;
        double avg = sum / 3;
        System.out.println("The Average of " + n1 + "," + n2 + " and " + n3 + " is " + avg);

    }
}
