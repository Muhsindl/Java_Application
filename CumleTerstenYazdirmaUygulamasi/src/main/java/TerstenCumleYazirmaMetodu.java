
import java.util.Scanner;

public class TerstenCumleYazirmaMetodu {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Kullanıcıdan kelime alınması
        System.out.print("Seçilen kelimeyi giriniz: ");
        String text = input.nextLine();
        
        // Kullanıcıdan alınan kelimeyi tersYazdirma() metoduna gönderir
        tersYazdirma(text);
    }
    // tersYazdirma() kelimeyi tersten yazdıran metot
    static void tersYazdirma(String txt){
        for (int i = txt.length()-1; i >= 0; i--) {
            System.out.print(txt.charAt(i));
        }
    }
}
