import java.util.Stack;

public class InBuiltExamples {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(23);
        stack.push(34);
        stack.push(64);
        stack.push(24);
        stack.push(87);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}