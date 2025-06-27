
import java.util.Scanner;

public class CumleTarihAtamaUygulamasi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Kullanıcı tarafından cümle girilmesi
        System.out.println("Cümle giriniz: ");
        String txt = input.nextLine();
        
        // Kullanıcıdan tarih bilgisinin alınması
        System.out.println("Tarih giriniz: ");
        String trh = input.nextLine();
       
        // tarihAta() fonksiyonuna cümle ve tarih bilgilerinin gönderilmesi
        tarihAta(txt, trh);

    }
    
    // Tarih ile cümleyi birleştirip ekrana yazdıran uygulama
    static void tarihAta(String txt, String tarih) {
        StringBuffer bfrCumle = new StringBuffer(txt);
        bfrCumle.insert(0, "Tarihli Cümle: ");
        bfrCumle.append(" ");
        System.out.println(bfrCumle.append(tarih));
    }
}
