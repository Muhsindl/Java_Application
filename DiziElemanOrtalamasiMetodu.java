import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
        // Kullanıcıdan eleman sayısının alınması
        System.out.println("Eleman sayısı giriniz: ");
        int n=input.nextInt();
        // Diziye eleman eklenmesi
        int [] dizi=new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println((i+1)+" nci Eleman giriniz: ");
            dizi[i]=input.nextInt();
        }
        fonk(dizi);
	}
    // Ortalama hesaplama metodu
    public static void fonk(int dizi[]){
        int toplam=0;
        for (int i = 0; i < dizi.length; i++) {
            toplam+=dizi[i];
        }
        float ort=toplam/dizi.length;
        System.out.println("Ortalama: "+ort);
    }
}
