import java.util.Scanner;

public class JavaApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // ∑i=0 5*i+6 denklemi çözümü
        
        // Kullanıcıdan eleman alınması
        System.out.println("Eleman giriniz: ");
        int n=input.nextInt();
        //Hesaplamanın yapılması ∑i=0 5*i+6 denklemine göre
        int toplam=0;
        for(int i=0;i<=n;i++) {
        	toplam+=(5*i)+6;
        }
        //Sonucun ekranda gösterilmesi
        System.out.println("∑i=0 5*i+6 denklemine göre"+" 0 -"+n+" arasında ki elemanların sonucu= "+toplam);
    }
}
