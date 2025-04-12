//Her öğrenciye ait minimum notu ve o notun ait olduğu indisi bulan uygulama

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ders sayısı giriniz: ");
        int col = input.nextInt();
        System.out.println("Öğrenci sayısı giriniz: ");
        int row = input.nextInt();
        int[][] matris = new int[row][col];
        Random r = new Random();

        // Rastgele notları oluşturuldu
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matris[i][j] = r.nextInt(101);
            }
        }

        // Matrisi ekrana yazdır
        System.out.println("Oluşturulan Not Matrisi:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matris[i][j] + "\t");
            }
            System.out.println();
        }

        // Minimum notları ve derslerini saklayacak diziler
        int[] minNot = new int[row];  // Her öğrencinin en düşük notu
        int[] minNotDers = new int[row];  // O notun hangi derse ait olduğu

        // Başlangıç değerlerini ayarla
        for (int i = 0; i < row; i++) {
            minNot[i] = matris[i][0];  // İlk dersi başlangıçta en düşük olarak kabul et
            minNotDers[i] = 0;  // İlk dersin indexini kaydet
        }

        // Minimum notları bul
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {  // 1'den başlamalı çünkü ilk dersi yukarıda aldık
                if (matris[i][j]<  minNot[i]) {  // Öğrencinin mevcut minimum notundan küçükse güncelle
                    minNot[i] = matris[i][j];
                    minNotDers[i] = j;
                }
            }
        }

        // Sonuçları ekrana yazdır
        System.out.println("Öğrencilerin en düşük notları: " + Arrays.toString(minNot));
        System.out.println("Bu notların ait olduğu ders numaraları: " + Arrays.toString(minNotDers));
    }
}
