abstract class Example{

    int x=20;
    int y=30;

    void sample()
    {
        System.out.println("The value of x is: "+x);
        System.out.println("The value of y is : "+y);
    }
    abstract void display();
}
public class AbstractDemo extends Example {

    @Override
    void display()
    {
        System.out.println("sum is :"+(x+y));
        System.out.println("subtraction is : "+(y-x));
        System.out.println("Multiplication is : "+(x*y));
    }

    public static void main(String[] args) {
        
        AbstractDemo ad=new AbstractDemo();
        ad.sample();
        ad.display();
    }
}
//output
/*
The value of x is: 20
The value of y is : 30
sum is :50
subtraction is : 10
Multiplication is : 600

*/
