interface PaymentService
{
    void pay(String upiId, double amount)
    throws InvalidUPIException, InvalidAmountException,
           InsufficientBalanceException;

    double checkBalance();
}
class Wallet {
    private String username;
    private String mobilenumber;
    private String upiId;
    private double balance;

    Wallet(String username,String mobilenumber,String upiId,double balance)
    {
        this.username=username;
        this.mobilenumber = mobilenumber;
        this.upiId = upiId;
        this.balance = balance;
    }
    void addMoney(double amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Invalid amount");
        }

        balance = balance + amount;
        System.out.println(amount + " added to wallet");
    }
     double getBalance() {
        return balance;
    }

    String getUpiId() {
        return upiId;
    }

    void displayWalletDetails() {
        System.out.println("\nWallet Details");
        System.out.println("User Name: " + username);
        System.out.println("Mobile Number: " + mobilenumber);
        System.out.println("UPI ID: " + upiId);
        System.out.println("Balance: " + balance);
    }

    void deductMoney(double amount) {
        balance = balance - amount;
    }
}
// Custom Exception 1
class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String message) {
        super(message);
    }
}


// Custom Exception 2
class InvalidUPIException extends Exception {
    InvalidUPIException(String message) {
        super(message);
    }
}


// Custom Exception 3
class InvalidAmountException extends Exception {
    InvalidAmountException(String message) {
        super(message);
    }
}


// UPI Payment Class
class UPIPayment implements PaymentService {

    Wallet wallet;

    UPIPayment(Wallet wallet) {
        this.wallet = wallet;
    }

    @Override
    public void pay(String upiId, double amount)
        throws InvalidUPIException, InvalidAmountException,InsufficientBalanceException {

        // UPI validation
        if (!upiId.contains("@")) {
            throw new InvalidUPIException("Invalid UPI ID");
        }

        // Amount validation
        if (amount <= 0) {
            throw new InvalidAmountException("Invalid payment amount");
        }

        // Balance validation
        if (amount > wallet.getBalance()) {
            throw new InsufficientBalanceException(
                "Insufficient wallet balance");
        }

        wallet.deductMoney(amount);

        System.out.println("Payment successful");
        System.out.println("Amount Paid: " + amount);
        System.out.println("Paid to: " + upiId);
    }

    @Override
    public double checkBalance() {
        return wallet.getBalance();
    }
}

public class UpiPayementSystem {

    public static void main(String[] args) {
        Wallet wallet = new Wallet(
            "Sai",
            "90000000000",
            "sai@upi",
            50000
        );

        UPIPayment payment = new UPIPayment(wallet);

        wallet.displayWalletDetails();

        try {
            wallet.addMoney(2000);

            payment.pay("riya@upi", 15000);

            System.out.println("Available Balance: " + payment.checkBalance());

        } catch (InvalidUPIException e) {
            System.out.println(e.getMessage());

        } catch (InvalidAmountException e) {
            System.out.println(e.getMessage());

        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());

        } finally {
            System.out.println("\nTransaction completed");
        }

        wallet.displayWalletDetails();

        System.out.println("\nFinal Wallet Balance: " + wallet.getBalance());
    
    }
}