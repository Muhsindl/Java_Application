import java.util.Scanner;
import java.util.Arrays;
public class Main
{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        // Bir matris her sütunun toplamını bulan metot
        System.out.println("Satır sayısı: ");
        int satir=input.nextInt();
        System.out.println("Sütun sayısı: ");
        int sutun=input.nextInt();
        // Matrise eleman alınması
        int matris[][]=new int[satir][sutun];
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                System.out.println("Eleman gir: ");
                matris[i][j]=input.nextInt();
            }
        }
        // Sütun toplamlarını hesapla
        int[] sonuc = matrisSutunTopla(matris);
        // Doğru şekilde yazdırılması metodun
        System.out.println("Cevap: " + Arrays.toString(sonuc));
    }
    // Matris sütun toplama için metot yazılması
    public static int [] matrisSutunTopla(int matrix[][]){
        int [] toplaMatris=new int[matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                toplaMatris[j]+=matrix[i][j];
            }
        }
        return toplaMatris;
    }
    
}
