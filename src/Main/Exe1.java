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
        if (b != 0) {
            System.out.println("a / b = " + (double)a / (double)b);
        } else {
            System.out.println("Деление на ноль невозможно.");
        }

        if (a != 0) {
            System.out.println("b / a = " + (double)b / (double)a);
        } else {
            System.out.println("Деление на ноль невозможно.");
        }

        scanner.close();
    }
}

