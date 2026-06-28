public class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String owner, String accountId, double interestRate) {
        super(owner, accountId);
        this.interestRate = interestRate;
    }

    public void addInterest() {
        double interest = getBalance() * interestRate;
        System.out.println("利息 " + interest + " 已存入");
        deposit(interest);
    }

    public static void main(String[] args) {
        SavingsAccount account = new SavingsAccount("李小華", "S001", 0.02);
        account.deposit(10000);
        account.showInfo();
        account.addInterest();
        account.showInfo();
    }
}
