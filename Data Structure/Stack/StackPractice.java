import java.util.*;

//Stack using Collection frame work methods

public class StackPractice {
    public static void main(String[] args) {
        Stack<String> car = new Stack<>(); // Stack class object
        // Add elements in stack using Push Method

        car.setSize(2);

        car.push("BMW");
        car.push("Suzuki");
        car.push("Honda");
        car.push("Toyota");

        System.out.println(car);

        // Set the size of a stack

        System.out.println("Current size of Stack " + car.size());
        car.setSize(10);// Set Stack size to 10 :
        System.out.println("Now The size of Stack is " + car.size());

        // To find the Element at the Top of Stack

        System.out.println("Element at the top of Stack is : " + car.peek());

        // Remove an element from top of the stack using Pop Method

        System.out.println("Initial Stack is : " + car);
        System.out.println("Remove Element " + car.pop());
        System.out.println("Final Stack : " + car);

        // Check Whether the Stack is Empty or not

        System.out.println(car.empty()); // True if the Stack is Empty or Vice Versa

    }

}
