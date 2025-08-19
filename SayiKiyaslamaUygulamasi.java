import java.util.Scanner;

public class SayiKiyaslamaUygulamasi {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen 1.sayı giriniz");
        int sayi1=input.nextInt();
        System.out.println("Lütfen 2.sayı giriniz");
        int sayi2=input.nextInt();
        System.out.println("Lütfen 3.sayı giriniz");
        int sayi3=input.nextInt();
        if (sayi1>sayi2 && sayi1>sayi3){
            System.out.println("En büyük sayı "+sayi1);
        }else if(sayi2>sayi1 && sayi2>sayi3){
            System.out.println("En büyük sayı "+sayi2);
        }else if(sayi3>sayi2 && sayi3>sayi1){
            System.out.println("En büyük sayı "+sayi3);
        }else{
            System.out.println("Belirli büyük sayı yoktur");
        }
    }
}
