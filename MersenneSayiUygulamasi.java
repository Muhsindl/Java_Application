// Mersenne sayısı uygulaması

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Kullanıcı tarafından mersenne sayı hesaplama üst limitinin girilmesi
        System.out.println("Mersenne sayı hesabının kaça kadar olmasını istiyorsunuz? ");
        int n = input.nextInt();
        for (int i = 2; i <= n; i++) {
            if (asalmi(i) && asalmi((int) (Math.pow(2, i) - 1))) {
                System.out.println(i + " ~ Mersenne Sayısıdır");
            }
        }
    }
    // Asal sayi mi kontrol metodu
    static boolean asalmi(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
