//Matris köşegenini 0 sayısı yapma

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Kullanıcıdan eleman sayısının alınması
        System.out.println("Eleman sayısı: ");
        int eleman = input.nextInt();
        // Random sınıfından nesne oluşturulması
        Random r = new Random();
        // Girilen eleman sayısına göre kare matris oluşturulması
        int[][] matris = new int[eleman][eleman];
        for (int i = 0; i < eleman; i++) {
            for (int j = 0; j < eleman; j++) {
                // 0-100 Aralığında random tam sayı atanması dizi elemanı olarak
                matris[i][j] = r.nextInt(101); 
            }
        }
        // Matrisin ekrana yazdırılması
        System.out.println("-----------------Matris-----------------");
        for (int i = 0; i < eleman; i++) {
            for (int j = 0; j < eleman; j++) {
                System.out.print(matris[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("-***************************************-");
        // Metota matrisin gönderilmesi
        func(matris);
    }
    // Matrisin köşegenlerini sıfır yapan  metot
    static void func(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i + j == matrix.length - 1 || i==j) {
                    matrix[i][j] = 0;
                }
            }
        }
        // Güncellenmiş matrisin ekrana yazdırılması
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
