import java.util.Scanner;

public class JavaApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Kullanıcıdan alınan sınır değeri kadar serinin toplamını hesaplayan program
        System.out.println("Sınır değeri giriniz: ");
        int sinir = input.nextInt();

        double toplam = 0; 
        int sayac = 0;
        // 1-1/3+1/5-1/7 ... hesaplamasının yapıldığı kısım
        for (int i = 1; i < ((2 * sinir) + 1); i += 2) { // yalnızca tek sayıları almak için i += 2
        	// sayac değeri çift ise
            if (sayac % 2 == 0) {
                toplam += 1.0 / i;
            }
            // sayac değeri tek ise
            else {
                toplam -= 1.0 / i;
            }
            sayac++;
        }
        // Sonuç ekrana yazdırılır
        System.out.println("Sonuç: " + toplam);
    }
}
