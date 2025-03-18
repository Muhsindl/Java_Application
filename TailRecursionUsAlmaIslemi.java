import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);,
        // Kullanıcıdan üst'ü sayı girilmesi
        System.out.print("Üstü alınacak sayı giriniz: ");
        int ust=input.nextInt();
        // Kullanıcıdan üs olarak alınacak sayı girilmesi
        System.out.print("Üs işlemi için sayı giriniz: ");
        int us=input.nextInt();
        System.out.println(hesapla(ust, us));
    }

    static int hesapla(int n, int ust) {
        return hesaplaHelp(n, ust, 0, 1);
    }

    static int hesaplaHelp(int n, int ust, int i, int result) {
        if (i == ust) {
            return result;
        } else {
            return hesaplaHelp(n, ust, i + 1, result * n);
        }
    }
}
