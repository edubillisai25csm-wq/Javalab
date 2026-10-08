import java.util.NavigableMap;
import java.util.TreeMap;
public class NavigableMapInterfaceDemo {
    public static void main(String[] args) {

        NavigableMap<Integer, String> map = new TreeMap<>();

        map.put(10, "A");
        map.put(20, "B");
        map.put(30, "C");
        map.put(40, "D");
        map.put(50, "E");

        System.out.println("Map: " + map);

        System.out.println("Lower key: " + map.lowerKey(30));

        System.out.println("Floor key: " + map.floorKey(30));

        System.out.println("Ceiling key: " + map.ceilingKey(30));

        System.out.println("Higher key: " + map.higherKey(30));

        System.out.println("First entry: " + map.firstEntry());

        System.out.println("Last entry: " + map.lastEntry());

        System.out.println("Poll first entry: " + map.pollFirstEntry());

        System.out.println("Poll last entry: " + map.pollLastEntry());

        System.out.println("Descending map: " + map.descendingMap());
    }
}