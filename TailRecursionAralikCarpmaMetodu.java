import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        // Kullanıcıdan alt sınır alınması
        System.out.print("Alt sınır giriniz: ");
        int ilk=input.nextInt();
        // Kullanıcıdan üst sınır alınması
        System.out.print("Üst sınır giriniz: ");
        int ust=input.nextInt();
        //Fonksiyona alt ve üst sınırın gönderilmesi
         System.out.print(fun(ust,ilk));
    }
    // Yardımcı recursive fonksiyona alt değer üst değer ve çarpım değerinin gönderilmesi
    static int fun(int ust, int ilk){
        return funHelp(ust,ilk,1);
    }
    // Recursive yapıda aralık değerlerinin çarpımının hesaplanması
    static int funHelp(int ust, int ilk, int carp){
        if(ust<ilk){
            return carp;
        }else{
            return funHelp(ust-1,ilk,carp*ust);
        }
    }
}
