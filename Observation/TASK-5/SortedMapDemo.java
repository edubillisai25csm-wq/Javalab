
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapDemo {
    public static void main(String[] args) {

        SortedMap<Integer, String> map = new TreeMap<>();

        map.put(40, "D");
        map.put(10, "A");
        map.put(30, "C");
        map.put(20, "B");
        map.put(50, "E");

        System.out.println("Map: " + map);

        System.out.println("First key: " + map.firstKey());

        System.out.println("Last key: " + map.lastKey());

        System.out.println("Head map: " + map.headMap(30));

        System.out.println("Tail map: " + map.tailMap(30));

        System.out.println("Sub map: " + map.subMap(20, 50));

        System.out.println("Comparator: " + map.comparator());
    }
}