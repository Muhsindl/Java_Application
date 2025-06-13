import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner input=new Scanner(System.in);
        
        // Kullanıcıdan palindrom olarak sorgulanacak uygulamanın girilmesi
	    System.out.print("Palindrom olarak sorgulamak istediğiniz ifadeyi giriniz: ");
	    String ifade=input.nextLine();

	    // Kullanıcıdan alınan ifadenin palindrom metoduna gönderilmesi ve sorgusunun gerçekleştirilmesi
	    palindrom(ifade);
	}

    // Palindrom hesaplamasının yapan metot
    static void palindrom(String text) {
        int sayac = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == text.charAt(text.length() - i - 1)) {
                sayac++;
            }
        }
        if (sayac == text.length()) {
            System.out.println("Bu bir palindrom ifadedir");
        } else {
            System.out.println("Palindrom DEĞİLDİR!!! ");
        }
    }
}
