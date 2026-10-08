import java.util.Scanner;

interface Employee {
    void salaryDetails();
}

class RegularEmployee implements Employee {

    public void salaryDetails() {
        int basic = 25000;
        int hra = 15000;
        int ta = 5000;
        int total = basic + hra + ta;

        System.out.println("Salary Details:");
        System.out.println("Basic Pay: " + basic);
        System.out.println("HRA: " + hra);
        System.out.println("T.A: " + ta);
        System.out.println("Total Amount: " + total);
    }
}

class ContractEmployee implements Employee {

    public void salaryDetails() {
        int basic = 12000;
        int ta = 3000;
        int total = basic + ta;

        System.out.println("Salary Details:");
        System.out.println("Basic Pay: " + basic);
        System.out.println("HRA: 0");
        System.out.println("T.A: " + ta);
        System.out.println("Total Amount: " + total);
    }
}
public class Week8 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Id: ");
        String id = sc.nextLine();

        Employee emp;

        if (id.startsWith("R")) {
            emp = new RegularEmployee();
        } 
        else if (id.startsWith("C")) {
            emp = new ContractEmployee();
        } 
        else {
            System.out.println("Invalid Employee Id");
            sc.close();
            return;
        }

        emp.salaryDetails();

        sc.close(); 
    }
}