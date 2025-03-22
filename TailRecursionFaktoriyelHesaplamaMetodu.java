import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        // Kullanıcı tarafından sayı girilmesi
        System.out.print("Sayı giriniz: ");
        int n=input.nextInt();
        // Tail recursive metoda girilen değerin gönderilmesi
        System.out.println(fun(n));
    }
    // Faktoriyel hesabı yapılması için metoda sayaç ile birlikte n değerinin gönderilmesi
    static int fun(int n){
        return funHelp(n,1);
    }
    // Faktoriyel hesabının yapılması
    static int funHelp(int n,int carp){
        if(n==0){
            return carp;
        }else{
            return n*funHelp(n-1,carp);
        }
    }
}
