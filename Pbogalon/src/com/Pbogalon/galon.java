package com.Pbogalon;
import java.util.Scanner;

public class galon {
    public static void main(String[] args) {
        double galon;
        double total;
        try (Scanner scan = new Scanner(System.in)) {

            System.out.println("Konversi Galon ke Liter");
            System.out.println("\nMasukan Jumlah Galon :");
            galon = scan.nextDouble();
        }
        total = galon * 3.785;
        System.out.println("\nTOTAL ke Liter");
        System.out.printf("%.0f Galon = %.3f Liter \n\n ", galon, total);
    }

}


