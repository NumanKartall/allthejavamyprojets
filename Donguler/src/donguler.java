import  java.util.Scanner;
public class donguler {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);

        int password;
        boolean isPasswordSucsess=true;

        while (isPasswordSucsess){
            System.out.println("LUTFEN SIFRENIZI GIRINIZ");
            password=input.nextInt();
            if (password==123){
                System.out.println("sifredogru");
                isPasswordSucsess=false;
            }else {
                System.out.println("sifre yanlis");
            }
        }
    }
}
