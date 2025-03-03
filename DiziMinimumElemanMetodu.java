import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner input=new Scanner(System.in);
        // Kullanıcı tarafından dizi uzunluğunun alınması
        System.out.println("Eleman sayısı giriniz: ");
        int n=input.nextInt();
        int [] dizi=new int[n];
        // Diziye belirtilen uzunlukta eleman alınması
        for (int i = 0; i < n; i++) {
            System.out.println((i+1)+" nci Eleman giriniz: ");
            dizi[i]=input.nextInt();
        }
        // Metot tarafından döndürülen değerin ekranda gösterilmesi
        System.out.println("minimum: "+fonk6(dizi));
	}
    // Dizinin minimum elemanını döndüren metot
    public static int fonk6(int dizi[]){
        int min=dizi[0];
        for (int i = 0; i < dizi.length; i++) {
            if(dizi[i]<min){
                min=dizi[i];
            }
        }
        return min ;
    }
}
