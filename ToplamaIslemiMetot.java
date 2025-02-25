import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner input=new Scanner(System.in);
        // Kullanıcıdan ilk sayının alınması
        System.out.print("Sayı giriniz: ");
        float n=input.nextInt();
        // Kullanıcıdan ikinci sayının alınması
        System.out.print("Sayı giriniz: ");
        float m=input.nextInt();
        // Kullanıcıdan alınan sayıların metota gönderilmesi
        float sonuc=fonk1(n,m);
        System.out.println("Toplama sonucu: "+sonuc);
	}
    // Toplama işlemi yapan metot
    public static float fonk1(float a, float b){
        float result=a+b;
        return result;
    }
}
