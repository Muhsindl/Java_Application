import java.util.Scanner;

public class JavaApplication {
	public static void main(String args[]) {
		Scanner input=new Scanner(System.in);
		//Kullanıcıdan sayı alınması
		System.out.println("Sayı giriniz: ");
		int sayi=input.nextInt();
		float result=1;
		// Sayı 10'dan büyük ise faktoriyeli hesaplanır
		if(sayi>=10) {
			for (int i = 2; i <= sayi; i++) {
				result*=i;
			}
		}
		// Sayı 10'dan küçük ise 10 katı alınır sayının
		else {
			result=sayi*10;
		}
		// Sonucun ekranda gösterilmesi
		System.out.println("CEVAP: "+result);
		
	}
}
