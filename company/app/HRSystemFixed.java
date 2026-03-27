package company.app;

import company.core.EmployeeFixed;

public class HRSystemFixed {
    public static void main(String[] args) {
        EmployeeFixed emp = new EmployeeFixed("Иван", 30, 80000, "secret");  // ✅ правильный вызов конструктора

        // Используем геттеры
        System.out.println(emp.getName());                    // ✅
        System.out.println(emp.getAge());                     // ✅
        System.out.println(emp.getSalary());                  // ✅
        System.out.println(emp.getRole());                    // ✅

        emp.promote(5000);                                    // ✅ (убрал raise:)
        emp.printSummary();                                   // ✅

        // Аутентификация через публичный метод
        System.out.println("Пароль 'secret' верен: " + emp.authenticate("secret"));   // ✅
        System.out.println("Пароль 'wrong' верен: " + emp.authenticate("wrong"));     // ✅
    }
}