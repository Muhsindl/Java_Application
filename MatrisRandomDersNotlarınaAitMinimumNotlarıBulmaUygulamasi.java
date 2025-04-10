import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan ders sayısının alınması
        System.out.println("Ders sayısı gir: ");
        int col = input.nextInt();

        // Kullanıcıdan öğrenci sayısının alınması
        System.out.println("Öğrenci sayısı gir: ");
        int row = input.nextInt();

        int[][] matris = new int[row][col];
        Random r = new Random();

        // Her öğrencinin aldığı derse ait rastgele not atanması
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matris[i][j] = r.nextInt(101); // 0-100 arasında rastgele not
            }
        }

        // Notların ekranda gösterilmesi (Sütunlar ders, satırlar öğrenciyi temsil eder)
        System.out.println("Öğrencilerin ders notları:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matris[i][j] + "\t");
            }
            System.out.println();
        }

        // Minimum notları bulma
        int[] minNot = new int[col]; // Ders sayısına göre boyutlandırılan dizi

        // Başlangıçta her dersin ilk notunu minimum olarak kabul ediyoruz
        for (int j = 0; j < col; j++) {
            minNot[j] = matris[0][j];
        }

        // Her dersin minimum notunu bulma
        for (int j = 0; j < col; j++) {
            for (int i = 1; i < row; i++) {
                if (matris[i][j] < minNot[j]) {
                    minNot[j] = matris[i][j];
                }
            }
        }

        // Her ders için minimum notları ekrana yazdırma
        System.out.println("Her ders için minimum notlar:");
        System.out.println(Arrays.toString(minNot));
    }
}
