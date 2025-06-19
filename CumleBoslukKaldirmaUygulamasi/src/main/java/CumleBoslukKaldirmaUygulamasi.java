
import java.util.Scanner;

public class CumleBoslukKaldirmaUygulamasi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Kullanıcı tarafından cümlenin girilmesi
        System.out.println("Cümle giriniz: ");
        String boslukCumle = input.nextLine();
        // Girilen cümlenin metoda gönderilmesi
        cumleBoslukKaldir(boslukCumle);
    }

    // Cümleden boşlukları kaldıran metot 
    
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
