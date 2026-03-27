package company.core;

public class EmployeeFixed {
    // Все поля private
    private String name;
    private int age;
    private double salary;
    private String password;

    // Конструктор
    public EmployeeFixed(String name, int age, double salary, String password) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.password = password;
    }

    // Геттеры
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    // Публичные методы
    public String getRole() {
        return "Employee";
    }

    public void promote(double raise) {
        if (raise > 0) {
            this.salary += raise;
        }
    }

    public void printSummary() {
        System.out.println(name + ", " + age + " лет, " + salary + " руб.");
    }

    // Приватный метод
    private boolean validatePassword(String input) {
        return password.equals(input);
    }

    // Публичный метод аутентификации
    public boolean authenticate(String input) {
        return validatePassword(input);
    }
}