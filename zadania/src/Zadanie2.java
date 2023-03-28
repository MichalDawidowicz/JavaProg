import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ciąg znaków:");
        String text = scanner.next();
        String reversed="";
        for (int i = text.length(); i>0; i--){
           reversed=reversed + text.charAt(i-1);
        }
        System.out.println("Wynik= "+ reversed);
    }
}
