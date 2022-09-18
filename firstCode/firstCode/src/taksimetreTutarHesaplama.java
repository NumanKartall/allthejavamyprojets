import  java.util.Scanner;
public class taksimetreTutarHesaplama {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        double fiyat =2.20;
        int km, acilis=10, yirmiTlAlti=20;

        System.out.println("gidilen yol kilometre cinsinden: ");
        km=scan.nextInt();

        double ucret=(fiyat*km)+acilis;
        if (ucret<20){
            System.out.println("alincacak tutar"+yirmiTlAlti+"TL");
        }else {
            System.out.println("alinacak tutar: "+ucret +"TL");
        }
    }
}