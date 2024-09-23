import java.util.Scanner;

public class JavaApplication {
	public static void main(String args[]) {
		Scanner input=new Scanner(System.in);
		// Sayının kullanıcıdan alınması
		System.out.println("Sayı giriniz: ");
		String sayi=input.nextLine();
		int s=Integer.parseInt(sayi);

		int toplam=0;
        //Sayının basamak toplamının hesaplanması
		for(int i=0;i<sayi.length();i++) {
			toplam += Character.getNumericValue(sayi.charAt(i));
		}
        // Eğer sayı basamak toplamına bölünüyorsa harshad sayıdır bölünmüyosa değildir.
		if(s%toplam==0) {
			System.out.println("Sayı HARSHAD sayıdır. ");
		}else {
			System.out.println("Sayı HARSHAD sayı değildir. ");
		}
		
	}
}
