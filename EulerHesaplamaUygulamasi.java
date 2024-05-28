import java.util.Scanner;

public class EulerHesaplamaUygulamasi {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Hesaplanacak sayı giriniz: ");
        int n=input.nextInt();
        double hesap=0;
        for (int i=0;i<n;i++){
            hesap+=(double)i/factorial(i);
        }
        System.out.println("Euler Hesabı: "+hesap);
    }
    public static double factorial(int n){
        if (n==0 || n==1){
            return 1;
        }else{
            return n*factorial(n-1);
        }
    }
}
