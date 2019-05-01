import java.util.Random;
class ADMDBusinessAccount extends ADMDAccount {

    ADMDBusiness business;
    double tfee;
    Random anum = new Random();

    ADMDBusinessAccount(double balance, ADMDBusiness business) {
        this.balance = balance;
        this.business = business;
        open = true;
        accountNumber = 1000000 + anum.nextInt(91028374) + 1;
    }
    ADMDBusinessAccount(double balance, ADMDBusiness business, double fee) {
        this.balance = balance;
        this.business = business;
        setTransactionFee(fee);
        accountNumber = 1000000 + anum.nextInt(91028374) + 1;
        open = true;
    }

    public void setTransactionFee(double fee) {
        tfee = fee;
    }

    public double getTransactionFee(){
        return tfee;
    }

    @Override
    public boolean deposit(double amount) {
        return super.deposit(amount);
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
            balance = balance - amount - tfee;
            System.out.println("Balance updated. New balance is " + getBalance());
            return true;
        }
    }

    public String convToString() {
        String stuff = "Failed. Account closed.";
        if (open == true) {
            stuff = ("Account owner: " + business.businessName + " (" + business.getBusinessType() + ")\nAddress: " + business.getAddress() +
                    "\nAccount Num: " + getAccountNumber() + "\nBalance: " + getBalance() + "\nFee: " + getTransactionFee());
        }
        return stuff;
    }

}