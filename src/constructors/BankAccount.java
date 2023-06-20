package constructors;

public class BankAccount {
    Customer owner;
    double balance;

    public BankAccount (Customer owner, double balance){
        this.owner = owner;
        this.balance = balance;
    }

    //metody zwracające wynik: liczby, napisy, obiekty (Typy proste i obiektowe)
    double addAmountAndReturnNewBalance(double amount){
        double result = balance + amount;
        return result;
    }

    double substractAmountAndReturnNewBalance(double amount){
        double result = balance - amount;
        return  result;
    }

    //metody niezwracające nic
    void showBankAccount(){
        System.out.printf("%s %s %d lat posiada konto bankowe na którym jest aktualnie %.0f zł\n",
                owner.name, owner.surname, owner.age, balance);
    }
}
