import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Random r = new Random();
        // Kullanıcıdan eleman sayısının alınması
        System.out.println("Uzunluk giriniz: ");
        int n=input.nextInt();
        // Kullanıcı tarafından girilen eleman sayısında dizi oluşturulması
        int[] dizi = new int[n];
        for (int i = 0; i < n; i++) {
            dizi[i] = r.nextInt(101); // 0-100 aralığında random sayıların diziye atanması
        }

        // Diziyi düzgün şekilde yazdırma
        System.out.print("Dizi = [");
        for (int i = 0; i < n; i++) {
            System.out.print(dizi[i]);
            if (i < n - 1) {  // Son elemandan önce ' - ' eklenmesin
                System.out.print(" - ");
            }
        }
        System.out.println("]");

        // En küçük elemanı bulma
        int minElem = dizi[0];
        System.out.println("\nEn küçük eleman: " + fun(dizi, minElem));
    }
    // Recursive fonksiyona dizi ve minimum eleman olarak başlangıçta ki ilk elemanın gönderilmesi
    static int fun(int[] array, int min) {
        return funHelp(array, 0, min);
    }
    // Recursive olarak minimum elemanın bulunması
    static int funHelp(int[] array, int i, int min) {
        if (i == array.length) {
            return min;  // Dizinin sonuna geldiysen, min'i döndür
        }
        if (array[i] < min) {
            min = array[i];  // Eğer mevcut eleman min'den küçükse, min'i güncelle
        }
        return funHelp(array, i + 1, min);  // Bir sonraki elemana geç
    }
}
