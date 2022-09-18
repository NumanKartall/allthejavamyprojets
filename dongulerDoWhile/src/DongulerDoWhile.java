import java.util.Scanner;

class dongulerDoWhile {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int sayi,toplam=0;

        do {
            System.out.println("bir sayi giriniz.");
            sayi = input.nextInt();
            if ((sayi%2==0)&&(sayi%4==0)){
                toplam+=sayi;
            }
        } while (sayi%2==0);
        System.out.println("sonuc:"+toplam);
    }
}