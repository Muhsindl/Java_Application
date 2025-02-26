import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner input=new Scanner(System.in);
        // Kullanıcıdan sayı alınması 1-... kadar
        System.out.println("Sayı giriniz: ");
        int n=input.nextInt();
        // Fonksiyona değişken atanması
        float sonuc=fonk1(n);
        //Fonksiyon sonucunun ekrana yazılması
        System.out.println("Sonuç"+sonuc);
	}
    // 1'den girilen sayıya kadar ortalama hesaplaması yapan metot
    public static float fonk1(int n){
        int toplam=0;
        for (int i = 1; i <= n; i++) {
            toplam+=i;
        }
        float ort=toplam/n;
        return ort;
    }
}
