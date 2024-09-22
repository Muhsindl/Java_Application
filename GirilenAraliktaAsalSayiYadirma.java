import java.util.Scanner;

public class JavaApplication {
	public static void main(String args[]) {
		Scanner input=new Scanner(System.in);

		//Kullanıcıdan alt aralık sayısının alınması
		System.out.print("Küçük sayıyı giriniz: ");
		int mini=input.nextInt();

		//Kullanıcıdan üst aralık sayısının alınması
		System.out.print("Büyük sayıyı giriniz: ");
		int maxi=input.nextInt();
		
        //Aralıklar arasında ki asal sayının bulunması
		for(int i=mini; i<=maxi; i++) {
			int sayac=0;
			for(int j=2; j<i; j++) {
				if(i%j==0) {
					sayac=1;
				}
			}
            //Bulunan asal sayı veya sayıların ekrana yazdırılması
			if(sayac==0) {
				System.out.println("---------------");
				System.out.println("Asal Sayı: "+i);
			}
		}
	}
}
