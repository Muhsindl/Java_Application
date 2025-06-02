
import java.util.Scanner;

public class CumleArayaEklemeUygulamasi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Cümle giriniz: ");
        String txt = input.nextLine();

        System.out.println("Araya eklenecek cümle giriniz: ");
        String betweenTxt = input.nextLine();

        arayaCumleEkleme(txt, betweenTxt);
    }

    static void arayaCumleEkleme(String text, String btwnTxt) {
        StringBuffer bfrTxt = new StringBuffer(text);
        bfrTxt.insert(bfrTxt.length() / 2, btwnTxt);
        System.out.println("Eklenmiş Cümle: \n" + bfrTxt);
    }
}
