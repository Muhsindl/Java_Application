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
        // Recursive metot dan gelen değerin ekranda gösterilmesi
        System.out.println(hesapla(dizi));
    }
    // Dizi ve indis değerinin recursive metota gönderilmesi
    static int hesapla(int [] array){
        return hesaplaYardimci(array,0);
    }
    // Dizi elemanını toplayıp indis değerinin arttırılması ve indis değeri dizi uzunluğuna eşit olduğu zaman geri döndürülmesi
    static int hesaplaYardimci(int[] n, int indis){
        if(n.length== indis){
            return 0;
        }else{
            return n[indis]+hesaplaYardimci(n,indis+1);
        }
    }
}
