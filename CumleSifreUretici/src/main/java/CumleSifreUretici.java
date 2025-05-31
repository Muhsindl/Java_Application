
import java.util.Scanner;

public class CumleSifreUretici {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Cümle giriniz: ");
        String text = input.nextLine();

        sifreUretici(text);
    }

    static void sifreUretici(String text) {
        StringBuffer bfr = new StringBuffer(text);
        bfr.append("123");
        bfr.replace(0, 3, "xyz");
        bfr.insert(0, "@3!");
        bfr.reverse();
        System.out.println("Yeni şifre önrisi: " + bfr);

    }
}
