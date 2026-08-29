interface I2 {
    int n = 10;

    void display();
}

interface I1 extends I2 {
    int m = 20;

    void example();
}

class C1 implements I1 {

    @Override
    public void display() {
        System.out.println("This is from interface I2");
        System.out.println("Value of n is : " + n);
    }

    @Override
    public void example() {
        System.out.println("This is from interface I1");
        System.out.println("Sum of n and m is : " + (n + m));
    }
}
public class I1ExtendsI2 {
    public static void main(String[] args) {
        C1 obj = new C1();
        obj.display();
        obj.example();
    }
}
/*
output

This is from interface I2
Value of n is : 10
This is from interface I1
Sum of n and m is : 30

*/