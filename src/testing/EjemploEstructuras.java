package testing;
import java.util.*;

public class EjemploEstructuras {
    public static void main(String[] args) {

        // ---------- STACK (LIFO) ----------
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("STACK (LIFO)");
        System.out.println("Contenido inicial: " + stack);
        System.out.println("pop(): " + stack.pop());   // 30
        System.out.println("peek(): " + stack.peek()); // 20
        System.out.println("Contenido final: " + stack);
        System.out.println();


        // ---------- QUEUE (FIFO) ----------
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);

        System.out.println("QUEUE (FIFO)");
        System.out.println("Contenido inicial: " + queue);
        System.out.println("poll(): " + queue.poll());   // 10
        System.out.println("peek(): " + queue.peek());   // 20
        System.out.println("Contenido final: " + queue);
        System.out.println();


        // ---------- DEQUE (DOBLE COLA) ----------
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(10);
        deque.addLast(20);
        deque.addLast(30);

        System.out.println("DEQUE (doble cola)");
        System.out.println("Contenido inicial: " + deque);
        System.out.println("pollFirst(): " + deque.pollFirst()); // 10
        System.out.println("pollLast(): " + deque.pollLast());   // 30
        System.out.println("peekFirst(): " + deque.peekFirst()); // 20
        System.out.println("Contenido final: " + deque);


    }
}
