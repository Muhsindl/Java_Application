
import java.util.Scanner;

public class CumleBirlestirmeVeEklemeUygulamasi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("İlk cümleyi giriniz: ");
        String ilkCumle = input.nextLine();

        System.out.println("Son cümleyi giriniz: ");
        String sonCumle = input.nextLine();

        System.out.println("Araya eklenecek cümleyi giriniz: ");
        String ortaCumle = input.nextLine();

        cumleBirlestir(ilkCumle, sonCumle, ortaCumle);

    }

    static void cumleBirlestir(String ilk, String son, String orta) {
        StringBuffer bfr = new StringBuffer(ilk);
        bfr.append(son);
        bfr.insert(ilk.length(), orta);
        System.out.println("Birleşmiş Cümle; \n " + bfr);
    }
}
