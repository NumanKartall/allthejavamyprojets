import java.util.Scanner;
public class ucakBiletiHesaplama {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int yas, km, yolculuktipi;
        double msbucret = 0.10;
        double normaltutar;

        System.out.println("***UCAK BILET FIYATI HESAPLAMA***");
        System.out.println("mesafeyi km cinsinden giriniz");
        km = input.nextInt();

        System.out.println("yasinizi giriniz");
        yas = input.nextInt();

        System.out.println("yolculuk tipini giriniz:1-Tek YOn, 2-Gidis Donus");
        yolculuktipi = input.nextInt();

        normaltutar = km * msbucret;
        if (yas < 12 && yas >= 1 && yolculuktipi == 1) {
            System.out.println("Toplam Indirimli Tutar:" + (normaltutar * 0.50));

        } else if (yas > 12 && yas <= 24 && yolculuktipi == 1) {
            System.out.println("Toplam Indirimli Tutar:" + (normaltutar * 0.90));

        } else if (yas > 24 && yas < 65 && yolculuktipi == 1) {
            System.out.println("Toplam Indirimli Tutar:" + normaltutar);

        } else if (yas >= 65 && yas <= 100 && yolculuktipi == 1) {
            System.out.println("Toplam Indirimli Tutar:" + (normaltutar * 0.70));

        } else if (yas < 12 && yas >= 1 && yolculuktipi == 2) {
            System.out.println("Toplam Indirimli Tutar:" + ((normaltutar * 0.50) * 2) * 0.80);

        } else if (yas > 24 && yas < 65 && yolculuktipi == 2) {
            System.out.println("Toplam Tutar:" + (normaltutar*0.80*2));

        } else if (yas > 12 && yas <= 24 && yolculuktipi == 2) {
            System.out.println("Toplam Indirimli Tutar:" + ((normaltutar * 0.90) * 2) * 0.80);

        } else if (yas >= 65 && yas <= 100 && yolculuktipi == 2) {
            System.out.println("Toplam Indirimli Tutar:" + ((normaltutar * 0.70) * 2) * 0.80);

        } else {
            System.out.println("hatali ya da yanlis secim!!");
        }
    }
}