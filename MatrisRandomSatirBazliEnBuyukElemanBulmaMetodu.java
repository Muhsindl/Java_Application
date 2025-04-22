// Matris de satır bazlı en küçük elemanı bulan metot

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Kullanıcıdan satır sayısının alınması
        System.out.println("Satır sayısı: ");
        int row = input.nextInt();
        // Kullanıcıdan sütun sayısının alınması
        System.out.println("Sütun sayısı: ");
        int col = input.nextInt();
        // Random sınıfına ait nesne oluşturulması
        Random r = new Random();
        // 2 boyutlu dizi (Matris) tanımlanması
        int[][] matris = new int[row][col];
        // Random sayıları 0-100 aralığında ki matris elemanı olarak atanması
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matris[i][j] = r.nextInt(101);
            }
        }
        // Matris ekrana yazdırılması
        System.out.println("-----------------Matris-----------------");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matris[i][j] + "\t");
            }
            System.out.println();
        }
        // Matrisin ilk sütunun her satırının başlangıçta maximum değer varsayılması
        int[] maxRow = new int[row];
        for (int i = 0; i < row; i++) {
            maxRow[i] = matris[i][0];
        }
        func(matris, maxRow);
    }
    // Satırlarda bulunan maximum değerlerin kontrol edilip maximum değerin güncellenmesi
    static void func(int[][] matrix, int[] maxRow) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] > maxRow[i]) {
                    maxRow[i] = matrix[i][j];
                }
            }
        }
        // Maximum değerlere ait dizinin ekranda gösterilmesi
        System.out.println(Arrays.toString(maxRow));
    }
}
