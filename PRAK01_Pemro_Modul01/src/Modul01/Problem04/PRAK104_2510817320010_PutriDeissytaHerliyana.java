package Modul01.Problem04;

import java.util.Scanner;

public class PRAK104_2510817320010_PutriDeissytaHerliyana {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Tangan Abu: ");
        String abu1 = scan.next();
        String abu2 = scan.next();
        String abu3 = scan.next();

        System.out.print("Tangan Bagas: ");
        String bagas1 = scan.next();
        String bagas2 = scan.next();
        String bagas3 = scan.next();

        int abuScore = 0;
        int bagasScore = 0;

        //round1
        int result1 = determineWinner(abu1, bagas1);
        if (result1 == 1) {
            abuScore++;
        } else if (result1 == -1) {
            bagasScore++;
        }

        //2
        int result2 = determineWinner(abu2, bagas2);
        if (result2 == 1) {
            abuScore++;
        } else if (result2 == -1) {
            bagasScore++;
        }

        //3
        int result3 = determineWinner(abu3, bagas3);
        if (result3 == 1) {
            abuScore++;
        } else if (result3 == -1) {
            bagasScore++;
        }

        if (abuScore > bagasScore) {
            System.out.println("Abu");
        } else if (bagasScore > abuScore) {
            System.out.println("Bagas");
        } else {
            System.out.println("Seri");
        }

        scan.close();
    }

    //returns 1 if Abu wins, -1 if Bagas wins, 0 if draw
    public static int determineWinner(String abuHand, String bagasHand) {
        if (abuHand.equals(bagasHand)) {
            return 0;
        }
        if (abuHand.equals("B") && bagasHand.equals("G")) return 1;
        if (abuHand.equals("G") && bagasHand.equals("K")) return 1;
        if (abuHand.equals("K") && bagasHand.equals("B")) return 1;

        return -1;
    }
}