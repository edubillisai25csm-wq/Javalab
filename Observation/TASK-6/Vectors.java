import java.util.Vector;

public class Vectors {
    public static void main(String[] args) {

        Vector<Integer> v = new Vector<>();

        v.add(10);
        v.add(20);
        v.addElement(30);

        System.out.println(v.get(1));

        v.set(1, 25);

        v.remove(0);
        v.removeElement(30);

        System.out.println(v.size());
        System.out.println(v.capacity());
        System.out.println(v.contains(25));

        System.out.println(v);
    }
}