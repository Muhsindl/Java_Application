import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Kullanıcıdan N değeri (satır sayısı) alınır
        Scanner input = new Scanner(System.in);
        System.out.println("N değeri giriniz: ");
        int n = input.nextInt();
        
        // Pascal üçgenini hesaplamak ve yazdırmak
        for (int i = 0; i <= n; i++) {
            // Her satırda i. satır için binom katsayılarını hesapla
            for (int k = 0; k <= i; k++) {
                // Binomial katsayı hesaplanır: C(i, k) = i! / (k! * (i-k)!)
                System.out.print(fact(i) / (fact(k) * fact(i - k)) + "\t");
            }
            // Satır tamamlandığında yeni satıra geçilir
            System.out.println();
        }
    }

    // Faktöriyel hesaplama fonksiyonu
    static int fact(int n) {
        // Eğer n 0 veya 1 ise 1 döndürülür (baz durum)
        if (n == 0 || n == 1) {
            return 1;
        } else {
            // Rekürsif olarak faktöriyel hesaplanır
            return n * fact(n - 1);
        }
    }
}
