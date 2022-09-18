import java.util.Scanner;
public class burcBulanProgram {
    public static void main(String[] args) {

        String ay;
        int gun;
        Scanner input = new Scanner(System.in);

        System.out.println("---BURC BULMA PROGRAMI---");
        System.out.println("HANGI AYDA DOGDUNUZ?");
        ay = input.nextLine();
        System.out.println("HANGI GUN DOGDUNUZ?");
        gun = input.nextInt();

        if (ay.equals("OCAK") && gun >= 1 && gun <= 21) {
            System.out.println("OGLAK BURCU");
        } else if (ay.equals("OCAK") && gun >= 22 && gun <= 31) {
            System.out.println("KOVA BURCU");
        }
        if (ay.equals("SUBAT") && gun >= 1 && gun <= 19) {
            System.out.println("KOVA BURCU");
        } else if (ay.equals("SUBAT") && gun >= 20 && gun <= 29) {
            System.out.println("BALIK BURCU");
        }
        if (ay.equals("MART") && gun >= 1 && gun <= 20) {
            System.out.println("BALIK BURCU");
        } else if (ay.equals("MART") && gun >= 21 && gun <= 30) {
            System.out.println("KOC BURCU");
        }
        if (ay.equals("NİSAN") && gun >= 1 && gun <= 20) {
            System.out.println("KOC BURCU");
        } else if (ay.equals("NİSAN") && gun >= 21 && gun <= 30) {
            System.out.println("BOGA BURCU");
        }
        if (ay.equals("MAYIS") && gun >= 1 && gun <= 21) {
            System.out.println("BOGA BURCU");
        } else if (ay.equals("MAYIS") && gun >= 22 && gun <= 30) {
            System.out.println("IKIZLER BURCU");
        }
        if (ay.equals("HAZIRAN") && gun >= 1 && gun <= 22) {
            System.out.println("IKIZLER BURCU");
        } else if (ay.equals("HAZIRAN") && gun >= 23 && gun <= 30) {
            System.out.println("YENGEC BURCU");
        }
        if (ay.equals("TEMMUZ") && gun >= 1 && gun <= 22) {
            System.out.println("YENGEC BURCU");
        } else if (ay.equals("TEMMUZ") && gun >= 23 && gun <= 30) {
            System.out.println("ASLAN BURCU");
        }
        if (ay.equals("AGUSTOS") && gun >= 1 && gun <= 22) {
            System.out.println("ASLAN BURCU");
        } else if (ay.equals("AGUSTOS") && gun >= 23 && gun <= 30) {
            System.out.println("BASAK BURCU");
        }
        if (ay.equals("EYLUL") && gun >= 1 && gun <= 22) {
            System.out.println("BASAK BURCU");
        } else if (ay.equals("EYLUL") && gun >= 23 && gun <= 30) {
            System.out.println("TERAZI BURCU");
        }
        if (ay.equals("EKIM") && gun >= 1 && gun <= 22) {
            System.out.println("TERAZI BURCU");
        } else if (ay.equals("EKIM") && gun >= 23 && gun <= 30) {
            System.out.println("AKREP BURCU");
        }
        if (ay.equals("KASIM") && gun >= 1 && gun <= 21) {
            System.out.println("AKREP BURCU");
        } else if (ay.equals("KASIM") && gun >= 22 && gun <= 30) {
            System.out.println("YAY BURCU");
        }
        if (ay.equals("ARALIK") && gun >= 1 && gun <= 21) {
            System.out.println("YAY BURCU");
        } else if (ay.equals("ARALIK") && gun >= 22 && gun <= 30) {
            System.out.println("OGLAK BURCU");
        }
    }
}