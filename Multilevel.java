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
class C extends B{
    void display(){
        System.out.println("This is from class c");
        System.out.println("The product of m and n is : "+(m*n));
    }
}
public class Multilevel {
    public static void main(String[] args) {
    C obj=new C();
    obj.sample(2);
    obj.example(5);
    obj.display();
    }
}
