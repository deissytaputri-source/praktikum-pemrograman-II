package Modul01.Problem05;

import java.util.Scanner;

public class PRAK105_2510817320010_PutriDeissytaHerliyana {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        final double PI = 3.14;

        System.out.print("Masukkan jari-jari: ");
        double radius = scan.nextDouble();

        System.out.print("Masukkan tinggi: ");
        double height = scan.nextDouble();

        double cylinderVolume = PI * radius * radius * height;

        System.out.printf("Volume tabung dengan jari-jari %.1f cm dan tinggi %.1f cm adalah %.3f m3%n",
                radius, height, cylinderVolume);

        scan.close();
    }
}