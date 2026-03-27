//package company.app;
//
//import company.core.Employee;
//
//public class HRSystem {
//    public static void main(String[] args) {
//        Employee emp = new Employee("Иван", 30, 80000, "secret");  // ✅ убрал age:, salary:, password:
//
//        System.out.println(emp.name);            // Строка A - ✅ public
//        System.out.println(emp.age);             // Строка B - ❌ protected
//        System.out.println(emp.salary);          // Строка C - ❌ package-private
//        System.out.println(emp.password);        // Строка D - ❌ private
//        System.out.println(emp.getRole());       // Строка E - ✅ public
//        emp.promote(5000);                       // Строка F - ❌ protected (убрал raise:)
//        emp.printSummary();                      // Строка G - ❌ package-private
//        emp.validatePassword("secret");          // Строка H - ❌ private (убрал input:)
//    }
//}