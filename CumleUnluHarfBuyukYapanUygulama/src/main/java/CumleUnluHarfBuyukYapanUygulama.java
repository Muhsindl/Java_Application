
import java.util.Scanner;

public class CumleUnluHarfBuyukYapanUygulama {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Kullanıcıdan cümle alınması
        System.out.println("Cümle giriniz: ");
        String txt = input.nextLine();
        // Kullanıcıdan alınan cümlenin unluBuyukYap() metoduna gönderilmesi
        unluBuyukYap(txt);
    }

    // ünlü harfleri büyük harf ile değiştiren metot
    static void unluBuyukYap(String txt) {
        StringBuffer text = new StringBuffer(txt);
        for (int i = 0; i < text.length(); i++) {
            switch (text.charAt(i)) {
                case 'a':
                    text.setCharAt(i, 'A');
                    break;
                case 'e':
                    text.setCharAt(i, 'E');
                    break;
                case 'ı':
                    text.setCharAt(i, 'I');
                    break;
                case 'i':
                    text.setCharAt(i, 'I');
                    break;
                case 'o':
                    text.setCharAt(i, 'O');
                    break;
                case 'ö':
                    text.setCharAt(i, 'O');
                    break;
                case 'u':
                    text.setCharAt(i, 'U');
                    break;
                case 'ü':
                    text.setCharAt(i, 'U');
                    break;
                default:
                    break;
            }
        }
        // Yeni cümlenin ekranda gösterilmesi
        System.out.println("Yeni cümle: \n" + text);
    }
}
