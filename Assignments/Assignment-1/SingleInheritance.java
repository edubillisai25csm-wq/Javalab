class A{
    int n;
    void sample(int i)
    {
        System.out.println("This is from class A");
        n=i;
        System.out.println("The square of n is : "+(n*n));
    }
}
class B extends A{
    int m;
       void example(int j){
        System.out.println("This is from class b");
        m=j;
        System.out.println("The sum of m and n is : "+(m+n));
       }
}
public class SingleInheritance{
    public static void main(String[] args) {
        B obj=new B();
        obj.sample(4);
        obj.example(5);
    }
}