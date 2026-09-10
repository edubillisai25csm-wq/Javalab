class Demo 
{
    void sample()
    {
        String s="sai";
        String n="SAI";

        System.out.println("Is equal or not: "+s.equalsIgnoreCase(n));
    }
}
public class EqualIgnoreCase {
    public static void main(String[] args) {
        Demo d=new Demo();
        d.sample();
    }
}
