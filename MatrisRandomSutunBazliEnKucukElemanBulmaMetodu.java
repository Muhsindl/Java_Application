import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan satır ve sütun sayısının alınması
        System.out.print("Satır sayısı: ");
        int row = input.nextInt();
        System.out.print("Sütun sayısı: ");
        int col = input.nextInt();

        // Random sınıfı ile 0-100 arasında rastgele değerler üretilecek
        Random r = new Random();

        // Matrisin tanımlanması
        int[][] matris = new int[row][col];

        // Matrisin rastgele değerlerle doldurulması
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matris[i][j] = r.nextInt(101); // 0 ile 100 arası
            }
        }

        // Matrisin ekrana yazdırılması
        System.out.println("\n--------- Matris ---------");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matris[i][j] + "\t");
            }
            System.out.println();
        }

        // Sütunlara ait minimum değerleri hesaplayan metot
        int[] minCol = findMinOfColumns(matris);

        // Sonuçların yazdırılması
        System.out.println("\nSütun bazlı minimum değerler: ");
        System.out.println(Arrays.toString(minCol));
    }

    // Sütun bazlı minimum değerleri bulan metod
    static int[] findMinOfColumns(int[][] matrix) {
        int rowCount = matrix.length;
        int colCount = matrix[0].length;

        int[] minCol = new int[colCount];

        // Başlangıçta her sütunun ilk satır elemanı minimum kabul edilir
        for (int j = 0; j < colCount; j++) {
            minCol[j] = matrix[0][j];
        }

        // Diğer satırlardaki değerlerle karşılaştırma yapılır
        for (int i = 1; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                if (matrix[i][j] < minCol[j]) {
                    minCol[j] = matrix[i][j];
                }
            }
        }

        return minCol;
    }
}
