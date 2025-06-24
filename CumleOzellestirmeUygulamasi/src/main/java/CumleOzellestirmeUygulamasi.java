
import java.util.Scanner;

public class CumleOzellestirmeUygulamasi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Kullanıcıdan cümlenin alınması
        System.out.println("Özelleştirilecek Cümle giriniz: ");
        String text = input.nextLine();
        // Kullanıcıdan alınan cümlenin ozellestirCumle() fonksiyonuna gönderilmesi
        ozellestirCumle(text);
    }
    // ozellestirCumle() metodu ile bazı karakterlerin değiştirilme işleminin yapılması
    static void ozellestirCumle(String txt) {
        StringBuffer bfr = new StringBuffer(txt);

        for (int i = 0; i < bfr.length(); i++) {
            if (bfr.charAt(i) == 'a') {
                bfr.setCharAt(i, '@');
            }
            if (bfr.charAt(i) == 'A') {
                bfr.setCharAt(i, '@');
            }
            if (bfr.charAt(i) == 'e') {
                bfr.setCharAt(i, '3');
            }
            if (bfr.charAt(i) == 'E') {
                bfr.setCharAt(i, '3');
            }
            if (bfr.charAt(i) == 'I') {
                bfr.setCharAt(i, '1');
            }
            if (bfr.charAt(i) == 'İ') {
                bfr.setCharAt(i, '1');
            }
            if (bfr.charAt(i) == 'ı') {
                bfr.setCharAt(i, '1');
            }
            if (bfr.charAt(i) == 'i') {
                bfr.setCharAt(i, '1');
            }
            if (bfr.charAt(i) == 'O') {
                bfr.setCharAt(i, '0');
            }
            if (bfr.charAt(i) == 'o') {
                bfr.setCharAt(i, '0');
            }

        }
        System.out.println("Özelleştirilmiş Cümle: " + bfr);
    }
}
