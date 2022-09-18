import java.util.Scanner;
public class vucutKitleEndeksi {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double boy;
        int kilo;

        System.out.println("boyunuzu giriniz:");
        boy=scan.nextDouble();
        System.out.println("kilonuzu giriniz");
        kilo=scan.nextInt();

        double vucutKitleEndeksi=(kilo/(boy*boy));
        System.out.println("Vucut kitle endeksiniz: "+vucutKitleEndeksi);

    }
}
