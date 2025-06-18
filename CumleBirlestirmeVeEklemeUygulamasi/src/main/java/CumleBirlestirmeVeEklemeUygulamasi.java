
import java.util.Scanner;

public class CumleBirlestirmeVeEklemeUygulamasi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Kullanıcıdan ilk cümlenin alınması
        System.out.println("İlk cümleyi giriniz: ");
        String ilkCumle = input.nextLine();
        // Kullanıcıdan son cümlenin alınması
        System.out.println("Son cümleyi giriniz: ");
        String sonCumle = input.nextLine();
        // Kullanıcıdan araya eklenecek cümlenin alınması
        System.out.println("Araya eklenecek cümleyi giriniz: ");
        String ortaCumle = input.nextLine();
        // Metoda girilen değerlerin gönderilmesi
        cumleBirlestir(ilkCumle, sonCumle, ortaCumle);

    }
    // cumleBirlestir() metodu ile ilk ve son cümle arasına cümle eklenmesi
    static void cumleBirlestir(String ilk, String son, String orta) {
        StringBuffer bfr = new StringBuffer(ilk);
        bfr.append(son);
        bfr.insert(ilk.length(), orta);
        System.out.println("Birleşmiş Cümle; \n " + bfr);
    }
}
