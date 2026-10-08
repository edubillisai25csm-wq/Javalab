import java.util.NavigableSet;
import java.util.TreeSet;

public class Navigableset{
    public static void main(String[] args) {
        NavigableSet<Integer> set = new TreeSet<>();

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);

        System.out.println(set.lower(30));
        System.out.println(set.floor(30));
        System.out.println(set.ceiling(30));
        System.out.println(set.higher(30));

        System.out.println(set.pollFirst());
        System.out.println(set.pollLast());

        System.out.println(set.descendingSet());
    }
}