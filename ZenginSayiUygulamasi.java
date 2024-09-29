import java.util.Scanner;

public class JavaApplication {
	public static void main(String args[]) {
		Scanner input=new Scanner(System.in);
        // Kullanıcıdan sayı alınması
		System.out.println("Sayı giriniz: ");
		int sayi=input.nextInt();
		int bolen=0;
        // Sayının sayının tam bölenlerinin hesaplanması
		for(int i=1;i<sayi;i++) {
			if(sayi%i==0) {
				bolen+=i;
			}
		}
        // Kendisi hariç bölenlerinin toplamı sayıdan büyük ise Abundant ("Zengin sayıdır").
		if(bolen>sayi) {
			System.out.println(bolen+" > "+sayi+" bu sebeple Güçlü sayıdır(Abundant)");
		}else {
			System.out.println(bolen+">"+sayi+" bu sebeple Güçsüz sayıdır(Deficient)");
		}
	}
}