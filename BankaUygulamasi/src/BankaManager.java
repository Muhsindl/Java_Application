public class BankaManager {
    // Banka nesnesi oluşturulması
    Banka banka1=new Banka();
    // Behrivour (Davranış) olaylarının yapılması
    public void paraGonder(double para){
        banka1.ammount=banka1.ammount+para;
    }
    public double bakiyeSorgula(){
        return banka1.getAmmount();
    }

}
