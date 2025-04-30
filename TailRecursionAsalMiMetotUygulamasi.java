// Tail recursion yapısı ile Asal mı ? metot uygulaması
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        // Kullanıcı tarafından sayının alınması
        System.out.println("Lütfen sayı giriniz: ");
        int sayi=input.nextInt();
        
        // Alınan sayının metota gönderilmesi
        System.out.println("Asal mı? = " + asalMi(sayi)); 
    }
    // Yardımcı metot
    static boolean asalMi(int n) {
        if (n <= 1) return false;  // 1 ve daha küçük sayılar asal değildir
        return asalMiHelp(n, 2);
    }
    // Tail Recursive yapısı ile asal sayı kontrolü
    static boolean asalMiHelp(int n, int i) {
        if (i == n) {  // Eğer i n'ye eşitse, n asal demektir
            return true;
        } else {
            if (n % i == 0) {  // Eğer n i'ye tam bölünüyorsa, n asal değildir
                return false;
            } else {
                return asalMiHelp(n, i + 1);  // Eğer bölünmüyorsa, bir sonraki sayıya geç
            }
        }
    }
}
