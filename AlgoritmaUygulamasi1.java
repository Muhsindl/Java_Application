import java.util.Scanner;

public class JavaApplication {
	public static void main(String args[]) {
		Scanner input=new Scanner(System.in);
		//Kullanıcıdan sayı alınması
		System.out.println("Kullanıcıdan sayı alınması: ");
		int sayi=input.nextInt();
		int result=1;
        //Eğer bu sayı 5'ten büyük ise sayının faktoriyeli hesaplanır
		if(sayi>5) {
			for(int i=1; i<=sayi;i++) {
					result=result*i;
			}
		}
        // Eğer sayı 5'ten küçük ise sayının bir eksiği alıarak 2 ye bölünür ve en yakın sayıya yuvarlanır
        else {
			result=(sayi-1)/2;
		}
        //Kullanıcının ekranına çıktı göstermesi
		System.out.println("Cevap: "+result);
	}
}
