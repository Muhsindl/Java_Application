
import java.util.Scanner;

public class CumleKarakterSilmeUygulamasi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Kullanıcı tarafından cümlenin girilmesi
        System.out.println("Cümle giriniz: ");
        String text = input.nextLine();
        StringBuffer str = new StringBuffer(text);
        // Alt sınır aralığının girilmesi
        System.out.println("Alt Aralık giriniz: ");
        int altLimit = input.nextInt();
        // Üst sınır aralığının girilmesi
        System.out.println("Üst Aralık giriniz: ");
        int ustLimit = input.nextInt();
        // Metodu cümle alt ve üst sınır değerlerinin gönderilmesi
        karakterSil(str, altLimit, ustLimit);
    }
    // alt ve üst limit değer aralığında ki karakterleri silen metot
    static void karakterSil(StringBuffer txt, int alt, int ust) {
        txt.delete(alt, ust);
        System.out.println(txt);
    }
}
