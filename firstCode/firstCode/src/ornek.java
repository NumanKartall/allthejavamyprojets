import java.util.Scanner;
public class ornek {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("**HESAP MAKİNASINA HOSGELDINIZ**");

        System.out.println("1.TOPLAMA");
        System.out.println("2.CIKARMA");
        System.out.println("3.CARPMA");
        System.out.println("4.BOLME");
        System.out.println("5.YUZDE ALMA");
        System.out.println("LUTFEN YAPACAGINIZ ISLEMI SECIN");
        int secim = scan.nextInt();

        System.out.println("1. SAYIYI GIRINIZ:");
        int sayı1 = scan.nextInt();

        System.out.println("2. SAYIYI GIRINIZ:");
        int sayi2 = scan.nextInt();

        if (secim == 1) {
            System.out.println("Toplama isleminin sonucu: " + (sayı1 + sayi2));
        } else if (secim == 2) {
            System.out.println("Cikarma isleminin sonucu: " + (sayı1 - sayi2));
        } else if (secim == 3) {
            System.out.println("Carpma isleminin sonucu: " + (sayı1 * sayi2));
        } else if (secim == 4) {
            System.out.println("Bolme isleminin sonucu: " + (sayı1 / sayi2));
        } else if (secim == 5) {
            System.out.println("Yuzde alma isleminin sonucu: " + (sayı1 * sayi2 / 100));
            }else{
            System.out.println("YANLIS ISLEM SECIMI!!!");
        }
    }
}