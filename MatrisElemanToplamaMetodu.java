import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner input=new Scanner(System.in);
        // Kullanıcıdan matris için satır sayısının alınması
        System.out.println("Satır sayısı: ");
        int satir=input.nextInt();
        // Kullanıcıdan matris için sütun sayısının alınması
        System.out.println("Sütun sayısı: ");
        int sutun=input.nextInt();
        // Matris oluşturulması
        int matris[][]=new int[satir][sutun];
        // Matrise eleman alınması
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                System.out.println("Eleman gir: ");
                matris[i][j]=input.nextInt();
            }
        }
        // Matriste bulunan elemanları toplayan fonksiyonun sonucunun ekranda gösterilmesi
        System.out.println("Eleman Toplamı: "+matrisTopla(matris));
	}
    // Matriste bulunan elemanları toplayan fonksiyon
    public static int matrisTopla(int matrix[][]){
        int toplam=0;
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix.length; j++) {
                    toplam+=matrix[i][j];
                }
            }
        return toplam;
    }
}
