
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
        // cumleBirlestir() metoduna girilen cümlelerin gönderilmesi ve cümle birleştirilmesinin yapılması 
        cumleBirlestir(ilkCumle, sonCumle, ortaCumle);

    }
    // Cümle birleştiren metot
    static void cumleBirlestir(String ilk, String son, String orta) {
        StringBuffer bfr = new StringBuffer(ilk);
        bfr.append(son);
        bfr.insert(ilk.length(), orta);
        System.out.println("Birleşmiş Cümle; \n " + bfr);
    }
}
