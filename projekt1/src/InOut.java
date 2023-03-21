import java.util.Scanner;
public class InOut {
    static public void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a,b,c;
        System.out.print("Podaj 1 liczbe:");
        a=scanner.nextInt();
        System.out.print("Podaj 2 liczbe:");
        b= scanner.nextInt();
        c=a+b;
        System.out.println("Suma = " + c);
    }
}
