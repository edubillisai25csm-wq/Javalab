import java.util.Hashtable;

public class HashTableMapDemo {
    public static void main(String[] args) {

        Hashtable<Integer, String> table = new Hashtable<>();

        table.put(1, "Dragon");
        table.put(2, "DEVIL");
        table.put(3, "EVIL");

        System.out.println(table);

        System.out.println(table.get(2));
        System.out.println(table.containsKey(1));
        System.out.println(table.containsValue("Ravi"));
        System.out.println(table.size());
        System.out.println(table.isEmpty());

        System.out.println(table.keySet());
        System.out.println(table.values());
        System.out.println(table.entrySet());

        table.remove(3);
        System.out.println(table);

        table.clear();
        System.out.println(table);
    }
}