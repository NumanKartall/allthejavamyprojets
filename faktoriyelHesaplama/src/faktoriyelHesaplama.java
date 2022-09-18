import java.util.Scanner;
public class faktoriyelHesaplama {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int sayi, toplam=1;

        System.out.println("faktoriyel sayisini giriniz:");
        sayi=scan.nextInt();

        for (int i=1;i<=sayi;i++){
            toplam=toplam*i;
        }
        System.out.println(sayi+ " faktoriyeli: "+toplam);
    }
}
