class A {
    void add(int a, int b) {
        System.out.println("Parent sum: " + (a + b));
    }
}

class B extends A {
    @Override
    void add(int a, int b) {
        System.out.println("Child sum: " + (a + b));
    }
}

public class Overriding {
    public static void main(String[] args) {

        B b = new B();
        b.add(10, 20);
    }
}