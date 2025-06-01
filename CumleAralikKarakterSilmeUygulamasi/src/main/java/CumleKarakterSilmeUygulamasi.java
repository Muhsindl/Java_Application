
import java.util.Scanner;

public class CumleKarakterSilmeUygulamasi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Cümle giriniz: ");
        String text = input.nextLine();
        StringBuffer str = new StringBuffer(text);

        System.out.println("Alt Aralık giriniz: ");
        int altLimit = input.nextInt();

        System.out.println("Üst Aralık giriniz: ");
        int ustLimit = input.nextInt();

        karakterSil(str, altLimit, ustLimit);
    }

    static void karakterSil(StringBuffer txt, int alt, int ust) {
        txt.delete(alt, ust);
        System.out.println(txt);
    }
}
