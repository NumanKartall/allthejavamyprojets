import java.util.Scanner;

public class etkinlikOnerme {
    public static void main(String[] args) {

        Scanner ınput = new Scanner(System.in);

        int sıcaklık;

        System.out.println("**ETKINLIK ONERME**");

        System.out.println("HAVA SICAKLIGINI GIRINIZ: ");
        sıcaklık = ınput.nextInt();

        if (sıcaklık <= 5) {
            System.out.println("BUGUN HAVA SOGUK VE KARLI **KAYAK** YAPABILIRSINIZ.");
        } else if (sıcaklık > 5 && sıcaklık <= 15) {
            System.out.println("BUGUN HAVA NORMAL VE BIRAZ SOGUK **SINEMAYA** GIDEBILIRSINIZ.");
        } else if (sıcaklık > 15 && sıcaklık <= 25) {
            System.out.println("PIKINIGE GIDEBILIRSINIZ");
        } else {
            System.out.println("YUZMEYE GIDEBILIRSINIZ");
        }
    }
}