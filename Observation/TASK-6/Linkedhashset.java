import java.util.LinkedHashSet;

public class Linkedhashset {
    public static void main(String[] args) {

        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        set.add(30);
        set.add(10);
        set.add(20);
        set.add(10);

        System.out.println(set);

        set.remove(30);

        System.out.println(set.contains(20));
        System.out.println(set.size());

        set.clear();

        System.out.println(set);
    }
}