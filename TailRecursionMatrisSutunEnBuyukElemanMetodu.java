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
        // Sütunlardaki en büyük elemanları saklayacak dizi
        int [] maxCol=new int[sutun];
        for (int i=0;i<sutun ;i++ ){
            maxCol[i]=matris[0][i];
        } 
        // Sonuçları yazdırma
        System.out.println(Arrays.toString(fun(matris, maxCol)));
    }
    // Recursive fonksiyona matris indis ve maxCol dizisinin gönderilmesi
    static int[] fun(int[][] matrix, int[] maxCol) {
        return funHelp(matrix, 0, maxCol);
    }
    
    static int[] funHelp(int[][] matrix, int i, int[] maxCol) {
        // Sütundaki en büyük değeri bulmak için
        if (i == matrix.length) {
            return maxCol;  // Tüm satırlar kontrol edildiyse, maxCol dizisini döndür
        }

        // Her sütundaki elemanları karşılaştır
        for (int j = 0; j < matrix[0].length; j++) {
            if (matrix[i][j] > maxCol[j]) {
                maxCol[j] = matrix[i][j];  // Eğer mevcut değer maxCol'dan büyükse, güncelle
            }
        }

        // Bir sonraki satıra geç
        return funHelp(matrix, i + 1, maxCol);
    }
}
