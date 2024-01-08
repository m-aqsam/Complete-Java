import java.util.*;
import java.io.*;

public class BasicExercises {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ----------- -----Java Basic Exercises------------------
        // -----> (1)

        // System.out.println("Hello !");
        // System.out.println("Aqsam ");

        // -----> (2)

        // int num1 = 74;
        // int num2 = 36;
        // int sum = num1 + num2;
        // System.out.printf("The sum of %d and %d is " + sum, num1, num2);

        // -----> (3)

        // int num1 = 50;
        // int num2 = 3;
        // int div = num1 / num2;
        // System.out.printf("%d / %d = " + div, num1, num2);

        // -----> (4)

        int a1 = -5;
        int a2 = 8;
        int a3 = 6;
        int operator1 = a1 + (a2 * a3);
        System.out.println(operator1);

        // int b1 = 55;
        // int b2 = -9;
        // int operator2 = (b1 + b2) % b2;
        // System.out.println(operator2);

        // int c1 = 20;
        // int c2 = -3;
        // int c3 = 5;
        // int c4 = 8;
        // int operator3 = c1 + (c2 * c3) / c4;
        // System.out.println(operator3);

        // // 5 + 15/3 * 2- 8%3

        // int d1 = 5;
        // int d2 = 15;
        // int d3 = 3;
        // int d4 = 2;
        // int d5 = 8;
        // int d6 = 3;
        // int operator4 = d1 + ((d2 / d3) * d4) -( d5 % d3);
        // System.out.println(operator4);

        // -----> (5)

        // System.out.println("Enter first number ");
        // double num1=sc.nextDouble();
        // System.out.println("Enter second number ");
        // double num2=sc.nextDouble();

        // double product=num1*num2;
        // System.out.println("The product of "+num1+" and "+num2+" is "+product);

        // -----> (6)

        // System.out.println("Enter First number");
        // int num1 = sc.nextInt();
        // System.out.println("Enter second number");
        // int num2 = sc.nextInt();

        // int sum = num1 + num2;
        // int differnce = num1 - num2;
        // int product = num1 * num2;
        // int divide = num1 / num2;
        // int mod = num1 % num2;

        // System.out.println(num1+" + "+num2+" = "+sum);
        // System.out.println(num1+" - "+num2+" = "+differnce);
        // System.out.println(num1+" * "+num2+" = "+product);
        // System.out.println(num1+" / "+num2+" = "+divide);
        // System.out.println(num1+" % "+num2+" = "+mod);

        // -----> (7)

        // System.out.println("Enter the num you want table :");
        // long num = sc.nextLong();

        // for (int i = 1; i <= 10; i++) {
        // long table = num * i;
        // System.out.println(num + "*" + i + "=" + table);

        // }

        // -----> (8)

        // System.out.println(" j a v v a ");
        // System.out.println(" j a a v v a a ");
        // System.out.println("j j aaaaa v v aaaaa ");
        // System.out.println(" jj a a v a a ");

        // -----> (9)

        // double compute = ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
        // System.out.println(compute);

        // -----> (10)

        // double compute2=4.0*(1-(1.0/3)+(1.0/5)-(1.0/7)+(1.0/9)-(1.0/11));
        // System.out.println(compute2);

        // -----> (11)

        // -----> Perimeter of a circle = C = 2πr
        // -----> Area of a circle = A = πr2 (π*r*r)
        // -----> π = 3.14

        // final double pi = 3.14;
        // double radius = 7.5;
        // double r = radius;
        // double Perimeter = 2 * pi * r;
        // double Area = pi * r * r;
        // System.out.println("The perimete of a Circle is " + Perimeter);
        // System.out.println("The Area of a Circle is " + Area);

        // -----> (12)

        // int sum = 0;
        // System.out.println("How many numbers you to Enter : ");
        // int count = sc.nextInt();

        // for (int i = 1; i <= count; i++) {
        // System.out.println(" Enter " + i + " number ");
        // int numbers = sc.nextInt();
        // sum = sum + numbers;
        // }
        // int average = sum / count;
        // System.out.println("The Average of " + count + " Numbers is " + sum + "/" +
        // count + " = " + average);

        // -----> (13)

        // ------> Perimeter of a Rectangle =P=2(l+w)
        // ------> Area of Rectanglr =A=wl

        // double Width=5.5;
        // double Length=8.5;
        // double Area=Width*Length;
        // double Perimeter=2*(Length+Width);

        // System.out.println("Area of Reactangle is :"+Area);
        // System.out.println("Perimeter of Reactangle is :"+Perimeter);

        // -----> (14) ----> Print American flag

        // System.out.println("* * * * * * ========================");
        // System.out.println(" * * * * * ========================");
        // System.out.println("* * * * * * ========================");
        // System.out.println(" * * * * * ========================");
        // System.out.println("* * * * * * ========================");
        // System.out.println(" * * * * * ========================");
        // System.out.println("* * * * * * ========================");
        // System.out.println(" * * * * * ========================");
        // System.out.println("* * * * * * ========================");
        // System.out.println("====================================");
        // System.out.println("====================================");
        // System.out.println("====================================");
        // System.out.println("====================================");
        // System.out.println("====================================");
        // System.out.println("====================================");

        // -----> (15) -----> Swap two variable

        // int a=5;
        // int b=10;
        // System.out.printf("Before Swaping : a,b = %d , %d ",a,b);
        // System.out.println("");

        // int temp=a;
        // a=b;
        // b=temp;
        // System.out.printf("After Swaping : a,b = %d , %d ",a,b);

        // -----> (16) ------> Print Face - ---> ( Escape Character Sequence )

        // System.out.println(" +\"\"\"\"\"\"+");
        // System.out.println("[| 0 0 |]");
        // System.out.println(" | ^ |");
        // System.out.println(" | '-' |");
        // System.out.println(" +------+");

        // -----> (32) ---> Compare Two NUmbers

        // int num1=25;
        // int num2=39;

        // if (num1 != num2){
        // System.out.printf("%d != %d\n",num1,num2);
        // }
        // if (num1 < num2){
        // System.out.printf("%d < %d\n",num1,num2);
        // }
        // if (num1 <= num2){
        // System.out.printf("%d <= %d\n",num1,num2);
        // }

        // -----> (33) ---> Compute sum of Digits of integer

        // int sum=0;
        // System.out.println("Enter an integer : ");
        // String num=sc.nextLine();

        // for (int i=0;i<num.length();i++) {
        // sum=sum+num.charAt(i);

        // }
        // System.out.println("The sum is "+sum);

        // -----> (37) ----->

        // String input ="Hello";
        // String reversestr="";

        // for(int i=0; i<input.length();i++){
        // char ch=input.charAt(i);
        // reversestr=ch+reversestr;
        // }
        // System.out.println(reversestr);

    }
}
