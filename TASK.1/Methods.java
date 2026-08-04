import java.util.Scanner;
public class Methods 
{
public static void main(String[] args)
 {
    
    Scanner sc=new Scanner(System.in);
    System.out.println(" 1.factorial\n 2.prime\n 3.MaxOfTwoNumbers\n 4.area");
    System.out.println("Enter your choice: ");
    int ch=sc.nextInt();

    switch (ch) 
    {
        case 1:
            System.out.println("Enter a number: ");
            int n=sc.nextInt();
            int fact=1;
            for(int i=1;i<=n;i++)
            {
                fact=fact*i;
            }
            System.out.println("Factorial of the given number is : "+fact);
            break;
        case 2:

            System.out.println("Enter a number: ");
            int m=sc.nextInt();
            int count=0;
            for(int i=1;i<=m;i++)
            {
                if(m%i==0)
                {
                    count++;
                }
            }
            if(count==2)
            {
                System.out.println("It is a prime number");
            }
            else
            {
                System.out.println("Not a prime number");
            }
            break;
        case 3:

             System.out.println("Enter two numbers : ");
             int a=sc.nextInt();
             int b=sc.nextInt();

             if(a>b)
             {
                System.out.println("A is largest");
             }
             else
            {
              System.out.println("b is largest");
             }
             break;
        case 4:
     
            System.out.println("Enter the radius: ");
                   double r = sc.nextDouble();
                 double area;
                 area=3.14*r*r;
                 System.out.println("area of circle is : "+area);
                 break;

        default:
            System.out.println("Enter a valid choice");
            break;
    }
    sc.close();
 }

}
