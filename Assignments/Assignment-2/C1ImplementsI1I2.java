interface I1{
    int x=10;
    void sample1();
}
interface I2
{
    int y=20;
    void sample2();
}
class C1 implements I1,I2{

    @Override
    public void sample1()
    {
        System.out.println("This is from interface I1");
        System.out.println("Square of x is : " + (x*x));
    }
    @Override
    public void sample2()
    {
        System.out.println("This is from interface I2");
        System.out.println("Sum of x and y is : " + (x+y));
    }
}
public class C1ImplementsI1I2 {
    public static void main(String[] args) {
        C1 obj=new C1();
        obj.sample1();
        obj.sample2();
    }
}

/*
output

This is from interface I1
Square of x is : 100
This is from interface I2
Sum of x and y is : 30

*/