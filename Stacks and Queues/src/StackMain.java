public class StackMain {
    public static void main(String[] args) throws StackException {
//        CustomStack stack = new CustomStack(5);
//
//        stack.push(23);
//        stack.push(34);
//        stack.push(64);
//        stack.push(24);
//        stack.push(87);
//
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());

        DynamicStack stack = new DynamicStack(5);

        stack.push(23);
        stack.push(34);
        stack.push(64);
        stack.push(24);
        stack.push(87);
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
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
