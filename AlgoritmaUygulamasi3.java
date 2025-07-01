import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen sayı giriniz: ");
        int sayi = input.nextInt();

        System.out.print("Lütfen sınır değeri giriniz: ");
        int sinir = input.nextInt();

        System.out.print("Lütfen katsayı değeri giriniz: ");
        int katSayi = input.nextInt();
        
        double result = 0;
        
        if (sinir < sayi) {
            result = katSayi * sayi;
        } else if (sayi == sinir) {
            result = sayi;
        } else {
            result = sayi / (double)katSayi;
        }
        
        System.out.println("Sonuç: " + result);
    }
}
