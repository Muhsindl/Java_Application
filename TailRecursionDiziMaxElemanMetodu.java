import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        // Kullanıcıdan dizi boyutu için eleman sayısının alınması
        System.out.println("Eleman Sayısı giriniz: ");
        int n=input.nextInt();
        int[] dizi=new int[n];
        // Girilen eleman sayısı kadar elemanların diziye eklenmesi
        for (int i=0;i<n;i++){
            System.out.println((i+1)+" \'nci eleman giriniz: ");
            dizi[i]=input.nextInt();
        } 
        // En büyük elemanın ekranda gösterilmesi
        System.out.println("En büyük eleman: " + fun(dizi));
    }
    // Yardımcı fonksiyona dizi indis ve varsayılan olarak en büyük elemanın gönderilmesi(Dizinin ilk elemanı)
    static int fun(int[] dizi) {
        return funHelp(dizi, 0, dizi[0]);
    }
    // Maximum eleman hesaplama metodu recursive olarak
    static int funHelp(int[] dizi, int i, int max) {
        if (dizi.length == i) {
            return max;
        } else {
            if (max < dizi[i]) {
                max = dizi[i];
            }
        }
        return funHelp(dizi, i + 1, max);
    }
}
