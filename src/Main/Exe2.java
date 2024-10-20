package Main;

import java.util.Scanner;

public class Exe2 {
    public Exe2() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первую строку (a): ");
        String a = scanner.nextLine();
        System.out.print("Введите вторую строку (b): ");
        String b = scanner.nextLine();
        if (a.equals(b)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }

        scanner.close();
    }
}