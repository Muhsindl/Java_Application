import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner input=new Scanner(System.in);
        // Kullanıcıdan satır sayısının alınması
        System.out.println("Satır sayısı: ");
        int satir=input.nextInt();
        // Kullanıcıdan sütun sayısının alınması
        System.out.println("Sütun sayısı: ");
        int sutun=input.nextInt();
        // Kullanıcı tarafından girilen satır ve sütun sayılarına sahip büyüklükte matris oluşturulması
        int matris[][]=new int[satir][sutun];
        // Matrise elemanların alınması
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                System.out.println("Eleman gir: ");
                matris[i][j]=input.nextInt();
            }
        }
        // Matriste bulunan en küçük elemanın ekranda gösteren metot
        System.out.println("En küçük eleman: "+enKucukElemanMatris(matris));
	}
    // Matris de ki en küçük elemanı bulan metot
    public static int enKucukElemanMatris(int[][]matrix){
        int min=matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j]<min){
                    min=matrix[i][j];
                }
            }
        }
        return min;
    }
}
