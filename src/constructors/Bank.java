package constructors;

public class Bank {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Jan", "Kowalski", 30);
        BankAccount bankAccount1 = new BankAccount(customer1, 1000.0);
        bankAccount1.showBankAccount();

        double result1 = bankAccount1.addAmountAndReturnNewBalance(500);
        bankAccount1.balance = result1;

        bankAccount1.showBankAccount();

        double result2 = bankAccount1.substractAmountAndReturnNewBalance(350);
        bankAccount1.balance = result2;

        bankAccount1.showBankAccount();
    }
}
