import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        // Kullanıcıdan sınır değerinin alınması
        System.out.print("Sınır değeri giriniz: ");
        int sinirDeger=input.nextInt();
        // Kullanıcıdan alınan değerin fonksiyona gönderilmesi
        System.out.println(fun(sinirDeger));
    }
    // Tail recursion yapısı için yardımcı bir fonksiyon oluşturup hem kullanıcıdan alınan değeri hemde sayacı(0) recursive yapıya gönderilmesi
    static int fun(int n){
        return funHelp(n,0);
    }
    // Recursive yapı ile toplama hesaplamasının yapılması
    static int funHelp(int n,int top){
        if(n==0){
            return top;
        }else{
            return top+funHelp(n-1,n);
        }
    }
}
