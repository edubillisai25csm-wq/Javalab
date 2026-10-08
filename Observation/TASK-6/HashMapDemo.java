import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "India");
        map.put(2, "Dragon");
        map.put(3, "sshyah");

        System.out.println(map);

        System.out.println(map.get(2));
        System.out.println(map.containsKey(1));
        System.out.println(map.containsValue("hskhah"));
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