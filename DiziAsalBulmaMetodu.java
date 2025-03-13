import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Bir dizinin elemanlarının asal olup olmadığını kontrol eden ve asal olanların sayısını döndüren metot.
        System.out.println("Eleman sayısı giriniz: ");
        int eleman = input.nextInt();
        int[] dizi = new int[eleman];
        for (int i = 0; i < dizi.length; i++) {
            System.out.println((i + 1) + "nci eleman giriniz= ");
            dizi[i] = input.nextInt();
        }
        // Asal sayıları döndüren diziyi yazdırıyoruz.
        System.out.println(Arrays.toString(asalMi(dizi)));
    }

    public static int[] asalMi(int[] array) {
        // Asal sayıları tutacak liste
        int[] asalDizi = new int[array.length];
        int index = 0; // Asal sayıları ekleyeceğimiz dizinin indeksini takip etmemiz için
        for (int i = 0; i < array.length; i++) {
            int sayac = 0;
            // 2'den array[i]'e kadar olan sayılarla bölme işlemi
            for (int j = 2; j <= array[i] / 2; j++) {
                if (array[i] % j == 0) {
                    sayac++;
                    break; // Eğer bir bölen bulursa, o sayı asal değildir
                }
            }
            // Sayac 0 ise, bu sayı asal demektir
            if (sayac == 0 && array[i] > 1) {
                asalDizi[index++] = array[i]; // Asal sayıyı dizimize ekliyoruz
            }
        }

        // Yalnızca asal sayılardan oluşan bir yeni dizi oluşturuyoruz
        return Arrays.copyOf(asalDizi, index);
    }
}