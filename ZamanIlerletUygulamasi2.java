// Java programı: Kullanıcıdan saat, dakika, saniye, gün, ay, yıl bilgilerini alır
// ve bu zamanı her saniye bir saniye artırarak konsola yazdırır.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Kullanıcıdan tarih ve saat bilgilerini alma
        Scanner input = new Scanner(System.in);

        System.out.print("Saat giriniz: ");
        int saat = input.nextInt();

        System.out.print("Dakika giriniz: ");
        int dakika = input.nextInt();

        System.out.print("Saniye giriniz: ");
        int saniye = input.nextInt();

        System.out.print("Gün giriniz: ");
        int gun = input.nextInt();

        System.out.print("Ay giriniz: ");
        int ay = input.nextInt();

        System.out.print("Yıl giriniz: ");
        int yil = input.nextInt();

        // Tarih ve saat bilgisiyle zamanı ilerleten fonksiyonu çağır
        zamanIlerlet(saat, dakika, saniye, gun, ay, yil);
    }

    // Sadece saat, dakika ve saniyeyi ilerleten zaman fonksiyonu (overload edilmiş versiyon)
    static void zamanIlerlet(int saat, int dakika, int saniye) {
        while (true) {
            try {
                // Her döngüde saniyeyi bir artır
                saniye++;

                // Saniye 60 olduğunda dakikaya devret
                if (saniye == 60) {
                    saniye = 0;
                    dakika++;
                }

                // Dakika 60 olduğunda saate devret
                if (dakika == 60) {
                    dakika = 0;
                    saat++;
                }

                // Saat 24 olduğunda sıfırlanır (bir sonraki gün başlar ama burada gün bilgisi yok)
                if (saat == 24) {
                    saat = 0;
                }

                // Zamanı ekrana yazdır
                System.out.printf("%02d:%02d:%02d\n", saat, dakika, saniye);

                // 1 saniye beklet
                Thread.sleep(1000);

            } catch (InterruptedException e) {
                System.out.println("Hata: " + e.getMessage());
            }
        }
    }

    // Saat, dakika, saniye ile birlikte gün, ay ve yılı da ilerleten overload edilmiş versiyon
    static void zamanIlerlet(int saat, int dakika, int saniye, int gun, int ay, int yil) {
        while (true) {
            try {
                // Saniyeyi bir artır
                saniye++;

                if (saniye == 60) {
                    saniye = 0;
                    dakika++;
                }

                if (dakika == 60) {
                    dakika = 0;
                    saat++;
                }

                if (saat == 24) {
                    saat = 0;
                    gun++;
                }

                // Ay gün sayısı kontrolü: Basit bir kontrol (Tüm aylar 30 gün varsayılmış)
                if (gun > 30) {
                    gun = 1;
                    ay++;
                }

                if (ay > 12) {
                    ay = 1;
                    yil++;
                }

                // 1 saniye bekle
                Thread.sleep(1000);

            } catch (InterruptedException e) {
                System.out.println("Hata: " + e.getMessage());
            }

            // Güncel zamanı ve tarihi ekrana yazdır
            System.out.printf("%02d:%02d:%02d --- %02d/%02d/%04d\n", saat, dakika, saniye, gun, ay, yil);
        }
    }
}
