
import java.util.Scanner;

public class CumleSifreUretici {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Kullanıcıdan cümlenin alınması
        System.out.println("Cümle giriniz: ");
        String text = input.nextLine();
        // Kullanıcıdan alınan cümlenin sifreUretici() metoduna gönderilmesi
        sifreUretici(text);
    }
    // sifreUretici() metodu ile cümleye özelleştirilmiş şifre uygulanması
    static void sifreUretici(String text) {
        StringBuffer bfr = new StringBuffer(text);
        bfr.append("123");
        bfr.replace(0, 3, "xyz");
        bfr.insert(0, "@3!");
        bfr.reverse();
        System.out.println("Yeni şifre önrisi: " + bfr);

    }
}
