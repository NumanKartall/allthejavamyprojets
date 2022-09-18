import java.util.Scanner;

public class sayilariKucuktenBuyugeSiralama {
    public static void main(String[] args) {
        Scanner ınput = new Scanner(System.in);

        int a, b, c;
        System.out.println("1nci sayiyi girin: ");
        a = ınput.nextInt();

        System.out.println("2nci sayiyi girin: ");
        b = ınput.nextInt();

        System.out.println("3ncu sayiyi girin: ");
        c = ınput.nextInt();

        if (a < c && b < c) {
            if (a < b) {
                System.out.println("a<b<c");
            } else {
                System.out.println("b<a<c");
            }
        } else if (a < b && c < b) {
            if (a < c) {
                System.out.println("a<c<b");
            } else {
                System.out.println("a<c<b");
            }
        } else if (c < a && b < a) {
            if (b < c) {
                System.out.println("b<c<a");
            } else {
                System.out.println("c<b<a");
            }
        }
    }
}