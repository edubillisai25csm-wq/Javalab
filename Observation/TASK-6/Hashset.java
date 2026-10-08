import java.util.HashSet;

public class Hashset {
    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(20);

        System.out.println(set);

        set.remove(10);

        System.out.println(set.contains(20));
        System.out.println(set.size());
        System.out.println(set.isEmpty());

        set.clear();

        System.out.println(set);
    }
}