import java.util.Scanner;

public class demo2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sayi, kuvvet = 0, kuvvet2 = 0;

        System.out.println("bir sayi giriniz:");
        sayi = scan.nextInt();

        for (int i = 1; i < sayi; i *= 4) {
            System.out.println("4'un " + kuvvet + "nci kuvveti: " + i);
            kuvvet++;
        }
        System.out.println("------------------");
        for (int i = 1; i < sayi; i *= 5) {
            System.out.println("5'in " + kuvvet2 + "nci kuvveti: " + i);
            kuvvet2++;
        }
    }
}