import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner input=new Scanner(System.in);
        // Eleman sayısının kullanıcıdan alınması
        System.out.print("Vektörler için eleman sayısı gir:");
        int n=input.nextInt();
        int [] dizi1=new int[n];
        int [] dizi2=new int[n];
        // İlk dizi için elemanların kullanıcıdan alınması
        for (int i = 0; i < n; i++) {
            System.out.println("Dizi 1 için Eleman gir: ");
            dizi1[i]=input.nextInt();
            
        }
        // İkinci dizi için elemanların kullanıcıdan alınması
        for (int i = 0; i < n; i++) {
            System.out.println("Dizi 2 için Eleman gir: ");
            dizi2[i]=input.nextInt();
            
        }
        // Metot tarafından döndürülen dizinin toplamının ekranda gösterilmesi
        System.out.println("-----------------------");
        for (int i = 0; i < dizi1.length; i++) {
            System.out.println(fonk8(dizi1,dizi2)[i]);
        }
	}
        // İki diziyi toplana metot
        public static int[] fonk8(int dizi1[], int dizi2[]){
            int [] toplamDizi=new int[dizi1.length];
            for (int i = 0; i < dizi1.length; i++) {
                toplamDizi[i]=dizi1[i]+dizi2[i];
            }
            return toplamDizi;
        }
}
