
import java.util.Scanner;

public class CumleTerstenBirlestirmeUygulamasi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Tersi ile birleştirecek cümleyi giriniz: ");
        String txt = input.nextLine();

        terstenBirlestir(txt);
    }

    static void terstenBirlestir(String txt) {
        StringBuffer text = new StringBuffer(txt);

        for (int i = text.length() - 1; i >= 0; i--) {
            text.append(text.charAt(i));
        }
        System.out.println("Birleşik Cümle:\n " + text);
    }
}
