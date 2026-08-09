//difference between constructer and method
public class Difference {
    int n;
    String name;
    //condtructer
    public Difference(int i,String j)
    {
        this.n=i;
        this.name=j;
        System.out.println("The value of n is :"+(n));
        System.out.println("Name is : "+name);

    }
    //method
    void sample()
    {
        int m=20;
        System.out.println("The product of m and n is : "+(m*n));
        System.out.println("This is from method ");
    }
    public static void main(String[] args) {
        Difference obj=new Difference(5,"sai");
        obj.sample();
    }
}
