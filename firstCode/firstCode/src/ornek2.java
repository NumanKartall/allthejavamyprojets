import java.util.Scanner;
public class ornek2 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        double dolar_tl=17.9,euro_tl=18.4,sterlin_tl=20.7,ceyrek_alt�n=983;

        System.out.println("**DOVIZ VE ALTIN BOZDURMA**");
        System.out.println("1.DOLAR/TL");
        System.out.println("2.EURO/TL");
        System.out.println("3.STERLIN/TL");
        System.out.println("4.CEYREK ALTIN");
        System.out.println("**LUTFEN ISLEM YAPACAGINIZ DOVIZ YA DA MADENI YAPIYI SECIN**");
        int secim=scan.nextInt();
        
        System.out.println("1.DOVIZ ALICAM");
        System.out.println("2.DOVIZ BOZDURUCAM");
        System.out.println("3.ALTIN ALICAM");
        System.out.println("4.ALTIN BOZDURUCAM");
        System.out.println("HANGI ISLEMI YAPACAKSINIZ ?");
        int secim2=scan.nextInt();

        if (secim==1 && secim2==1){
            System.out.println("LUTFEN ALACAGINIZ DOVIZ ICIN TL GIRIN");
            int dov�zal=scan.nextInt();
            System.out.println("ALACAGINIZ TUTAR: "+(dov�zal/dolar_tl)+"$");
        }if (secim==1 && secim2==2) {
            System.out.println("LUTFEN BOZDURACAGINIZ DOVIZI GIRIN");
            int dov�zbozdur=scan.nextInt();
            System.out.println("ALCAGINIZ TUTAR:"+(dov�zbozdur*dolar_tl)+"?");


        }if (secim==2 && secim2==1){
            System.out.println("LUTFEN ALACAGINIZ DOVIZ ICIN TL GIRIN");
            int dov�zal=scan.nextInt();
            System.out.println("ALACAGINIZ TUTAR: "+(dov�zal/euro_tl)+"�");
        }if (secim==2 && secim2==2) {
            System.out.println("LUTFEN BOZDURACAGINIZ DOVIZI GIRIN");
            int dov�zbozdur=scan.nextInt();
            System.out.println("ALCAGINIZ TUTAR:"+(dov�zbozdur*euro_tl)+"?");
        }


        if (secim==3 && secim2==1){
            System.out.println("LUTFEN ALACAGINIZ DOVIZ ICIN TL GIRIN");
            int dov�zal=scan.nextInt();
            System.out.println("ALACAGINIZ TUTAR: "+(dov�zal/sterlin_tl)+"�");
        }if (secim==3 && secim2==2) {
            System.out.println("LUTFEN BOZDURACAGINIZ DOVIZI GIRIN");
            int dov�zbozdur=scan.nextInt();
            System.out.println("ALCAGINIZ TUTAR:"+(dov�zbozdur*sterlin_tl)+"?");


        }if (secim==4 && secim2==3){
            System.out.println("LUTFEN ALACAGINIZ ALTIN ICIN TL GIRIN");
            int alt�nal=scan.nextInt();
            System.out.println("ALACAGINIZ ALTIN MIKTARI GR CINSINDEN: "+(alt�nal/ceyrek_alt�n)+"gr");
        }else{
        System.out.println("YANLIS SECIM YAPTINIZ !!ISLEMINIZ IPTAL!!");
        }if (secim==4 && secim2==4) {
            System.out.println("LUTFEN BOZDURACAGINIZ CEYREK ALTIN M�KTARINI GIRIN");
            int alt�nbozdur = scan.nextInt();
            System.out.println("ALCAGINIZ TUTAR:" + (alt�nbozdur * ceyrek_alt�n) + "?");
        }
    }
}