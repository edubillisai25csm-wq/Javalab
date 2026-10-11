
import java.util.Scanner;
import number.Roman;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roman numeral: ");
        String s = sc.nextLine();

        int result = Roman.romanToInteger(s);

        System.out.println("Integer value: " + result);

        sc.close();
    }
}

