package part1.part1_3;

import part1.part1_1.BankAccount;
import java.util.ArrayList;

public class VarDemo {

    // НЕ КОМПИЛИРУЕТСЯ - var нельзя использовать как поле класса
    // var field = 10;

    public static void main(String[] args) {

        System.out.println("=== Демонстрация ключевого слова var (Java 10+) ===\n");

        System.out.println("5 КОРРЕКТНЫХ ПРИМЕРОВ:\n");

        // Пример 1: int
        var number = 42;
        System.out.println("  var number = 42 -> " + getTypeName(number));

        // Пример 2: String
        var text = "Java";
        System.out.println("  var text = \"Java\" -> " + getTypeName(text));

        // Пример 3: ArrayList<String>
        var list = new ArrayList<String>();
        list.add("один");
        list.add("два");
        list.add("три");
        System.out.println("  var list = new ArrayList<String>() -> " + getTypeName(list));

        // Пример 4: массив
        var array = new int[]{1, 2, 3, 4, 5};
        System.out.println("  var array = new int[]{...} -> " + getTypeName(array));

        // Пример 5: BankAccount
        var account = new BankAccount("Тестовый", 1000);
        System.out.println("  var account = new BankAccount(...) -> " + getTypeName(account));

        // Вывод значений
        System.out.println("\nЗНАЧЕНИЯ ПЕРЕМЕННЫХ:");
        System.out.println("  number = " + number);
        System.out.println("  text = " + text);
        System.out.println("  list = " + list);
        System.out.println("  array = " + java.util.Arrays.toString(array));
        System.out.println("  account = " + account);

        // 4 примера, где var НЕ РАБОТАЕТ
        System.out.println("\n------------------------------------------------------------");
        System.out.println("\n4 ПРИМЕРА, ГДЕ var НЕ КОМПИЛИРУЕТСЯ:\n");

        System.out.println("1. var без инициализации:");
        System.out.println("   var x;");
        System.out.println("   x = 10;");
        System.out.println("   Ошибка: \"Cannot infer type: variable initializer is required\"");
        System.out.println("   Причина: var требует немедленной инициализации\n");

        System.out.println("2. var как параметр метода:");
        System.out.println("   public void method(var param) { }");
        System.out.println("   Ошибка: \"'var' is not allowed as a parameter type\"");
        System.out.println("   Причина: var можно использовать только для локальных переменных\n");

        System.out.println("3. var как поле класса:");
        System.out.println("   public class MyClass {");
        System.out.println("       var field = \"text\";");
        System.out.println("   }");
        System.out.println("   Ошибка: \"'var' is not allowed in a field declaration\"");
        System.out.println("   Причина: поля класса должны иметь явный тип\n");

        System.out.println("4. var c null:");
        System.out.println("   var obj = null;");
        System.out.println("   Ошибка: \"Cannot infer type: variable initializer is 'null'\"");
        System.out.println("   Причина: null может относиться к любому типу,");
        System.out.println("            компилятор не может определить конкретный тип\n");

        System.out.println("------------------------------------------------------------");
        System.out.println("\nИТОГИ:");
        System.out.println("  - var работает только с локальными переменными");
        System.out.println("  - var требует немедленной инициализации");
        System.out.println("  - Тип определяется на этапе компиляции (не во время выполнения)");
        System.out.println("  - Не работает: поля класса, параметры методов, без инициализации, null");
    }

    private static String getTypeName(Object obj) {
        if (obj == null) {
            return "null";
        }
        if (obj.getClass().isArray()) {
            return obj.getClass().getComponentType().getSimpleName() + "[]";
        }
        return obj.getClass().getSimpleName();
    }
}