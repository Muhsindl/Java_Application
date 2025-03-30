// 1/1! + 2/2! + 3/3! + 4/4! + 5/5! ... n/n! hesaplama uygulaması
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        // Kullanıcıdan sınır değerinin alınması
        System.out.println("Sınır sayısı giriniz: ");
        int n=input.nextInt();
        // Alınan reğerin recursive metot'a gönderilmesi 
        System.out.println(fun(n));  
    }
    
    static double fun(int n) {
        double toplam = 0;
        
        // Döngüde her i için i / i! işlemini yapıyoruz
        for (int i = 1; i <= n; i++) {
            toplam += (double) i / fact(i);  // i'yi i! ile bölüyoruz
        }
        
        return toplam;
    }

    static int fact(int n) {
        if (n == 0 || n == 1) {
            return 1;  // 0! ve 1! her ikisi de 1'dir
        } else {
            return n * fact(n - 1);  // Rekürsif olarak faktöriyel hesaplama
        }
    }
}
