import java.util.Random;
class ADMDChecking extends ADMDAccount {

        private ADMDPerson person;
        private double checkFee;
        Random anum = new Random();

        ADMDChecking(ADMDPerson owner, double checkF) {
                accountNumber = 1000000 + anum.nextInt(91028374) + 1;
                setCheckFee(checkF);
                open = true;
                this.person = owner;
        }
        ADMDChecking() {

        }

        public void setCheckFee(double fee) {
                checkFee = fee;
        }

        public double getCheckFee(){
                return checkFee;
        }

        @Override
        public boolean deposit(double amount) {
                return super.deposit(amount);
        }

        @Override
        public boolean withdraw(double amount) {
                return super.withdraw(amount);
        }

        public String convToString() {
                String stuff = "Failed. Account closed.";
                if (open == true) {
                        stuff = ("Account owner: " + person.name + "\nAddress: " + person.getAddress() +
                                "\nAccount Num: " + getAccountNumber() + "\nBalance: " + getBalance() + "\nCheck Fee: " + getCheckFee());
                }
                return stuff;
        }

}