
import java.util.Scanner;

public class CumleKelimeIlkHarfBuyukYapanUygulama {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Cümle giriniz: ");
        String txt = input.nextLine();

        kelimeBuyukYap(txt);
    }

    static void kelimeBuyukYap(String txt) {
        StringBuffer text = new StringBuffer(txt);
        text.setCharAt(0, Character.toUpperCase(text.charAt(0)));
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                text.setCharAt(i + 1, Character.toUpperCase(text.charAt(i + 1)));
            }
        }
        System.out.println(text);
    }
}
