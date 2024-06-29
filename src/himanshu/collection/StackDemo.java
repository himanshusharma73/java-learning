package himanshu.collection;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.add(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack);
        System.out.println(stack.search(10));
        System.out.println(stack.search(20));
        System.out.println(stack.indexOf(20));
    }
}
