package Wyjatki;

import java.util.Scanner;

public class Wyjatki2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int intScaner = 0;
        int [] array = new int[4];
        try {
            for (int i = 0; i < 5; i++) {
                array[i] = intScaner;
                intScaner = scanner.nextInt();
                System.out.println(array[i]);

            }
        } catch (Exception e) {
            System.out.println("nie można wypisywać dalej");
        }finally {
            System.out.println("koniec");
        }
    }
}
