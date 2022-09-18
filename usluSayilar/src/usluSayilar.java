import java.util.Scanner;

public class usluSayilar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sayi1, sayi2;
        int toplam = 1;
        System.out.println("ussu alinacak sayi:");
        sayi1 = scan.nextInt();

        System.out.println("us alinacak sayi");
        sayi2 = scan.nextInt();
        for (int i = 1; i <= sayi2; i++) {
            toplam *= sayi1;

        }
        System.out.println(toplam);
    }
}
