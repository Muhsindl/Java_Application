import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan cümle al
        System.out.println("Cümle giriniz: ");
        String txt = input.nextLine();

        // Cümleyi kelimelere ayır
        String[] words = txt.split(" ");

        // En uzun kelimeyi bulmak için bir değişken belirledik
        String maxWord = "";
        
        // Kelimeler üzerinde döngü kurarak en uzun kelimeyi bul
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > maxWord.length()) {
                maxWord = words[i];  // Eğer şu anki kelime daha uzun ise, en uzun kelimeyi güncelle
            }
        }

        // Sonuç
        System.out.println("Cümledeki en uzun kelime: " + maxWord);
    }
}
