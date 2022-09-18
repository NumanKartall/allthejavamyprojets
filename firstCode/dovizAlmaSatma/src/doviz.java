import java.util.Scanner;

public class doviz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double dolar_tl = 17.9, euro_tl = 18.4, sterlin_tl = 20.7, ceyrek_altın = 983;

        System.out.println("**DOVIZ VE ALTIN BOZDURMA**");
        System.out.println("1.DOLAR/TL");
        System.out.println("2.EURO/TL");
        System.out.println("3.STERLIN/TL");
        System.out.println("4.CEYREK ALTIN");
        System.out.println("**LUTFEN ISLEM YAPACAGINIZ DOVIZ YA DA MADENI YAPIYI SECIN**");
        int secim = scan.nextInt();

        System.out.println("1.DOVIZ ALICAM");
        System.out.println("2.DOVIZ BOZDURUCAM");
        System.out.println("3.ALTIN ALICAM");
        System.out.println("4.ALTIN BOZDURUCAM");
        System.out.println("HANGI ISLEMI YAPACAKSINIZ ?");
        int secim2 = scan.nextInt();

        if (secim == 1 && secim2 == 1) {
            System.out.println("LUTFEN ALACAGINIZ DOVIZ ICIN TL GIRIN");
            int dovızal = scan.nextInt();
            System.out.println("ALACAGINIZ TUTAR: " + (dovızal / dolar_tl) + "$");
        } else if (secim == 1 && secim2 == 2) {
            System.out.println("LUTFEN BOZDURACAGINIZ DOVIZI GIRIN");
            int dovızbozdur = scan.nextInt();
            System.out.println("ALCAGINIZ TUTAR:" + (dovızbozdur * dolar_tl) + "?");


        } else if (secim == 2 && secim2 == 1) {
            System.out.println("LUTFEN ALACAGINIZ DOVIZ ICIN TL GIRIN");
            int dovızal = scan.nextInt();
            System.out.println("ALACAGINIZ TUTAR: " + (dovızal / euro_tl) + "€");
        } else if (secim == 2 && secim2 == 2) {
            System.out.println("LUTFEN BOZDURACAGINIZ DOVIZI GIRIN");
            int dovızbozdur = scan.nextInt();
            System.out.println("ALCAGINIZ TUTAR:" + (dovızbozdur * euro_tl) + "?");
        } else if (secim == 3 && secim2 == 1) {
            System.out.println("LUTFEN ALACAGINIZ DOVIZ ICIN TL GIRIN");
            int dovızal = scan.nextInt();
            System.out.println("ALACAGINIZ TUTAR: " + (dovızal / sterlin_tl) + "£");
        } else if (secim == 3 && secim2 == 2) {
            System.out.println("LUTFEN BOZDURACAGINIZ DOVIZI GIRIN");
            int dovızbozdur = scan.nextInt();
            System.out.println("ALCAGINIZ TUTAR:" + (dovızbozdur * sterlin_tl) + "?");


        } else if (secim == 4 && secim2 == 3) {
            System.out.println("LUTFEN ALACAGINIZ ALTIN ICIN TL GIRIN");
            int altınal = scan.nextInt();
            System.out.println("ALACAGINIZ ALTIN MIKTARI GR CINSINDEN: " + (altınal / ceyrek_altın) + "gr");
        } else if (secim == 4 && secim2 == 4) {
            System.out.println("LUTFEN BOZDURACAGINIZ CEYREK ALTIN MİKTARINI GIRIN");
            int altınbozdur = scan.nextInt();
            System.out.println("ALCAGINIZ TUTAR:" + (altınbozdur * ceyrek_altın) + "?");
        }
        if (secim == 5 && secim2 == 5) {
            System.out.println("GECERSIZ DURUM !!ISLEMINIZ IPTAL!!");
        }
    }
}