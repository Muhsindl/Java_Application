public class Banka {
    // Attributes (Nitelik) tanımlanması 
    private int iban;
    private String name;
    double ammount;
    // Boş bir Constructor metot
    public Banka(){

    }
    // Constructor metot
    public Banka(int iban, String name, double ammount){
        this.setIban(iban);
        this.setName(name);
        this.setAmmount(ammount);
    }
    /*
    Getter-Setter metotları
     */
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
