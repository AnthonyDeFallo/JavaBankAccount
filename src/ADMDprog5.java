
public class ADMDprog5 {

    public static void main(String[] args) {
        ADMDBusiness Business = new ADMDBusiness("Tekenology, LLC", "PO Box 4054 Steubenville, OH 43952", "Technology Services");
        ADMDPerson Person1 = new ADMDPerson ("Anthony DeFallo", "2401 Alexander Manor E Steubenville, OH 43952", 21);
        ADMDPerson Person2 = new ADMDPerson ("Bill Reed", "1235 University Blvd. Steubenville, OH 43952", 32);
        ADMDPerson Person3 = new ADMDPerson ("James Chartier", "1235 University Blvd. Steubenville, OH 43952", 30);
        ADMDPerson PersonUnderage = new ADMDPerson ("Sam Smith", "Not a real address only a test", 18);

        ADMDBusinessAccount BusinessAccount = new ADMDBusinessAccount(100.75, Business, 1.22);
        ADMDSavings SavingsAccount = new ADMDSavings(3452.45, Person1, 2.75);
        ADMDTrust TrustAccount = new ADMDTrust(Person2, 45987, 3.50);
        ADMDTrust TrustAccountUnder = new ADMDTrust(PersonUnderage, 3400, 3.50);
        ADMDChecking CheckingAccount = new ADMDChecking(Person3, 0.75);

        ADMDAccount array[] = {BusinessAccount, SavingsAccount, TrustAccount, TrustAccountUnder, CheckingAccount};
        for (int i = 0; i<5; i++) {
            double depositA = 5403;
            double withdrawA = 345;
            array[i].deposit(depositA);
            array[i].withdraw(withdrawA);
            System.out.println("\n" + array[i].convToString() + "\n");
            array[i].close();
            array[i].deposit (depositA);
            System.out.println("\n" + array[i].convToString() + "\n");
        }



    }


}