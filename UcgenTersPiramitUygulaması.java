import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {

    Scanner input=new Scanner(System.in);
    
    // Kullanıcıdan uzunluk bilgisi alıyoruz.
    System.out.print("Uzunluk giriniz: ");
    int n=input.nextInt();

    for (int i = 0; i < n; i++) {
          // Boşluk yerleştirir
          for (int j = 0; j < i; j++) {
              System.out.print(" ");
          }
          // Yıldız yerleştirir
          for (int k = 0; k < 2*n-(2*i+1); k++) {
              System.out.print("*");
          }
      System.out.println();
      }
	}
}
