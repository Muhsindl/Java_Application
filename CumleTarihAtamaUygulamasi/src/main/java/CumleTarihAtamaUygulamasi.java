
import java.util.Scanner;

public class CumleTarihAtamaUygulamasi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Cümle giriniz: ");
        String txt = input.nextLine();

        System.out.println("Tarih giriniz: ");
        String trh = input.nextLine();

        tarihAta(txt, trh);

    }

    static void tarihAta(String txt, String tarih) {
        StringBuffer bfrCumle = new StringBuffer(txt);
        bfrCumle.insert(0, "Tarihli Cümle: ");
        bfrCumle.append(" ");
        System.out.println(bfrCumle.append(tarih));
    }
}
