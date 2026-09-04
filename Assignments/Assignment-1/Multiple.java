interface A{
    int x=10;
    void display();
}
interface B
{
    int y=20;
    void example();
}
class C implements A, B 
{

    public void display() 
    {
        System.out.println("This is from interface A");
        System.out.println("The square of n is : " + (x*x));
    }

    public void example() 
    {
        System.out.println("This is from interface B");
        System.out.println("The sum of m and n is : " + (x+y));
    }
    void sample()
    {
        System.out.println("This is from class c");
    }
}
public class Multiple {

    public static void main(String[] args) {
        
        C obj=new C();
        obj.display();
        obj.example();
        obj.sample();
    }
}