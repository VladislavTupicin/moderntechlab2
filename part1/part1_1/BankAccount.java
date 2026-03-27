package part1.part1_1;

public class BankAccount {
    // Приватные поля экземпляра
    private String owner;
    private double balance;
    private String accountNumber;

    // Приватные статические поля
    private static int totalAccounts = 0;
    private static String bankName;

    // Статический блок инициализации
    static {
        bankName = "Java Bank";
        System.out.println("Банковская система инициализирована");
    }

    // Блок инициализации экземпляра
    {
        totalAccounts++;
        System.out.println("Создание счёта #" + totalAccounts);
    }

    // Конструктор
    public BankAccount(String owner, double initialBalance) {
        this.owner = owner;
        this.balance = initialBalance;
        this.accountNumber = "ACC-" + totalAccounts;
    }

    // Метод пополнения
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Ошибка: сумма должна быть положительной");
        } else {
            balance += amount;
        }
    }

    // Метод снятия
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Ошибка: сумма должна быть положительной");
        } else if (amount > balance) {
            System.out.println("Ошибка: недостаточно средств");
        } else {
            balance -= amount;
        }
    }

    // Статический метод
    public static int getTotalAccounts() {
        return totalAccounts;
    }

    // Переопределённый toString
    @Override
    public String toString() {
        return String.format("[%s] %s: %.2f руб.", accountNumber, owner, balance);
    }

    // Метод main для демонстрации
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Алиса", 1000);
        BankAccount account2 = new BankAccount("Боб", 500);

        System.out.println(account1);
        System.out.println(account2);

        account1.deposit(500);
        System.out.println(account1);

        account1.withdraw(200);
        System.out.println(account1);

        account1.withdraw(2000);
        System.out.println(account1);

        System.out.println("Всего счетов: " + BankAccount.getTotalAccounts());
    }
}