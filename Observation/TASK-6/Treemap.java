import java.util.TreeMap;

public class Treemap {
    public static void main(String[] args) {

        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(30, "C");
        map.put(10, "A");
        map.put(20, "B");
        map.put(40, "D");

        System.out.println(map);

        System.out.println(map.get(20));
        System.out.println(map.containsKey(10));
        System.out.println(map.containsValue("B"));
        System.out.println(map.size());
        System.out.println(map.isEmpty());

        System.out.println(map.firstKey());
        System.out.println(map.lastKey());

        System.out.println(map.lowerKey(30));
        System.out.println(map.floorKey(30));
        System.out.println(map.higherKey(30));
        System.out.println(map.ceilingKey(30));

        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.entrySet());

        map.remove(20);
        System.out.println(map);

        map.clear();
        System.out.println(map);
    }
}
