import java.util.*;

class OnlyBinary {
    Scanner sc = new Scanner(System.in);

    public void getDta() {
        System.out.println("Enter First num : ");
        int num1 = sc.nextInt();
        System.out.println("Enter Second num : ");
        int num2 = sc.nextInt();

    }

    public void checkBinary(int num1,int num2){
        if ((num1>=0 && num1<=1) && (num2>=0 && num2<=1 )) { 
            System.out.println("Both are 0 and 1"); 
    
        } else {
            System.out.println("Enter only are 0 and 1");      
        }
    }
}

public class W3schoolExercises {
    public static void main(String[] args) {
        OnlyBinary obj1 = new OnlyBinary();  
        obj1.getDta();
        obj1.checkBinary(0, 0); 

    }
}
