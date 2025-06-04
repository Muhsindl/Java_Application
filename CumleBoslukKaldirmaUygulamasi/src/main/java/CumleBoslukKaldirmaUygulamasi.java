
import java.util.Scanner;

public class CumleBoslukKaldirmaUygulamasi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Cümle giriniz: ");
        String boslukCumle = input.nextLine();

        cumleBoslukKaldir(boslukCumle);
    }

    static void cumleBoslukKaldir(String text) {
        StringBuffer bfr = new StringBuffer(text);
        for (int i = 0; i < bfr.length(); i++) {
            if (bfr.charAt(i) == ' ') {
                bfr.deleteCharAt(i);
            }
        }
        System.out.println("Boşluksuz cümle: " + bfr);
    }
}
