import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
import java.util.*;

public class Stacks_Queues {
    public static void main(String[] args) {
        // Stacks
        Stack<Integer> stack = new Stack<>();
        stack.push(11);
        stack.push(22);
        stack.push(33);
        stack.push(44);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack);

        // Queues
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);

        System.out.println(queue.peek());
        System.out.println(queue.remove());
        System.out.println(queue);

        // Deque
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(12);
        deque.add(14);
        deque.add(17);
        deque.add(19);
        deque.addLast(99);

        System.out.println(deque.removeFirst());
        System.out.println(deque);

    }
}
 