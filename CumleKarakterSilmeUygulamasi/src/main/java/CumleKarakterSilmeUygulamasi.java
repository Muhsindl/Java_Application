
import java.util.Scanner;

public class CumleKarakterSilmeUygulamasi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Kullanıcı tarafından cümle girilmesi
        System.out.println("Cümle giriniz: ");
        String txt = input.nextLine();
        // Kullanıcı tarafından silinecek karakterin girilmesi
        System.out.println("Silinecek karakteri giriniz: ");
        String ch = input.nextLine();
        // Karakter mi cümle mi girildi diye silinecek elemanın kontrol edilmesi
        if (ch.length() != 1) {
            System.out.println("HATA Silinecek karakter tek olmalı !!!");
            return;

        }
        txt = txt.toLowerCase();
        ch = ch.toLowerCase();

        karakterSil(txt, ch);
    }
    // Karakter silme  metoduna kullanıcıdan alınan değerlerin gönderilmesi
    static void karakterSil(String text, String ch) {
        StringBuffer bfrTxt = new StringBuffer(text);
        for (int i = 0; i < bfrTxt.length(); i++) {
            if (bfrTxt.charAt(i) == ch.charAt(0)) {
                bfrTxt.deleteCharAt(i);
            }
        }
        System.out.println("Cümle son hali: " + bfrTxt);
    }
}
