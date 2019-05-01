
public abstract class ADMDAccount implements ADMDInterface{

    double balance;
    int accountNumber;
    ADMDInformation Owner;
    boolean open;

    public int getAccountNumber() {
        return accountNumber;
    }

    public Object getOwner() {
        return Owner;
    }

    public double getBalance() {
        return balance;
    }

    public boolean deposit(double amount) {
    if (amount < 0) {
        return false;
    }
    else if (open == false) {
        System.out.println("Account is closed. ERROR");
        return false;
    }
    else {
        balance += amount;
        System.out.println("Balance updated. New balance is " + getBalance());
        return true;
    }
    }

    public boolean withdraw (double amount) {
        if (amount > balance || amount < 0) {
            return false;
        }
        else if (open == false) {
            System.out.println("Account is closed. ERROR");
            return false;
        }
        else {
            balance -= amount;
            System.out.println("Balance updated. New balance is " + getBalance());
            return true;
        }
    }

    public void close(){
        open = false;
    }

    public String convToString() {
        String stuff = ("Balance in account number " + getAccountNumber() + " is " +getBalance());

        return stuff;
    }


}