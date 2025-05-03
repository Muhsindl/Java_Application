//Matris köşegenini istenilen sayı yapan uygulama

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
        
        //Kullanıcıdan elemanların alınması
        for (int i = 0; i < eleman; i++) {
            for (int j = 0; j < eleman; j++) {
                System.out.println("("+(i)+","+(j)+") Elemanı giriniz: ");
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
        // Kullanıcıdan köşene verilmesi istenilen değerlerin alınması
        System.out.println("İstenilen sayıyı giriniz: ");
        int sayi=input.nextInt();

        // Metota matrisin ve sayının gönderilmesi
        func(matris,sayi);
    }
    // Matrisin köşegenlerini sıfır yapan  metot
    static void func(int[][] matrix,int sayi) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i + j == matrix.length - 1 || i==j) {
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
