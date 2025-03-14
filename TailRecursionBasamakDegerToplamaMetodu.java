import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Sayı giriniz: ");
        int n=input.nextInt();
        System.out.println(hesapla(n));
    }
    static int hesapla(int n){
        return hesaplaYardimci(n,0);
    }
    static int hesaplaYardimci(int n, int i){
        if(n==0) return i;
        return hesaplaYardimci(n/10,i+(n%10));
    }
}
