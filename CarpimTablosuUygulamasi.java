import java.util.Scanner;

public class JavaApplication {
	public static void main(String args[]) {
		Scanner input=new Scanner(System.in);
		System.out.println("Alt sınır giriniz: ");
		int altSinir=input.nextInt();
		System.out.println("Üst sınır giriniz: ");
		int ustSinir=input.nextInt();
		
		for(int i=altSinir; i<=ustSinir; i++) {
			System.out.println(altSinir+"x"+i+"="+altSinir*i);
		}
	}
}