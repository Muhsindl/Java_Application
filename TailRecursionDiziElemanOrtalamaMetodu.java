// Dizi eleman ortalama
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        // Dizi eleman sayısının kullanıcıdan alınması
        System.out.print("Eleman sayısı giriniz: ");
        int n=input.nextInt();
        // Kullanıcı tarafınan girilen uzunlukta dizi oluşturulması
        int [] dizi=new int[n];
        // Diziye elemanların eklenmesi
        for (int i=0;i<dizi.length;i++ ){
            System.out.print((i+1)+" \'nci Eleman: ");
            dizi[i]=input.nextInt();
        }
        // Fonksiyon tarafından döndürülen dizi ortalamasının ekrana yazdırılması
        System.out.println("Dizi eleman ortalaması: "+fun(dizi));
    }
    // Recursive fonksiyona dizi sayaç ve ort parametrelerinin gönderilmesi (Sayaç=0, ort=0) 
    static int fun(int []dizi){
        return funHelp(dizi,0,0);
    }
    // Recursive olarak ortalama hesabının yapılması
    static int funHelp(int []array, int i,int top){
        if(i==array.length){
            return top/array.length;
        }else{
            return funHelp(array,i+1,top+array[i]);
        }
    }
}
