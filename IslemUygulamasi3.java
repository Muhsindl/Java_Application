import java.util.Scanner;

public class JavaApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // ∑i=0 carp*i+topla denklemi çözümü
        
        // Kullanıcıdan eleman alınması
        System.out.println("Eleman giriniz: ");
        int n=input.nextInt();
        
        //Çarpılacak eleman girilmesi
        System.out.println("Çarpılacak eleman giriniz: ");
        int carp=input.nextInt();
        
        //Toplanacak eleman girilmesi
        System.out.println("Toplanacak eleman giriniz: ");
        int topla=input.nextInt();
        
        //Hesaplamanın yapılması ∑i=0 5*i+6 denklemine göre
        int toplam=0;
        for(int i=0;i<=n;i++) {
        	toplam+=(carp*i)+topla;
        }
        //Sonucun ekranda gösterilmesi
        System.out.println("∑i=0 "+carp+" *i+ "+topla+" denklemine göre "+" 0-"+n+" arasında ki elemanların sonucu= "+toplam);
    }
}