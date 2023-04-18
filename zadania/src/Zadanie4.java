import java.util.Scanner;

public class Zadanie4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ciąg znaków:");
        String text = scanner.nextLine();
        int sum=0;
        for (int i = 0; i < text.length(); i++) {
            if(Character.isDigit(text.charAt(i)))
                sum=sum+Character.getNumericValue(text.charAt(i));
        }
        System.out.println("Suma cyfr z ciągu wynosi : "+sum);

    }
}
