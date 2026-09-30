package Modul01.Problem03;

import java.util.Scanner;

public class PRAK103_2510817320010_PutriDeissytaHerliyana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan N: ");
        int n = input.nextInt();
        System.out.print("Masukkan bilangan awal: ");
        int startNumber = input.nextInt();

        int counter = 0;

        do {
            if (startNumber % 2 != 0) {
                System.out.print(startNumber);
                counter++;
                if (counter < n) {
                    System.out.print(", ");
                }
            }
            startNumber++;
        } while (counter < n);

        input.close();
    }
}