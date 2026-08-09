class A{
    int n;
    int m;
    void sample1(int i,int j)
    {
        n=i;
        m=j;
        System.out.println("This is from Super class ");
        System.out.println("The sum of m and n is : "+(m+n));
    }
}
class B extends A{
    float x;
    void sample2(float l)
    {
        x=l;
        System.out.println("This is from sub class 1");
        System.out.println("The sum is : "+(x+m+n));
    }
}
class C extends A{
    void display()
    {
        System.out.println("This is from sub class 2");
        System.out.println("The product of m and n is : "+(m*n));
    }
}
public class Hierarchical {
    public static void main(String[] args) {
        C obj=new C();
        B s=new B();
        s.sample1(10,20);
        s.sample2(10.2f);
        obj.display();
    }
}
