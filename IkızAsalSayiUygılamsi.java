// İkiz Asal uygulaması n’e kadar

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class JavaApp5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Kaça kadar olmasını istiyorsunuz? ");
        int n = input.nextInt();
        for (int i = 0; i <= n; i++) {
            if (asalmi(i) && asalmi(i + 2)) {
                System.out.println("İkiz asal sayılardır (" + i + "," + (i + 2) + ")");
            }
        }
        System.out.println(asalmi(n));
    }

    static boolean asalmi(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
