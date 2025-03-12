import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Kullanıcıdan eleman sayısının alınması
        System.out.println("Eleman sayısı giriniz: ");
        int eleman = input.nextInt();
        // Girilen eleman sayısı uzunluğunda dizi oluşturulması ve bu diziye eleman alınması
        int[] dizi = new int[eleman];
        for (int i = 0; i < dizi.length; i++) {
            System.out.println((i + 1) + "nci eleman= ");
            dizi[i] = input.nextInt();
        }
        negatifPozitifElemanToplama(dizi);
    }
    // Bir dizideki pozitif sayılarla negatif sayıların ayrı ayrı toplamlarını döndüren metot.
    public static void negatifPozitifElemanToplama(int[] array) {
        int negatifToplam = 0;
        int pozitifToplam = 0;
        for (int elem : array) {
            if (elem < 0) {
                negatifToplam += elem;
            } else {
                pozitifToplam += elem;
            }
        }
        System.out.println("Pozitif sayıların toplamı: "+ pozitifToplam);
        System.out.println("Negatif sayıların toplamı: "+ negatifToplam);
    }
}
