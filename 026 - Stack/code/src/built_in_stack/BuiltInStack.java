package built_in_stack;

import java.util.Stack;

public class BuiltInStack {
    public static void main(String[] args) {
        Stack<Integer> newStack = new Stack<>();
        newStack.push(78);
        newStack.push(78);
        System.out.println(newStack.pop());
        System.out.println(newStack.pop());
    }
}
