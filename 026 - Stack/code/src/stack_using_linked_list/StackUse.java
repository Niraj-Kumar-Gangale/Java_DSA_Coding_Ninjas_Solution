package stack_using_linked_list;

public class StackUse {
    public static void main(String[] args) {
        StackUsingLLGeneric<Integer>  newStack =  new StackUsingLLGeneric<>();
        newStack.push(56);
        newStack.push(45);
        newStack.push(46);
        System.out.println(newStack.pop());
    }
}
