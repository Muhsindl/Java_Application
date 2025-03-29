import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        // Satır sayısının kullanıcıdan alınması
        System.out.println("Satır sayısı giriniz: ");
        int satir=input.nextInt();
        // Sütun sayısının kullanıcıdan alınması
        System.out.println("Sütun sayısı giriniz: ");
        int sutun=input.nextInt();
        // Girilen Satır ve Sütun sayısına sahip matris oluşturulması 
        int[][] matris = new int[satir][sutun];
        // Oluşturulan matris için elemanların alınması
        for (int i=0;i<satir ;i++ ){
            for (int j=0; j<sutun; j++ ){
                System.out.println((i)+","+(j)+" nci eleman giriniz: ");
                matris[i][j]=input.nextInt();
            } 
        } 
        // Satırlardaki en büyük elemanları saklayacak dizi
        int [] maxRow=new int[satir];
        for (int i=0;i<satir ;i++ ){
            maxRow[i]=matris[i][0];
        } 
        // Sonuçları yazdırma
        System.out.println(Arrays.toString(fun(matris, maxRow)));
    }
    // Recursive fonksiyona matris indis ve maxSatir dizisinin gönderilmesi
    static int[] fun(int[][] matris, int[] maxRow) {
            return funHelp(matris, 0, maxRow);
        }
    // Recursive fonksiyon olarak satırlarda ki maximum elemanın bulunup diziye atanması
    static int[] funHelp(int[][] matrix, int i, int[] maxRow) {
        if (matrix[0].length == i) {
            return maxRow;
        }
        for (int j = 0; j < matrix.length; j++) {
            if (maxRow[i] < matrix[i][j]) {
                maxRow[i] = matrix[i][j];
            }

        }
        return funHelp(matrix, i + 1, maxRow);
    }
}

