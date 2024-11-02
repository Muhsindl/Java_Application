import java.util.ArrayList;
import java.util.Scanner;

public class JavaApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Eleman sayısının kullanıcıdan alınması
        System.out.print("Eleman sayısı giriniz: ");
        int n = input.nextInt();
        int[] dizi = new int[n];
        //Eleman alınması
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ". elemanı giriniz: ");
            dizi[i] = input.nextInt();
        }
        // iki adet boş dizi oluşturulması
        ArrayList<Integer> diziTek = new ArrayList<>();
        ArrayList<Integer> diziCift = new ArrayList<>();
        // Alınan dizide tek ve çift elemanın ayrı dizilere kayıt edilmesi
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                diziCift.add(dizi[i]);
            } else {
                diziTek.add(dizi[i]);
            }
        }
        // Kullanıcıya gösterilmesi tek ve çift elemana sahip dizilerin
        System.out.println("Tek indeksli elemanlar: " + diziTek);
        System.out.println("Çift indeksli elemanlar: " + diziCift);
    }
}
