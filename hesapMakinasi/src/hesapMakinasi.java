import java.util.Scanner;

public class hesapMakinasi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("**HESAP MAKINASI**");

        System.out.println("**1.TOPLAMA**");
        System.out.println("**2.CIKARMA**");
        System.out.println("**3.CARPMA**");
        System.out.println("**4.BOLME**");
        System.out.println("LUTFEN YAPACAGINIZ ISLEMI SECIN");
        int secim = scan.nextInt();

        System.out.println("1nci sayiyi girin:");
        int sayi1 = scan.nextInt();

        System.out.println("2nci sayiyi girin:");
        int sayi2 = scan.nextInt();

        switch (secim) {
            case 1:
                System.out.println("TOPLAMA ISLEMININ SONUCU: " + (sayi1 + sayi2));
                break;
            case 2:
                System.out.println("CIKARMA ISLEMININ SONUCU: " + (sayi1 - sayi2));
                break;
            case 3:
                System.out.println("CARPMA ISLEMININ SONUCU: " + (sayi1 * sayi2));
                break;
            case 4:
                if (sayi2 == 0) {
                    System.out.println("BIR SAYI SIFIRA BOLUNEMEZ ");
                } else if (sayi1 == 0) {
                    System.out.println("BOLME ISLEMININ SONUCU:" + (sayi1 / sayi2) + "\nhangi sayi olursa olsun sifira bolumu 0 dir ");
                } else {
                    System.out.println("BOLME ISLEMININ SONUCU: " + (sayi1 / sayi2));
                }
                break;
            default:
                System.out.println("!!YANLIS SECIM!!");
        }

    }
}
