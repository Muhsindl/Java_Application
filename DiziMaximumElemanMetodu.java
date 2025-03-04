import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner input=new Scanner(System.in);
        // Kullanıcıdan dizi için eleman sayısının alınması
        System.out.println("Eleman sayısı giriniz: ");
        int n=input.nextInt();
        int [] dizi=new int[n];
        // Diziye eleman eklenmesi
        for (int i = 0; i < n; i++) {
            System.out.println((i+1)+" nci Eleman giriniz: ");
            dizi[i]=input.nextInt();
        }
        // Metot tarafından döndürülen maximum elemanın gösterilmesi
        System.out.println("maximum: "+fonk(dizi));
	}
    // Maksimum eleman döndüren metot
    public static int fonk(int dizi[]){
        int max=dizi[0];
        for (int i = 0; i < dizi.length; i++) {
            if(dizi[i]>max){
                max=dizi[i];
            }
        }
        return max ;
    }
}
