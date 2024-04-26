import java.util.*;

class ReverseStack {

    public ReverseStack() {

    }

    public void reverse(Stack<Integer>stack){

        Stack<Integer> stack2 = new Stack<>();

        for(int i=stack.size();i>0;i++){
            stack2.get(0)=
        }
    }

}

public class StackDrawRun {
    public static void main(String[] args) {

        // Reverse a stack

        Stack<Integer> stack = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        int max = 3;

        int last = stack.get(3);

        stack2.set(0, stack.get(last));

        System.out.println(stack.size());

        System.out.println(stack);

    }
}
