import java.util.Scanner;

class Customer {
    String name;

    Customer(String name) {
        this.name = name;
    }
}

class Account {
    int accNo;
    double balance;

    Account(int accNo, double balance) {
        this.accNo = accNo;
        this.balance = balance;
    }
}

class RBI {
    double getInterest() {
        return 4;
    }
}

class SBI extends RBI {
    double getInterest() {
        return 7;
    }
}

class ICICI extends RBI {
    double getInterest() {
        return 7.5;
    }
}

class PNB extends RBI {
    double getInterest() {
        return 6.5;
    }
}public class DynamicPolymorphism {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Bank name to find the rate of Interest : ");
        String name = sc.nextLine();

        RBI bank;

        if (name.equalsIgnoreCase("SBI")) {
            bank = new SBI();
        } else if (name.equalsIgnoreCase("ICICI")) {
            bank = new ICICI();
        } else if (name.equalsIgnoreCase("PNB")) {
            bank = new PNB();
        } else {
            bank = new RBI();
        }

        System.out.println("RBI rate of interest is : "
                + bank.getInterest() + "%");

        sc.close();
    }
}