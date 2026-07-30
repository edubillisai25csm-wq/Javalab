package Java;

public class ConstructerUsingParameter {
    int rollno;
    String name;
public ConstructerUsingParameter (int i,String j)
{
    rollno=i;
    name=j;
}
void display()
{
     System.out.println("Student roll no is: "+rollno);
     System.out.println("student name is : "+name);
}
public static void main(String[] args) {
     ConstructerUsingParameter cp = new ConstructerUsingParameter(210, "Sai");
    cp.display();
}
}