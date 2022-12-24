import java.util.*;
import java.lang.*;
import java.util.Stack;

class Source {

    public static void main(String arg[]) {
        Stack<Integer> stack = new Stack<Integer>();

        stack.push(2);
        stack.push(14);
        stack.push(23);
        stack.pop();
        stack.push(12);


        // Your stack should finally look like this: [2, 45, 53, 54, 12].
        stack.pop();
        stack.pop();
        stack.push(45);
        stack.push(53);
        stack.push(54);
        stack.push(12);

        System.out.print(stack);
    }
}

