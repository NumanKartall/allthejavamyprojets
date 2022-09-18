import java.util.Scanner;

public class kullaniciGirisi {
    public static void main(String[] args) {
        Scanner nmn = new Scanner(System.in);

        String username, password, sifirlama, newpassword;

        System.out.println("HESAP GIRISI");

        System.out.println("Kullanici adinizi girin:");
        username = nmn.nextLine();

        System.out.println("Sifrenizi girin:");
        password = nmn.nextLine();

        if (username.equals("numan") && password.equals("qwe")) {
            System.out.println("GIRIS BASARILI");

        } else {
            System.out.println("GIRIS BASARISIZ!! giris icin sifrenizi degistirebilirsiniz.Onay vermek icin: \"evet\" \"hayir\"");
            sifirlama = nmn.nextLine();

            if (sifirlama.equals("hayır")) {
                System.out.println("GIRIS SONLADIRILDI");
            } else if (sifirlama.equals("evet")) {
                System.out.println("YENI SIFRENIZI GIRIN:");
                newpassword = nmn.nextLine();
                System.out.println("SIFRENIZ BASARIYLA DEGISTIRILDI");

                if (newpassword.equals("qwe") || newpassword.equals(password)) {
                    System.out.println("ESKI SIFRENLE YENI SIFREN AYNI OLAMAZ!!");
                    System.out.println("LUTFEN ESKI SIFRENIZDEN BASKA YENI SIFRE GIRIN:");
                    newpassword = nmn.nextLine();
                    System.out.println("!!SIFRENIZ BASARIYLA DEGISTIRILDI!!");
                }
            } else {
                System.out.println("YANLIS YA DA HATALI TUSLAMA");
            }

        }

    }
}
