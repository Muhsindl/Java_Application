import java.util.Scanner;
import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
	    Scanner input=new Scanner(System.in);
        // Kullanıcı tarafından girilen uzunlukta dizi oluşturulması
        System.out.println("Eleman sayısı gir: ");
        int eleman=input.nextInt();
        int [] dizi1=new int[eleman];
        int [] dizi2=new int[eleman];
        // İlk ve ikinci diziye kullanıcıdan eleman alınması
        for (int i = 0; i < eleman; i++) {
            System.out.println("1. Dizi için "+(i+1)+" nci eleman gir: ");
            dizi1[i]=input.nextInt();
            System.out.println("2. Dizi için "+(i+1)+" nci eleman gir: ");
            dizi2[i]=input.nextInt();
        }
        // Metot tarafından yapılan vektörel çarpımın ekrana yazdırılması
        System.out.println(""+Arrays.toString(vektorSkalerCarpim(dizi1,dizi2)));
	}
    // Vektörel çarpım yapan metots
    public static int [] vektorSkalerCarpim(int [] dizi1,int [] dizi2 ){
        int [] dizi=new int[dizi1.length];
            for (int i = 0; i < dizi1.length; i++) {
                dizi[i]=dizi1[i]*dizi2[i];
            }
        return dizi;
    }
}
