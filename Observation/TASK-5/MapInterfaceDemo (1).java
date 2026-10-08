import java.util.Map;
import java.util.HashMap;

public class MapInterfaceDemo {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        map.put(101, "Naveen");
        map.put(102, "Ravi");
        map.put(103, "Kiran");

        System.out.println("Map: " + map);

        System.out.println("Value: " + map.get(101));

        map.remove(103);
        System.out.println("After remove: " + map);

        System.out.println("Contains key: " + map.containsKey(102));

        System.out.println("Contains value: " + map.containsValue("Ravi"));

        System.out.println("Keys: " + map.keySet());

        System.out.println("Values: " + map.values());

        System.out.println("Entries: " + map.entrySet());

        System.out.println("Size: " + map.size());

        System.out.println("Is empty: " + map.isEmpty());

        map.clear();
        System.out.println("After clear: " + map);
    }
}