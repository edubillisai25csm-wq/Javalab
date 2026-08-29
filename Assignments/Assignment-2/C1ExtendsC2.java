class A{
    int x=100;
    void sample1()
    {
        System.out.println("This is from class A");
        System.out.println("The value of x is: "+x);
    }
}
class B extends A{
    int y=200;
    void sample2()
    {
        System.out.println("This is from class B");
        System.out.println("The sum is  : "+(x+y));
    }

}
public class C1ExtendsC2 {

    public static void main(String[] args) {
        B obj=new B();
        obj.sample1();
        obj.sample2();
    }
}
/*output

This is from class A
The value of x is: 100
This is from class B
The sum is  : 300

 */