import java.util.Iterator;
import java.util.ArrayList;

public class IteratorInterfaceDemo{
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        Iterator<Integer> it = list.iterator();

        System.out.println("Has next: " + it.hasNext());

        System.out.println("Next: " + it.next());

        it.remove();

        System.out.println("List: " + list);

        it.forEachRemaining(x -> System.out.println(x));
    }
}