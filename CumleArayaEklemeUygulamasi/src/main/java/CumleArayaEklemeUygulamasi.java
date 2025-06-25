
import java.util.Scanner;

public class CumleArayaEklemeUygulamasi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Kullanıcıdan cümlenin alınması
        System.out.println("Cümle giriniz: ");
        String txt = input.nextLine();
        
        // Kullanıcıdan araya eklenecek cümlenin alınması
        System.out.println("Araya eklenecek cümle giriniz: ");
        String betweenTxt = input.nextLine();
        // Kullanıcının tarafından girilen cümle ve araya eklenecek cümlenin arayaCumleEkleme() metoduna gönderilmesi
        arayaCumleEkleme(txt, betweenTxt);
    }
    // Cümlenin tam ortasına yeni cümle ekleyen metot 
    static void arayaCumleEkleme(String text, String btwnTxt) {
        StringBuffer bfrTxt = new StringBuffer(text);
        bfrTxt.insert(bfrTxt.length() / 2, btwnTxt);
        System.out.println("Eklenmiş Cümle: \n" + bfrTxt);
    }
}
