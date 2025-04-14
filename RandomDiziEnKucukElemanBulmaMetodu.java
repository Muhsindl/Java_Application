// Random dizide en küçük eleman bulan metot

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
        // minBul() isimli metoda dizinin gönderilmesi ve en küçük elemanın ekranda gösterilmesi
        minBul(dizi);
    }
    
    // Gönderilen dizinin en küçük elemanını bulup ekrana yazdıran uygulama
    static void minBul(int[] dizi) {
        // Varsayılan olarak ilk elemanın en küçük kabul edilmesi
        int min=dizi[0];
        // Elemanları gezip min elemandan daha küçük eleman varsa minimum elemanın güncellenmesi
        for (int i=0;i<dizi.length;i++){
            if(dizi[i]<min){
                min=dizi[i];
            }
        }
        System.out.println("En küçük eleman: "+ min);
    }
}
