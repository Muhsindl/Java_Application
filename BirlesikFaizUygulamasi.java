import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan yatıralacak para miktarının alınması
        System.out.print("Ana para giriniz: ");
        double anaPara = input.nextDouble();

        // Zaman giridisinin alınması
        System.out.print("Zaman giriniz (Ay): ");
        int zamanAy = input.nextInt();

        //Faiz oranının alınması
        System.out.print("Faiz oranı giriniz (Yüzde olarak): ");
        double faizOrani = input.nextDouble();

        // Basit faiz hesaplama ve çıktı verilmesi
        double faizMiktari = (anaPara * zamanAy * faizOrani) / 100;
        System.out.println("Basit faiz hesabı ile hesaplanan faiz miktarı: " + faizMiktari);
        System.out.println("Toplam para: " + (anaPara + faizMiktari));
    }
}
