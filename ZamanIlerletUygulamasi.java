public class Main {

    public static void main(String[] args) {
        while (true) {     
            try {
                // Saat, dakika, saniye, gün,ay,yıl olarak değer girilmesi
                System.out.println(takvim(12, 48, 52, 14, 3, 2025));
                // 1 saniye bekleme yapılıp saniye arttırılması
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
    // Takvim metodu 
    static String takvim(int saat, int dakika, int saniye, int gun, int ay, int yil) {
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
        if (gun == 31) {
            gun = 1;
            ay++;
        }
        if (ay == 13) {
            ay = 1;
            yil++;
        }

        return String.format("%02d:%02d:%02d - %02d/%02d/%04d", saat, dakika, saniye, gun, ay, yil);
    }
}
