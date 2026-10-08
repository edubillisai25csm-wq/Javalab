 import java.util.Queue;
 import java.util.LinkedList;

public class Queues {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.add(10);
        q.add(20);
        q.add(30);

        q.offer(40);

        System.out.println(q.remove());
        System.out.println(q.poll());

        System.out.println(q.element());
        System.out.println(q.peek());

        System.out.println(q);
    }
}