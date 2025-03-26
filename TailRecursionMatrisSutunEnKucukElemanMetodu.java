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
        // Sütunlardaki en küçük elemanları saklayacak dizi
        int [] minCol=new int[sutun];
        for (int i=0;i<sutun ;i++ ){
            minCol[i]=matris[0][i];
        } 
        // Sonuçları yazdırma
        System.out.println(Arrays.toString(fun(matris, minCol)));
    }
    // Recursive fonksiyona matris indis ve minSutun dizisinin gönderilmesi
    static int[] fun(int[][] matrix, int[] minCol) {
        return funHelp(matrix, 0, minCol);
    }
    
    static int[] funHelp(int[][] matrix, int i, int[] minCol) {
        // Sütundaki en küçük değeri bulmak için
        if (i == matrix.length) {
            return minCol;  // Tüm satırlar kontrol edildiyse, minCol dizisini döndür
        }

        // Her sütundaki elemanları karşılaştır
        for (int j = 0; j < matrix[0].length; j++) {
            if (matrix[i][j] < minCol[j]) {
                minCol[j] = matrix[i][j];  // Eğer mevcut değer minCol'dan küçükse, güncelle
            }
        }

        // Bir sonraki satıra geç
        return funHelp(matrix, i + 1, minCol);
    }
}
