public class BankaManager {
    Banka banka1=new Banka();
    public void paraGonder(double para){
        banka1.ammount=banka1.ammount+para;
    }
    public double bakiyeSorgula(){
        return banka1.getAmmount();
    }

}
