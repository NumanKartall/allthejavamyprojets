import java.util.Scanner;

public class sayilarinToplami {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sayi,total=0,basamakdegeri;

        System.out.println("bir sayi giriniz");
        sayi=scan.nextInt();

        do {
            basamakdegeri=sayi%10;
            sayi=sayi/10;
            System.out.println(basamakdegeri);
            if (sayi!=0){
                System.out.println("+");
            }
            total+=basamakdegeri;
        }while (sayi !=0);

        System.out.println(total);
    }

}
