
import java.util.Scanner;

public class CumleEpostaOneriUygulamasi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("İsim giriniz: ");
        String name = input.nextLine();

        System.out.println("Soyisim giriniz: ");
        String surname = input.nextLine();

        name = name.toLowerCase();
        surname = surname.toLowerCase();
        ePostaDonusturucu(name, surname);
    }

    static void ePostaDonusturucu(String nm, String snm) {
        StringBuffer bfr = new StringBuffer();
        bfr.append(snm);
        bfr.append(".");
        bfr.append(nm);
        bfr.append("@example.com");
        System.out.println(bfr);
    }
}
