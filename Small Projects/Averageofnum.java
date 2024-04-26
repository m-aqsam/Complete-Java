import java.util.*;

public class Averageofnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // --------------> Average of numbers Input by User <-----------------
        int sum = 0;
        System.out.print("How many numbers you want to Enter : ");  
        int count = sc.nextInt();

        for (int i = 1; i <= count; i++) {
            System.out.println("Enter " + i + " number : ");
            int a = sc.nextInt();

            sum = sum + a;
        }

        int avg = sum / count;
        System.out.println("The Average of "+count+" numbers is "+avg);     

    }

}
