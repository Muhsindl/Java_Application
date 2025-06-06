// Matris yedek köşegen eleman toplamı

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Kullanıcı tarafından kare matris eleman sayısının alınması
        System.out.println("Eleman sayısı: ");
        int eleman = input.nextInt();
        
        // Kullanıcı tarafından girilen eleman sayısında kare matris oluşturulması
        int[][] matris = new int[eleman][eleman];
        // Random sınıfını kullanarak kare matrise 0-100 aralığında eleman atanması
        for (int i = 0; i < eleman; i++) {
            for (int j = 0; j < eleman; j++) {
                System.out.println("("+i+","+j+") nci elemanı giriniz: ");
                matris[i][j] = input.nextInt();
            }
        }
        System.out.println("----------------- Matris -----------------");
        // Matris ekrana yazdırılması
        for (int i = 0; i < eleman; i++) {
            for (int j = 0; j < eleman; j++) {
                System.out.print(matris[i][j] + "\t");
            }
            System.out.println();
        }
        // Matrisin fonksiyona gönderilmesi
        func(matris);
    }
    // Yedek köşegeni toplayan matris fonksiyonu
    static void func(int[][] matrix) {
        int toplam = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i + j == matrix.length - 1) {
                    toplam += matrix[i][j];
                }
            }
        }
        System.out.println("Toplam: " + toplam);
    }
}