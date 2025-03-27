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
        // Satırlardaki en küçük elemanları saklayacak dizi
        int [] minRow=new int[satir];
        for (int i=0;i<satir ;i++ ){
            minRow[i]=matris[i][0];
        } 
        // Sonuçları yazdırma
        System.out.println(Arrays.toString(fun(matris, minRow)));
    }
    // Recursive fonksiyona matris indis ve minSatir dizisinin gönderilmesi
    static int[] fun(int[][] matris, int[] minRow) {
            return funHelp(matris, 0, minRow);
        }
    // Recursive fonksiyon olarak satırlarda ki minimum elemanın bulunup diziye atanması
    static int[] funHelp(int[][] matrix, int i, int[] minRow) {
        if (matrix[0].length == i) {
            return minRow;
        }
        for (int j = 0; j < matrix.length; j++) {
            if (minRow[i] > matrix[i][j]) {
                minRow[i] = matrix[i][j];
            }

        }
        return funHelp(matrix, i + 1, minRow);
    }
}

