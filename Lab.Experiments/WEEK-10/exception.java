 import java.util.Scanner;
 //userfine exception

class LengthNotSufficentException extends RuntimeException {
    // constructor
    LengthNotSufficentException(String message) {
        super(message);
    }
}

public class exception {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter mobile number");
        String number = sc.nextLine();

        try {
            if (number.length() > 10) {
                throw new ArrayIndexOutOfBoundsException("Mobile number should not exceed 10 digits");
            }

            if (number.length() < 10) {
                throw new LengthNotSufficentException("Mobile number should contain 10 digits");
            }

            long n = Long.parseLong(number);

            System.out.println("Mobile number is valid");
        }

        catch (LengthNotSufficentException e) {
            System.out.println(e.getMessage());
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        catch (NumberFormatException e) {
            System.out.println("Enter only digits");
        }
    }
}