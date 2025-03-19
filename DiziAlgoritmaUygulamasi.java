
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random r = new Random();
        // Random 5 elemanlı dizi oluşturulması
        int[] dizi = new int[5];
        // Random oluşturulan diziye 0,10 aralığında (1,2,..9) sayı atanması
        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = r.nextInt(0, 10);
        }
        // Normal dizinin ekranda gösterilmesi
        System.out.println("Normal dizi: " + Arrays.toString(dizi));
        // Oluşturulan random diziye ait fonksiyonların çalıştırılması
        diziKkati(dizi);
        diziTers(dizi);
        diziHarmonikOrtalama(dizi);
        // Random 10 elemanlı negatif dahil dizi oluşturulması
        int[] diziNegatif = new int[10];
        // Random oluşturulan diziye -9,10 aralığında (-9,-8,..-1,0,1,..9) sayı atanması
        for (int i = 0; i < diziNegatif.length; i++) {
            diziNegatif[i] = r.nextInt(-9, 10);
        }
        // Negatif dahil dizinin ekranda gösterilmesi
        System.out.println("Negatif Dizi: " + Arrays.toString(diziNegatif));
        //Oluşturulan negatif dahil random diziye ait fonksiyonun çalıştırılması
        diziNegatifPozitif(diziNegatif);
    }
    
    // Gelen diziyi 10 katı ile çarpıp yeni dizi oluşturan fonksiyon
    static void diziKkati(int[] array) {
        int[] diziNew = new int[array.length];
        for (int i = 0; i < diziNew.length; i++) {
            diziNew[i] = 10 * array[i];
        }
        System.out.println("10 katı dizi" + Arrays.toString(diziNew));
    }
    // Gelen diziyi terse çevirip yeni dizi oluşturan fonksiyon
    static void diziTers(int[] array) {
        int[] tersDizi = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            tersDizi[i] = array[array.length - i - 1];
        }
        System.out.println("Tersi alınmış dizi: " + Arrays.toString(tersDizi));
    }
    // Gelen dizinin harmonik ortalamasını hesaplayan fonksiyon
    static void diziHarmonikOrtalama(int[] array) {
        double ortalama = 1;
        for (int i = 0; i < array.length; i++) {
            ortalama *= array[i];
        }
        System.out.println("Harmonik ortalama: " + Math.pow(ortalama, (double) 1 / array.length));
    }
    // Gelen dizinin negatif ve pozitif elemanları için ayrı dizi oluşturup ekranda gösteren fonksiyon
    static void diziNegatifPozitif(int[] array) {
        int negatifSayac = 0;
        int pozitifSayac = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                negatifSayac++;
            } else {
                pozitifSayac++;
            }
        }
        int[] negaDizi = new int[negatifSayac];
        int[] poziDizi = new int[pozitifSayac];
        int nSayac = 0;
        int pSayac = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                negaDizi[nSayac++] = array[i];
            } else {
                poziDizi[pSayac++] = array[i];
            }
        }
        System.out.println("Pozitif Dizi elemanları: " + Arrays.toString(poziDizi));
        System.out.println("Negatif Dizi elemanları: " + Arrays.toString(negaDizi));
    }
}
