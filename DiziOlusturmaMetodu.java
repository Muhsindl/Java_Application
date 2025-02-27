import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner input=new Scanner(System.in);
        // Kullanıcıdan eleman sayısının alınması
        System.out.println("Eleman sayısı giriniz: ");
        int n=input.nextInt();
        // dizi tanımlanması
        int [] dizi=new int[n];
        // Dizinin elemanlarının kullanıcıdan alınması
        for (int i = 0; i < n; i++) {
            System.out.println((i+1)+" nci Eleman giriniz: ");
            dizi[i]=input.nextInt();
        }
        fonk1(dizi);
	}
    // Kullanıcının girdiği diziyi ekranda gösyteren uygulama
    public static void fonk1(int dizi[]){
        for (int i = 0; i < dizi.length; i++) {
            System.out.printf("%d nci eleman= %d",i,dizi[i]);
            System.out.println("");
        }
    }
}
