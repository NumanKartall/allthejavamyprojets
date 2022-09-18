import java.util.Scanner;

public class kdvtutar {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        double tutar, kdvoran=0.18;
        double kdvoran2=0.08;

        System.out.println("FIYAT GIRINIZ:");
        tutar=scan.nextDouble();

        if (tutar>0 && tutar<1000){
            double kdvoranı=tutar*kdvoran;
            System.out.println("KDV orani: "+kdvoranı);
            double kdvlitutar=tutar+kdvoranı;
            System.out.println("KDV li tutar: " +kdvlitutar);
        } else if (tutar>1000) {
            double kdvoranı=tutar*kdvoran2;
            System.out.println("KDV oranı: "+kdvoranı);
            double kdvlitutar=tutar+kdvoranı;
            System.out.println(kdvlitutar);
        }
    }
}
