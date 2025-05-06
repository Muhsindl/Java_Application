//Matris yedek köşegenini istenilen sayı ile değiştiren uygulama

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Kullanıcıdan eleman sayısının alınması
        System.out.println("Eleman sayısı: ");
        int eleman = input.nextInt();

        // Girilen eleman sayısına göre kare matris oluşturulması
        int[][] matris = new int[eleman][eleman];

        for (int i = 0; i < eleman; i++) {
            for (int j = 0; j < eleman; j++) {
                System.out.println("("+i+","+j+") Sayıyı giriniz lütfen: ");
                matris[i][j] = input.nextInt(); 
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
        
        // Metota matrisin ve değiştirilmek istenilen sayının gönderilmesi
        System.out.println("Değiştirmek istediğiniz sayıyı giriniz lütfen: ");
        int sayi=input.nextInt();
        func(matris,sayi);
    }
    // Matrisin yedek köşegenlerini istenilen sayı ile değiştiren  metot
    static void func(int[][] matrix, int sayi) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i + j == matrix.length - 1) {
                    matrix[i][j] = sayi;
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
