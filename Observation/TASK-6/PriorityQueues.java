import java.util.PriorityQueue;

public class PriorityQueues {
    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(30);
        pq.offer(10);
        pq.add(20);

        System.out.println(pq);

        System.out.println(pq.peek());

        System.out.println(pq.poll());

        pq.remove(30);

        System.out.println(pq.contains(20));
        System.out.println(pq.size());

        System.out.println(pq);
    }
}