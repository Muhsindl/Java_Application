public class Main {
    public static void main(String[] args) {
        // Banka nesnesi oluşturulması ve attribute'ların set edilmesi
        Banka banka=new Banka();
        banka.setIban(123456);
        banka.setName("Muhsin DOLU");
        // BankaManager sınıfı nesnesi ile behrivour işlemlerinin yapılması
        BankaManager bankaManager=new BankaManager();

        bankaManager.paraGonder(1500);
        System.out.println("İlk gönderi sonucu  bakiye: "+bankaManager.bakiyeSorgula());
        
        bankaManager.paraGonder(800);
        System.out.println("İkinci gönderi sonucu  bakiye: "+bankaManager.bakiyeSorgula());

    }
}
