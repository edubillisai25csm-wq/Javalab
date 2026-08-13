class A {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class Overloading {

    public static void main(String[] args) {

        A a = new A();

        System.out.println("sum is : " + a.add(10, 20));

        System.out.println("sum is : " + a.add(10, 20, 30));

        System.out.println("sum is : " + a.add(30.5, 36.5));
    }
}