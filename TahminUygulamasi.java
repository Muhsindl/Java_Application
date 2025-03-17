import java.util.Scanner;
import java.util.Random;

public class JavaApp4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Tahmin etmek istediğiniz miktar: ");
        int miktar = input.nextInt();
        System.out.println("Tahmin alt aralığı giriniz: ");
        int ilkAralik = input.nextInt();
        System.out.println("Tahmin üst aralığı giriniz: ");
        int sonAralik = input.nextInt();
        Random r = new Random();
        int[] tahmin = new int[miktar];
        int[] randomDizi = new int[miktar];
        for (int i = 0; i < tahmin.length; i++) {
            System.out.println((i + 1) + "nci Tahmini giriniz: ");
            tahmin[i] = input.nextInt();
        }
        for (int i = 0; i < randomDizi.length; i++) {
            randomDizi[i] = r.nextInt(ilkAralik, sonAralik + 1);
        }
        int sayac = 0;
        for (int i = 0; i < miktar; i++) {
            if (tahmin[i] == randomDizi[i]) {
                sayac++;
            }
        }
        System.out.println("Toplam bilinen sayı: " + sayac);
        System.out.println("Toplam bilme oranı: " + (sayac / (double) miktar));
    }
}
