import java.util.Scanner;

public class armstrongSayiHesaplama {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("bir sayi giriniz:");
        int number = scan.nextInt();
        int basamaksayisi = 0, tempNumber = number, basValue,result=0,basPow;

        while (tempNumber != 0) {
            tempNumber /= 10;
            basamaksayisi++;
        }

        tempNumber = number;
        while (tempNumber != 0) {
            basValue = tempNumber % 10;
            basPow=1;
            for (int i=1;i<=basamaksayisi;i++){
                basPow*=basValue;
            }
            result+=basPow;
            tempNumber /= 10;
        }
        System.out.println(result);
    }
}