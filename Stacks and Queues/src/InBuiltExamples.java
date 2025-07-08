import java.util.*;

public class InBuiltExamples {
    public static void main(String[] args) {
        //Stack
//        Stack<Integer> stack = new Stack<>();
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

        //Queue
//        Queue<Integer> q = new LinkedList<>();
//        q.add(23);
//        q.add(53);
//        q.add(65);
//        q.add(67);
//        q.add(98);
//
//        System.out.println(q.peek());
//
//        System.out.println(q.remove());
//        System.out.println(q.remove());
//        System.out.println(q.remove());
//        System.out.println(q.remove());
//        System.out.println(q.remove());

        //Deque
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(23);
        deque.addFirst(31);
        deque.addLast(65);
        deque.add(71);

        System.out.println(deque.removeFirst());
        System.out.println(deque.removeFirst());
        System.out.println(deque.removeFirst());
        System.out.println(deque.removeFirst());
    }
}