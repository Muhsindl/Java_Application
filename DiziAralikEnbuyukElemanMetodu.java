import java.util.Scanner;
public class Main
{
    // Bir dizinin belirli bir aralıktaki en büyük elemanını bulan metot yazın.
	public static void main(String[] args) {
	    Scanner input=new Scanner(System.in);
        // Kullanıcıdan alt sınırın alınması
        System.out.print("Alt sınır giriniz: ");
        int alt=input.nextInt();
        // Kullanıcıdan üst sınırın alınması
        System.out.print("Üst sınır giriniz: ");
        int ust=input.nextInt();
        // Dizi eleman sayısının alınması
        System.out.println("Eleman sayısı giriniz: ");
        int eleman=input.nextInt();
        int dizi[]=new int[eleman];
        // Diziye eleman alınması ve hata kontorülü yapısı
        if(ust<alt || eleman==0){
            System.out.println("Hata!!");
        }else{
            for (int i = 0; i < eleman; i++) {
                System.out.println((i+1)+" nci eleman= ");
                dizi[i]=input.nextInt();
            }
            System.out.println("Maximum eleman: "+enBuyukEleman(dizi,alt,ust));
        }
	}
    // Dizide bulunan belirli aralıkta ki en büyük sayıyı döndüren metot
    public static int enBuyukEleman(int matrix[],int alt,int ust){
        int max=matrix[0];
        for (int i = alt; i < ust; i++) {
            if(max<matrix[i]){
                max=matrix[i];
            }
        }
        return max;
    }
}
