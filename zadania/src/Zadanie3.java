import java.util.Locale;
import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ciąg znaków:");
        String text = scanner.nextLine();
        String reversed="";
        for (int i = text.length(); i>0; i--){
            reversed=reversed + text.charAt(i-1);
        }
        String str1 = text.replaceAll("\\s", "").toLowerCase();
        String str2 = reversed.replaceAll("\\s", "").toLowerCase();
        if (str1.equals(str2)){
            System.out.println("Ciąg " +text +" jest palindromem");
        }
        else
            System.out.println("Ciąg " +text +" nie jest palindromem");
    }
}
