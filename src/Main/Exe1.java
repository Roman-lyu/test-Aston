package Main;

import java.util.Scanner;

public class Exe1 {
    public Exe1() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое целое число (a): ");
        int a = scanner.nextInt();
        System.out.print("Введите второе целое число (b): ");
        int b = scanner.nextInt();
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + a * b);
        // Деление с обработкой исключений
        try {
            System.out.println("Деление: " + (a / b));
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: Деление на ноль");
        }

        scanner.close();
    }
}

