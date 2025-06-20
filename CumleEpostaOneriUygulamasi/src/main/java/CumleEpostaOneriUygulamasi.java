
import java.util.Scanner;

public class CumleEpostaOneriUygulamasi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Kullanıcı tarafından isim girilmesi
        System.out.println("İsim giriniz: ");
        String name = input.nextLine();
        // Kullanıcı tarafından soyisim girilmesi
        System.out.println("Soyisim giriniz: ");
        String surname = input.nextLine();
        // Kullanıcı tarafından girilen isim ve soyisimleri küçük harfe çevirip metota gönderilmesi    
        name = name.toLowerCase();
        surname = surname.toLowerCase();
        ePostaDonusturucu(name, surname);
    }
    // E-posta öneri metodu
    static void ePostaDonusturucu(String nm, String snm) {
        StringBuffer bfr = new StringBuffer();
        bfr.append(snm);
        bfr.append(".");
        bfr.append(nm);
        bfr.append("@example.com");
        System.out.println(bfr);
    }
}
