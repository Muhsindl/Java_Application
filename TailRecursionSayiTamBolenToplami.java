// Sayının kendisi dışında tam bölenlerinin toplamını geri döndüren tail recursion yapı
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Kullanıcıdan sayı alınması
        System.out.println("Sayı giriniz: ");
        int n = input.nextInt();
        System.out.print(fun(n));
    }

    static int fun(int n) {
        return funHelp(n, 1, 0);
    }
    // Recursion yapısı ile tam bölenlerinin toplamı
    static int funHelp(int n, int i, int toplam) {
        if (i == n) {
            return toplam;
        } else {
            if (n % i == 0) {
                return funHelp(n, i + 1, toplam + i); 
            } else {
                return funHelp(n, i + 1, toplam);
            }
        }
    }
}
