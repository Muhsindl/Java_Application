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
        // Matrisin ilk sütunun her satırının başlangıçta minimum değer varsayılması
        int[] minRow = new int[row];
        for (int i = 0; i < row; i++) {
            minRow[i] = matris[i][0];
        }
        func(matris, minRow);
    }
    // Satırlarda bulunan minimum değerlerin kontrol edilip minimum değerin güncellenmesi
    static void func(int[][] matrix, int[] minRow) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] < minRow[i]) {
                    minRow[i] = matrix[i][j];
                }
            }
        }
        // Minimum değerlere ait dizinin ekranda gösterilmesi
        System.out.println(Arrays.toString(minRow));
    }
}
