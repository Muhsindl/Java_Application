// Random dizide eleman ortalaması bulan metot

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Kullanıcı tarafından dizi uzunluğunun alınması
        System.out.println("Eleman sayısı giriniz: ");
        int n = input.nextInt();
        // Girilen uzunlukta dizi oluşturulması
        int[] dizi = new int[n];
        Random r = new Random();
        // Oluşturulan diziye random eleman atanması
        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = r.nextInt(11);
        }
        // Dizi elemanlarının ekranda gösterilmesi
        for (int i = 0; i < dizi.length; i++) {
            System.out.print(dizi[i] + "\t");
        }
        // ort() isimli metoda dizinin gönderilmesi ve ortalamasının ekranda gösterilmesi
        ort(dizi);
    }
    
    // Gönderilen dizinin ortalamasını hesaplayıp ekrana yazdıran uygulama
    static void ort(int[] dizi) {
        int toplam = 0;
        for (int i = 0; i < dizi.length; i++) {
            toplam += dizi[i];
        }
        double ort = (double) toplam / dizi.length;
        System.out.println("Ortalama: " + ort);
    }
}
