// 1**2+2**2+3**2… gibi giden işlem uygulaması
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        // Kullanıcı tarafından değer alınması
        System.out.println("Limit değeri giriniz: ");
        int n=input.nextInt();
        // Kullanıcı tarafından girilen değerin fonksiyona gönderilmesi
        System.out.print(fun(n));
    }
    // n değeri ve sonuc değerinin recursive fonksiyona gönderilmesi
    static int fun(int n) {
        return funHelp(n, 0);
    }
    // Recursive olarak hesaplama yapan metodu
    static int funHelp(int n, int toplam) {
        if (n == 0) {
            return toplam;
        } else {
            return funHelp(n - 1, toplam + n * n);
        }
    }
}
