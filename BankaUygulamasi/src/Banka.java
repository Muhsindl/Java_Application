public class Banka {

    private int iban;
    private String name;
    double ammount;

    public Banka(){

    }
    public Banka(int iban, String name, double ammount){
        this.setIban(iban);
        this.setName(name);
        this.setAmmount(ammount);
    }
    public int getIban(){
        return iban;
    }
    public void setIban(int iban){
        this.iban=iban;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmmount() {
        return ammount;
    }

    public void setAmmount(double ammount) {
        this.ammount = ammount;
    }
}
