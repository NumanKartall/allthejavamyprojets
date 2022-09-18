import java.util.Scanner;
public class manavKasaProgramı {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        double Elma=3.67, Armut=2.14, Domates=1.11, Muz=0.95, Patlıcan=5.00;
        int kilo;

        System.out.println("ELMA KAC KILO: ");
        kilo=scan.nextInt();
        double a=Elma*kilo;

        System.out.println("ARMUT KAC KILO: ");
        kilo=scan.nextInt();
        double b=Armut*kilo;
        System.out.println("DOMATES KAC KILO: ");
        kilo=scan.nextInt();
        double c=Domates*kilo;
        System.out.println("MUZ KAC KILO: ");
        kilo=scan.nextInt();
        double d=Muz*kilo;
        System.out.println("PATLICAN KAC KILO: ");
        kilo=scan.nextInt();
        double e=Patlıcan*kilo;
        System.out.println("Toplam tutar: "+(a+b+c+d+e)+" TL");

    }
}
