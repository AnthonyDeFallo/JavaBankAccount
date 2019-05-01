import java.util.Random;
public class ADMDSavings extends ADMDAccount {

    double interestRate;
    ADMDPerson person;
    Random anum = new Random();

    ADMDSavings(double amountIn, ADMDPerson owner, double interestR) {
        accountNumber = 1000000 + anum.nextInt(91028374) + 1;
        setInterestRate(interestR);
        open = true;
        this.person = owner;
        double newDepT;
        newDepT = amountIn + (amountIn * (getInterestRate()/100));
        double newDep = (newDepT * 100)/100;
        this.balance = newDep;
    }

    ADMDSavings() {

    }

    public void setInterestRate(double rate) {
        interestRate = rate;
    }

    public double getInterestRate() {
        return interestRate;
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
            double newDepT;
            newDepT = amount + (amount * (getInterestRate()/100));
            double newDep = (newDepT * 100)/100;
            balance += newDep;
            System.out.println("Balance updated. You deposited " + amount + " and received interest, making the deposit now " + newDep + ". Your new balance is " + getBalance());
            return true;
        }
    }

    @Override
    public boolean withdraw(double amount) {
        return super.withdraw(amount);
    }

    public String convToString() {
        String stuff = "Failed. Account closed.";
        if (open == true) {
            stuff = ("Account owner: " + person.name + "\nAddress: " + person.getAddress() +
                    "\nAccount Num: " + getAccountNumber() + "\nBalance: " + getBalance() + "\nInterest Rate: " + getInterestRate());
        }
        return stuff;
    }

}