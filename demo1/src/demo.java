import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sayi, toplam = 0, adet = 0;
        double ortalama;

        System.out.println("sayi giriniz");
        sayi = scan.nextInt();

        for (int i = 0; i <= sayi; i++) {
            if ((i % 3 == 0) && (i % 4 == 0)) {
                toplam += i;
                adet++;
            }
        }
        System.out.println("sonuc;" + toplam);
        ortalama = toplam / (adet - 1);

        System.out.println("tum sayilarin ortalamasi:" + ortalama);
    }
}
