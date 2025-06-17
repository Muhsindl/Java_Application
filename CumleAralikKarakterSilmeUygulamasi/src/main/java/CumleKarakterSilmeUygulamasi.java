
import java.util.Scanner;

public class CumleKarakterSilmeUygulamasi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Kullanıcıdan cümlenin alınması
        System.out.println("Cümle giriniz: ");
        String text = input.nextLine();
        StringBuffer str = new StringBuffer(text);
        // Kullanıcıdan alt sınır değerinin alınması
        System.out.println("Alt Aralık giriniz: ");
        int altLimit = input.nextInt();
        // Kullanıcıdan üst sınır değerinin alınması
        System.out.println("Üst Aralık giriniz: ");
        int ustLimit = input.nextInt();
        // Kullanıcı tarafından girilen değerlerin metota gönderilmesi
        karakterSil(str, altLimit, ustLimit);
    }
    // Alt ve üst sınır arasında kalan karakterlerin silinmesi
    static void karakterSil(StringBuffer txt, int alt, int ust) {
        txt.delete(alt, ust);
        System.out.println(txt);
    }
}
