import javax.swing.*;
import java.util.Scanner;

public class alistirmalar {
    public static void main(String[] args) {

        /*while (isPasswordSucsess) {
            System.out.println("kartal bankaya hosgeldiniz");
            System.out.print("sifrenizi giriniz: ");
            Password = input.nextInt();
            if (Password == 123) {
                System.out.println("sifre dogru");
                isPasswordSucsess = false;
            } else {
                System.out.println("sifre hatali");
            }
        }

        for (boolean run = true; run; ) {
            System.out.println("bir sayi giriniz");
            sayi = input.nextInt();
            if (sayi < 0) {
                run = false;
            }
        }
        System.out.println("bir sayi giriniz");
        sayi=input.nextInt();
        while (sayi > 0) {
            System.out.println("bir sayi giriniz:");
            sayi = input.nextInt();
        }

        System.out.println("bir sayi giriniz");
        sayi=input.nextInt();

        if (sayi>0)
        for (int i=1;i<sayi;i++){
            if ((i%3==0)&&(i%4==0)){
                toplam+=i;
                adet++;
            }
        }
        ortalama=toplam/adet;
        System.out.println("ortalaması:"+ortalama);

        if (sayi<=11){
            System.out.println("girilen sayi 3 ve 4un katlari degil");
        }else {
            System.out.println("3 ve 4 e tam bolunen sayiların toplami: "+toplam);
        }
        System.out.println("bir sayi giriniz");
        sayi=input.nextInt();
        while (sayi%2==0){
            System.out.println("bir sayi giriniz:");
            sayi= input.nextInt();
            if((sayi%2==0)&&(sayi%4==0)){
                toplam+=sayi;
            }
        }System.out.println("cift ve 4un katlari olan sayilarin toplami:"+toplam);


        System.out.println("bir sayi giriniz");
        sayi = input.nextInt();
        for (int i = 1; i < sayi; i *= 4) {
            System.out.println(i);
        }
        System.out.println("------------");
        for (int i = 1; i < sayi; i *= 5) {
            System.out.println(i);
        }

        System.out.println("faktoriyel sayisini giiniz:");
        sayi = input.nextInt();
        for (int i = 1; i <= sayi; i++) {
            toplam = toplam * i;
        }
        System.out.println("faktoriyel toplami:" + toplam);

        if (sayi <= 0) {
            System.out.println("negatif sayi girilemez:" + toplam);
        }

        System.out.println("ussu alinacak sayiyi giriniz.");
        sayi1 = input.nextInt();

        System.out.println("us alinacak sayiyi giriniz");
        sayi2 = input.nextInt();

        for (int i=1;i<=sayi2;i++){
            total*=sayi1;
        }
        System.out.println(total);

        //--------------------------------------------------------------------//

        //AMSTRONG---SAYILAR//

        Scanner input = new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int sayi1 = input.nextInt();
        int numberCounter = 0;
        int gecici = sayi1;
        int rakam = 1;
        int toplam = 0;

        if (sayi1 < 999) {

            while (gecici != 0) {
                gecici /= 10;
                numberCounter++;
            }
            while (sayi1 > 0) {
                rakam = sayi1 % 10;
                toplam += Math.pow(rakam, numberCounter);
                sayi1 /= 10;
            }
            System.out.println(toplam);

        } else {
            System.out.println("999 dan yuksek bir sayi girdiniz.");
        }


        Scanner input=new Scanner(System.in);

        int sayi;
        double result=0.0;


        System.out.println("bir sayi giriniz");
        sayi=input.nextInt();

        for (int i=1;i<=sayi;i++){
            result+=(1.0/i);
        }
        System.out.println("cevap:"+result);

        Scanner input = new Scanner(System.in);
        int sayi;

        System.out.println("bir sayi giriniz.");
        sayi = input.nextInt();

        for (int i = 0; i <= sayi; i++) {
            for (int j = 0; j <= (sayi - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        String userName, password;
        Scanner input = new Scanner(System.in);
        int hak = 3;
        int balance = 1500;
        int select;

        while (hak > 0) {
            System.out.println("Kullanici Adinizi Giriniz:");
            userName = input.nextLine();

            System.out.println("Sifrenizi Giriniz");
            password = input.nextLine();

            if (userName.equals("numan") && password.equals("123qwe")) {
                System.out.println("GIRIS BASATILI");

                do {
                    System.out.println("LUTFEN YAPMAK ISTEDIGINIZ ISLEMI SECIN");
                    System.out.println("1.Para Yatırma\n" + "2.Para Cekme\n" + "3.Bakiye Sorgulama\n" + "4.Cikis Yap");
                    select=input.nextInt();


                    if (select == 1) {
                        System.out.print("Lutfen yatirmak istediginiz miktari yaziniz:");
                        int price = input.nextInt();
                        balance += price;

                    } else if (select == 2) {
                        System.out.print("Lutfen cekmek istediginiz miktari yaziniz:");
                        int price = input.nextInt();
                        balance -= price;

                    } else if (select == 3) {
                        System.out.println("bakiyeniz:" +balance);
                    }

                } while (select != 4);
                System.out.println("Tekrar görusmek uzere.İyi gunler..");
                break;

            } else {
                System.out.println("GIRIS BASARISIZ\n");

                System.out.println("KALAN HAKKINIZ: " + hak--);
            }
            if (hak == 0) {
                System.out.println("HESABINIZ BLOKE OLMUSTUR LUTFEN BANKA ILE ILETISIME GECIN");
            }
        }
        Scanner input=new Scanner(System.in);

        int sayi1;
        int sayi2;
        int ebob=1;
        int ekok=1;

        System.out.println("birinci sayiyi giriniz:");
        sayi1=input.nextInt();

        System.out.println("ikinci sayiyi giriniz:");
        sayi2=input.nextInt();

        for (int i=1;i<sayi1;i++){
            if (sayi1%i==0 && sayi2%i==0){
                ebob=i;
            }
            ekok=(sayi1*sayi2)/ebob;
        }
        System.out.println("En buyuk ortak bolen: "+ebob);
        System.out.println("En kucuk ortak kat: "+ekok);

        Scanner input=new Scanner(System.in);


        for (int i = 100; i > 1; i--) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
        System.out.println("------------");

        for (int k = 0; k <= 100; k++) {
            if (k % 3 == 0 && k % 7 == 0) {
                System.out.println(k);
            }
        }
        System.out.println("**************");
        for (int l=1; l<=257;l*=3){
            System.out.println(l);
        }

        System.out.println("bir sayi girin");
        int sayi=input.nextInt();

        for (int i=0;i<=sayi;i++){
            for (int j=0;j<=(2*i+1);j++){
                System.out.print(" ");
            }for (int k=1;k<sayi;k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

        Scanner input =new Scanner(System.in);
        int sayi=1;
        System.out.println("bir sayi giriniz");
        while (sayi!=0){
            sayi=input.nextInt();

            if (((sayi % 4 == 0) && (sayi % 100 != 0)) || (sayi % 400 == 0)) {
                System.out.println(sayi + " sayisi artik yildir");
                System.out.println("baska sayi giriniz:");
            } else {
                System.out.println(sayi + " sayisi artik yil degildir");
                System.out.println("baska sayi giriniz:");
            }
        }  System.out.println(sayi+" sayisini girdiniz program kapandi");


        Scanner input = new Scanner(System.in);

        int sayi;
        System.out.print("ortalamanizi giriniz:");
        sayi = input.nextInt();

        while (sayi > 100) {
            if (sayi > 100) {
                System.out.println("GECERSIZ NOT GIRDINIZ TEKRAR DENEYINIZ !");
                System.out.print("ortalamanizi giriniz: ");
                sayi = input.nextInt();
            }
            if (sayi < 50) {
                System.out.println("notunuz: " + sayi + "FF ILE KALDINIZ..BASARISIZ !");
            } else if (50 <= sayi && 60 > sayi) {
                System.out.println("notunuz: " + sayi + " DD ILE GECTINIZ");
            } else if (60 <= sayi && 70 > sayi) {
                System.out.println("notunuz: " + sayi + " CD ILE GECTINIZ");
            } else if (70 <= sayi && 80 > sayi) {
                System.out.println("notunuz: " + sayi + " BC ILE GECTINIZ");
            } else if (80 <= sayi && 90 > sayi) {
                System.out.println("notunuz: " + sayi + " AB ILE GECTINIZ");
            } else if (90 <= sayi && 100 >= sayi) {
                System.out.println("notunuz: " + sayi + " AA ILE GECTINIZ");
            }
        }

        Scanner input = new Scanner(System.in);

        int sayi=6;
        int term=6;

        for (int i = 0; i <=sayi; i++) {
            System.out.print(" ");
            for (int j = 0; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (int i = 0; i <=term; i++) {
            System.out.print(" ");
            for (int j = term; i<=j; j--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        int dizi[] = {23, 45, 14, 56, 32, 61, 73};

        for (int i : dizi) {
            System.out.print("\n" + i);
        }
        System.out.println(" ");
        System.out.println("***************");
        int i = 0;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }

        System.out.println(" ");

        int j=16;
        do {
            System.out.println(j);
            j++;
        }while (j <=15);

--------------------------------------------------------------------------------------------------------
        Scanner input =new Scanner(System.in);

        int mat,turk,fizik,kimya,tarih,muzik;
        double ortalama;
        String gectimi;
        System.out.println("***GENEL ORTALAMA HESAPLAMA***");

        System.out.println("MATEMATIK NOTUNUZU GIRINIZ");
        mat=input.nextInt();

        System.out.println("TURKCE NOTUNUZU GIRINIZ");
        turk=input.nextInt();

        System.out.println("FIZIK NOTUNUZU GIRINIZ");
        fizik=input.nextInt();

        System.out.println("KIMYA NOTUNUZU GIRINIZ");
        kimya=input.nextInt();

        System.out.println("TARIH NOTUNUZU GIRINIZ");
        tarih=input.nextInt();

        System.out.println("MUZIK NOTUNUZU GIRINIZ");
        muzik=input.nextInt();

        ortalama=(mat+turk+fizik+kimya+tarih+muzik)/6;

        gectimi=(ortalama>=60) ? "GECTINIZ":"KALDINIZ";

        System.out.println("GENEL ORTALAMANIZ: "+ortalama+ "\n" +gectimi);

        Scanner input =new Scanner(System.in);

        double tutar,kdvlifiyat,kdvtutar;
        boolean kdvDurumu;

        System.out.print("Tutari giriniz: ");
        tutar=input.nextInt();

        System.out.println("KDV'siz fiyat: "+tutar);

        kdvDurumu=(tutar>0)&&(tutar<1000);
        double kdvoran= kdvDurumu ? 0.18d : 0.08d;

        kdvtutar=tutar*kdvoran;
        System.out.println("KDV orani: "+kdvtutar);

        kdvlifiyat=tutar+kdvtutar;
        System.out.println("KDV'li fiyat: "+kdvlifiyat);

-----------------------------------------------------------------------------------------------------------
        Scanner input =new Scanner(System.in);

        int a,b,c;
        double uzunluk,cevre,alan;

        System.out.println("*UCGEN CEVRE VE ALAN HESAPLAMA*");

        System.out.print("A uzunlugunu giriniz:");
        a=input.nextInt();

        System.out.print("B uzunlugunu giriniz:");
        b=input.nextInt();

        System.out.print("C uzunlugunu giriniz:");
        c=input.nextInt();

        uzunluk=(a+b+c)/2;
        cevre=uzunluk*2;
        System.out.println("Ucgenin cevresi: "+cevre);

        alan=uzunluk*(uzunluk-a)*(uzunluk-b)*(uzunluk-c);
        System.out.println("Ucgenin alani: "+alan);

-------------------------------------------------------------------------------------------------------------
        Scanner input = new Scanner(System.in);

        int min = 20;
        double kmfiyat = 2.20, toplam, km, acilis = 10;

        System.out.print("KM GIRINIZ: ");
        km = input.nextInt();

        toplam = km * kmfiyat + acilis;
        if (toplam < 20) {
            System.out.println("TOPLAM TUTAR: " + min + " tl");
        } else {
            System.out.println("TOPLAM TUTAR: " + toplam + " tl");
        }

-------------------------------------------------------------------------------------------------------------
        Scanner input = new Scanner(System.in);

        double yaricap,PI=3.14,cevre,alan,mao,daireDilimiAlani;

        System.out.println("**DAIRE ALAN VE CEVRE HESAPLAMA");

        System.out.print("Yaricap giriniz:");
        yaricap=input.nextInt();

        System.out.println("Aci giriniz:");
        mao=input.nextInt();

        daireDilimiAlani=(PI*(yaricap*yaricap)*mao)/360;
        cevre=2*PI*yaricap;
        alan=PI*yaricap*yaricap;

        System.out.println("Dairenin alani: "+alan);
        System.out.println("Dairenin cevresi: "+cevre);
        System.out.println("Daire diliminin alani: "+daireDilimiAlani);

        -------------------------------------------------------------------------------------------------

        Scanner input = new Scanner(System.in);

        int sayi;

        System.out.println("bir sayi giriniz");
        sayi = input.nextInt();

        for (int i = 1; i <=sayi; i++) {
            for (int k = 1; k <=(sayi-i) ; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=(2*i-1) ; j++) {
                System.out.print("*");
            }
            System.out.println(" ");

        }
        for (int i = sayi-1; i >0 ; i--) {
            for (int k = sayi-i; k >0 ; k--) {
                System.out.print(" ");
            }
            for (int j = (2*i)-1; j >0 ; j--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        -------------------------------------------------------------------------------------------------


        Scanner input = new Scanner(System.in);

        String username, password;
        int right = 3, balance = 2000;
        int select;
        while (right > 0) {
            System.out.println("**KARTAL ATM YE HOSGELDINIZ**");

            System.out.print("Lutfen kullanici adinizi giriniz: ");
            username = input.nextLine();

            System.out.print("Lutfen sifrenizi giriniz:");
            password = input.nextLine();

            if (username.equals("Numan") && password.equals("123qwe")) {
                System.out.println("GIRIS BASARILI..");

                do {

                    System.out.println("LUTFEN YAPMAK ISTEDIGINIZ ISLEMI SECIN:");
                    System.out.println("1.Para Cekme\n" + "2.Para Yatirma\n" + "3.Bakiye Sorgulama\n" + "4.Cikis Yap\n");
                    select = input.nextInt();

                    if (select == 1) {
                        System.out.print("Lutfen cekeceginiz para miktarini yazin: ");
                        int price = input.nextInt();
                        if (price > balance) {
                            System.out.println("Cekeceginiz para hesabinizda ki paradan daha fazla islem basarisiz");
                        } else {
                            balance -= price;
                        }
                    } else if (select == 2) {
                        System.out.println("Lutfen yatiracaginiz para miktarini yazin");
                        int price = input.nextInt();
                        balance += price;
                    } else if (select == 3) {
                        System.out.println("Hesabinizdaki Tutar:" + balance+" TL");
                    } else if (select == 4) {
                        System.out.println("Iyi gunler yine bekleriz...");
                    }

                } while (select != 4);
                break;

            } else {
                right--;
                System.out.println("GIRIS BASARISIZ");
                if (right == 0) {
                    System.out.println("!!HESABINIZ BLOKE OLMUSTUR!!");
                } else {
                    System.out.println("Kalan hakkiniz: " + right);
                }
            }
        }
    }
}*/
