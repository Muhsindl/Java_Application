import java.util.Scanner;

public class JavaApplication {
	public static void main(String args[]) {
		Scanner input=new Scanner(System.in);
        //Kullanıcıdan sınır alınması
		System.out.println("Sınır giriniz: ");
		int sinir=input.nextInt();
        // Fibonacci sayı döngüsü:  0-1-1-2-3-5-8-13-21-44 ...
		int n1=0;
		int n2=1;
		int n3=n1+n2;
		System.out.print(n1+"-"+n2);
        
        //Sayı döngüsünün geriye kalan rakalarının önceki iki basamak ile toplanarak hesaplanması
		for(int i=0; i<=sinir-3;i++) {
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.print("-"+n3);
		}
	}
}