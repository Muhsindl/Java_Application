import java.util.Scanner;

public class AsalMi {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        // Kullanıcıdan alınan sayının asal olup olmadığını bulan program
        System.out.println("Sayı giriniz: ");
        int sayi=input.nextInt();
        int sayac=0;
        // 1 ve kendisi dışında bir sayıya bölünüyorsa asal değildir.
        for(int i=2;i<sayi;i++){
            if(sayi%i==0){
                sayac++;
            }
        }
        // Eğer sayac 0 ise asal sayıdır.
        if(sayac==0){
            System.out.println("Asal sayıdır.");
        }else{
            System.out.println("Asal değildir.");
        }
    }
}