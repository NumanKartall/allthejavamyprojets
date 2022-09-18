import java.util.Scanner;

public class artikYil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("***ARTIK YIL BULMA***");

        int yil;
        System.out.println("HERHANGI BIR YIL GIRINIZ:");
        yil = input.nextInt();

        if (yil % 4 == 0) {
            if (yil % 100 == 0) {
                if (yil % 400 == 0) {
                    System.out.println(yil + " ARTIK YILDIR");
                }else {
                    System.out.println(yil + " ARTIK YIL DEGILDIR");
                }
            }else {
                System.out.println(yil+" ARTIK YILDIR");
            }
        } else {
            System.out.println(yil + " ARTIK YILDIR");
        }


    }
}