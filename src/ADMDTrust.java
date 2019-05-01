public class ADMDTrust extends ADMDSavings { // Should be ADMDSavings
    ADMDPerson person;
    double interestRate;

    ADMDTrust(ADMDPerson person, double balanceIn) {
        this.accountNumber = accountNumber;
        this.person = person;
        open = true;
    }

    ADMDTrust(ADMDPerson person, double amount, double rate) {
        this.accountNumber = accountNumber;
        this.person = person;
        interestRate = rate;
        double newDepT;
        newDepT = amount + (amount * (getInterestRate()/100));
        double newDep = (newDepT * 100)/100;
        System.out.println("Balance updated. You deposited " + amount + " and received interest, making the deposit now " + newDep + ". Your new balance is " + getBalance());
        open = true;
    }

    public boolean deposit (double amount) {
        if (amount < 0) {
            return false;
        }
        else if (open == false) {
            System.out.println("Account is closed. ERROR");
            return false;
        }
       else{
            double newDepT;
            newDepT = amount + (amount * (getInterestRate()/100));
            double newDep = (newDepT * 100)/100;
            System.out.println("Balance updated. You deposited " + amount + " and received interest, making the deposit now " + newDep + ". Your new balance is " + getBalance());
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
        else if (person.getAge() < 21) {
            System.out.println("Must be 21 in order to withdraw. ERROR");
            return false;
        }
        else {
            balance -= amount;
            System.out.println("Balance updated. New balance is " + getBalance());
            return true;
        }
    }

    @Override
    public void close() {
        super.close();
    }

    public String convToString() {
        String stuff = "Failed. Account closed.";
        if (open == true) {
            stuff = ("Account owner: " + person.name + "\nAddress: " + person.getAddress() + "\nAge: " + person.age +
                    "\nAccount Num: " + getAccountNumber() + "\nBalance: " + getBalance() + "\nInterest Rate: " + getInterestRate());
        }
        return stuff;
    }

}
