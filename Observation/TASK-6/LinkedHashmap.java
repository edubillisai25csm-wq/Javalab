import java.util.LinkedHashMap;

public class LinkedHashmap{
    public static void main(String[] args) {

        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

        map.put(3, "Devil");
        map.put(1, "Evil");
        map.put(2, "Dragon");

        System.out.println(map);

        System.out.println(map.get(1));
        System.out.println(map.containsKey(2));
        System.out.println(map.containsValue("yga"));
        System.out.println(map.size());
        System.out.println(map.isEmpty());

        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.entrySet());

        map.remove(3);
        System.out.println(map);

        map.clear();
        System.out.println(map);
    }
}