import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner input=new Scanner(System.in);
        // Kullanıcıdan eleman sayısının alınması
        System.out.println("Eleman sayısı giriniz: ");
        int n=input.nextInt();
        // Kullanıcıdan diziye eleman alınması
        int [] dizi=new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println((i+1)+" nci Eleman giriniz: ");
            dizi[i]=input.nextInt();
        }
        fonk4(dizi);
	}
    // Dizi elemanlarını toplayıp ekrana yazdıran metot
    public static void fonk4(int dizi[]){
        int toplam=0;
        for (int i = 0; i < dizi.length; i++) {
            toplam+=dizi[i];
        }
        System.out.print("Toplam: "+toplam);
    }
}
