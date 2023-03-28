import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ciąg znaków:");
        String text = scanner.next();
        char last = text.charAt(text.length()-1);
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i)==last) {
                count++;
            }
        }
        System.out.println("Znak "+last +" wystąpił " + count + " razy. ");
    }
}