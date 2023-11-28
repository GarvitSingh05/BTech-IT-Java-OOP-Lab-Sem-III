import java.util.ArrayList;
import java.util.Iterator;

class Account {
    private long acctNumber;
    private double balance;
    private String name;

    public Account(long acctNumber, double balance, String name) {
        this.acctNumber = acctNumber;
        this.balance = balance;
        this.name = name;
    }

    public long getAcctNumber() {
        return acctNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "acctNumber=" + acctNumber +
                ", balance=" + balance +
                ", name='" + name + '\'' +
                '}';
    }
}

class Bank {
    private ArrayList<Account> accts;
    private int maxActive;

    public Bank(int maxActive) {
        this.accts = new ArrayList<>();
        this.maxActive = maxActive;
    }

    public boolean addAccount(Account newone) {
        if (accts.size() < maxActive) {
            accts.add(newone);
            return true;
        } else {
            System.out.println("Cannot add more accounts. Maximum limit reached.");
            return false;
        }
    }

    public boolean removeAccount(long acctnum) {
        Iterator<Account> iterator = accts.iterator();
        while (iterator.hasNext()) {
            Account account = iterator.next();
            if (account.getAcctNumber() == acctnum) {
                iterator.remove();
                return true;
            }
        }
        System.out.println("Account with account number " + acctnum + " does not exist.");
        return false;
    }

    public double deposit(long acctnum, double amount) {
        for (Account account : accts) {
            if (account.getAcctNumber() == acctnum) {
                double newBalance = account.getBalance() + amount;
                account.setBalance(newBalance);
                return newBalance;
            }
        }
        System.out.println("Account with account number " + acctnum + " does not exist.");
        return -1;
    }

    public double withdraw(long acctnum, double amount) {
        for (Account account : accts) {
            if (account.getAcctNumber() == acctnum) {
                if (account.getBalance() >= amount) {
                    double newBalance = account.getBalance() - amount;
                    account.setBalance(newBalance);
                    return newBalance;
                } else {
                    System.out.println("Insufficient balance for account number " + acctnum);
                    return -1;
                }
            }
        }
        System.out.println("Account with account number " + acctnum + " does not exist.");
        return -1;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Bank Accounts:\n");
        for (Account account : accts) {
            result.append(account).append("\n");
        }
        return result.toString();
    }
}

public class BankTest {
    public static void main(String[] args) {
        Bank bank = new Bank(30);

        Account account1 = new Account(1001, 5000, "Garvit Singh");
        Account account2 = new Account(1002, 7000, "Aditya Sharma");

        bank.addAccount(account1);
        bank.addAccount(account2);

        System.out.println(bank);

        bank.deposit(1001, 2000);
        bank.withdraw(1002, 3000);

        System.out.println(bank);

        bank.removeAccount(1001);
        bank.removeAccount(1003);

        System.out.println(bank);
    }
}
