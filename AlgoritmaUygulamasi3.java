import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Kullanıcıdan sayı alınması
        System.out.print("Lütfen sayı giriniz: ");
        int sayi = input.nextInt();
        // Kullanıcıdan sınır değerinin alınması
        System.out.print("Lütfen sınır değeri giriniz: ");
        int sinir = input.nextInt();
        // Kullanıcıdan katsayı değerinin alınması
        System.out.print("Lütfen katsayı değeri giriniz: ");
        int katSayi = input.nextInt();
        
        double result = 0;
        // Kullanıcıdan alınan sayı sınır değerinden büyük ise katsayi ile çarpılması
        if (sinir < sayi) {
            result = katSayi * sayi;
        } else if (sayi == sinir) { // Eşit ise sayi değerinin değiştirilmemesi
            result = sayi;
        } else { // Küçük ise katsayi değerine bölünmesi
            result = sayi / (double)katSayi;
        }
        // Sonucun ekrana yazdırılması
        System.out.println("Sonuç: " + result);
    }
}
