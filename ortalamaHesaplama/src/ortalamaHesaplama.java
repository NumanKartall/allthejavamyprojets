import java.util.Scanner;

public class ortalamaHesaplama {
    public static void main(String[] args) {

        Scanner ınput = new Scanner(System.in);
        int mat, turkce, fizik, kimya, biyoloji, tarih;

        System.out.println("MATEMATIK NOTUNUZU GIRINIZ:");
        mat = ınput.nextInt();

        System.out.println("TURKCE NOTUNUZU GIRINIZ:");
        turkce = ınput.nextInt();

        System.out.println("FIZIK NOTUNUZU GIRINIZ:");
        fizik = ınput.nextInt();

        System.out.println("KIMYA NOTUNUZU GIRINIZ:");
        kimya = ınput.nextInt();

        System.out.println("BIYOLOJI NOTUNUZU GIRINIZ:");
        biyoloji = ınput.nextInt();

        System.out.println("TARIH NOTUNUZU GIRINIZ:");
        tarih = ınput.nextInt();
        if (mat>100 || mat<0){
            mat=0;
        }
        if (turkce>100 || turkce<0){
            turkce=0;
        }
        if (fizik>100 || fizik<0){
            fizik=0;
        }
        if (kimya>100 || kimya<0){
            kimya=0;
        }
        if (biyoloji>100 || biyoloji<0){
            biyoloji=0;
        }
        if (tarih>100 || tarih<0){
            tarih=0;
        }

        double avarage = (mat + turkce + fizik + kimya + biyoloji + tarih) / 6;
        System.out.println("NOT ORTALAMANIZ: "+avarage);

        if (avarage > 55) {
            System.out.println("OGRENCI GECTI!!");
        } else {
            System.out.println("OGRENCI KALDI!!");
        }
    }
}