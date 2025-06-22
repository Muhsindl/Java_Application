
import java.util.Scanner;

public class CumleKelimeDegistirmeUygulamasi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Kullanıcıdan cümlenin alınması
        System.out.println("Cümle giriniz: ");
        String text = input.nextLine();
        
        // Kullanıcıdan değiştirilecek kelimenin alınması
        System.out.println("Eski kelime hangisi: ");
        String oldText = input.nextLine();
        
        // Kullanıcıdan değiştirilmesi istenilen kelimenin alınması
        System.out.println("Değiştirilecek kelime: ");
        String newText = input.nextLine();
        
        // Eski ve yeni cümlenin ekranda gösterilmesi
        System.out.println("Eski Cümle Yapısı; \n" + text);
        System.out.println("----------------------------");
        System.out.println("Yeni Cümle Yapısı; \n");
        kelimeDegistirme(text, oldText, newText);
    }
    // Kelime değiştirme metot uygulaması
    static void kelimeDegistirme(String text, String oldText, String newText) {
        StringBuffer bfr = new StringBuffer(text);
        int eskiKelimeIndis = bfr.indexOf(oldText);
        if (eskiKelimeIndis != -1) {
            bfr.delete(eskiKelimeIndis, eskiKelimeIndis+oldText.length());
            bfr.insert(eskiKelimeIndis,newText);
        }
        System.out.println(bfr);
    }
}
