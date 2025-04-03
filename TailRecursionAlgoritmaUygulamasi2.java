// 1/1!-2/2!+3/3!-4/4! …
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        // Kullanıcı tarafından limit değerinin alınması
        System.out.println("Kullanıcı tarafından değer alınması: ");
        int n=input.nextInt();
        // Fonksiyona değerin gönderilmesi
        System.out.println(fun(n));
    }
    // Recursive metodu ile işlemin yapılması
    static double fun(int n) {
        double toplam = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                toplam += (double) i / fact(i);
            } else {
                toplam -= (double) i / fact(i);
            }
        }
        return toplam;
    }
    // Faktoriyel hesaplama metodu
    static int fact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }
}
