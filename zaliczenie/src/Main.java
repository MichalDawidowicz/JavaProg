//Michal Dawidowicz Inforamtyka II, zadanie zaliczeniowe java
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        boolean flag = true;
        Scanner scan = new Scanner(System.in);
        int n1, n2, n3, n4;
        do {
            System.out.println("Podaj 1. cyfrę: ");
            n1 = scan.nextByte();
            System.out.println("Podaj 2. cyfrę: ");
            n2 = scan.nextByte();
            System.out.println("Podaj 3. cyfrę: ");
            n3 = scan.nextByte();
            System.out.println("Podaj 4. cyfrę: ");
            n4 = scan.nextByte();
            if (n1 < 10 & n2 < 10 & n3 < 10 & n4 < 10) {
                flag = false;
            } else {
                System.out.println("Błedne dane. Wprowadź ponownie");
            }
        } while (flag);
        int[] numbers = {n1, n2, n3, n4};
        Arrays.sort(numbers);
        //tworzenie godziny
        int hour1, hour2, minute1, minute2, pom;
        if (numbers[3] < 3) {
            hour1 = numbers[3];
            hour2 = numbers[2];
            minute1 = numbers[1];
            minute2 = numbers[0];
            System.out.println("Godzina " + hour1 + hour2 + ":" + minute1 + minute2);
        } else if (numbers[2] < 3) {
            hour1 = numbers[2];
            if (hour1 != 2) {
                hour2 = numbers[3];
                minute1 = numbers[1];
            } else {
                if (numbers[3] < 4) {
                    hour2 = numbers[3];
                    minute1 = numbers[1];
                } else {
                    hour2 = numbers[1];
                    minute1 = numbers[3];
                }
            }
            minute2 = numbers[0];
            if (minute1 > 5) {
                pom = minute1;
                minute1 = minute2;
                minute2 = pom;
                if (minute1 <= 5) {
                    System.out.println("Godzina " + hour1 + hour2 + ":" + minute1 + minute2);
                } else System.out.println("Nie da się utworzyć godziny");
            }else System.out.println("Godzina " + hour1 + hour2 + ":" + minute1 + minute2);
        } else if (numbers[1] < 3) {
            hour1 = numbers[1];
            if (hour1 != 2) {
                hour2 = numbers[3];
                minute1 = numbers[2];
                minute2 = numbers[0];
            } else {
                if (numbers[3] < 4) {
                    hour2 = numbers[3];
                    minute1 = numbers[2];
                    minute2 = numbers[0];
                } else if (numbers[2] < 4) {
                    hour2 = numbers[2];
                    minute1 = numbers[3];
                    minute2 = numbers[0];
                } else {
                    hour2 = numbers[0];
                    minute1 = numbers[3];
                    minute2 = numbers[2];
                }
            }
            if (minute1 > 5) {
                pom = minute1;
                minute1 = minute2;
                minute2 = pom;
                if (minute1 <= 5) {
                    System.out.println("Godzina " + hour1 + hour2 + ":" + minute1 + minute2);
                } else System.out.println("Nie da się utworzyć godziny");
            }else System.out.println("Godzina " + hour1 + hour2 + ":" + minute1 + minute2);
        } else if (numbers[0] < 3) {
            hour1 = numbers[0];
            if (hour1 != 2) {
                hour2 = numbers[3];
                minute1 = numbers[2];
                minute2 = numbers[1];
            } else {
                if (numbers[3] < 4) {
                    hour2 = numbers[3];
                    minute1 = numbers[2];
                    minute2 = numbers[1];
                } else if (numbers[2] < 4) {
                    hour2 = numbers[2];
                    minute1 = numbers[3];
                    minute2 = numbers[1];
                } else {
                    hour2 = numbers[1];
                    minute1 = numbers[3];
                    minute2 = numbers[2];
                }
            }
            if (minute1 > 5) {
                pom = minute1;
                minute1 = minute2;
                minute2 = pom;
                if (minute1 <= 5) {
                    System.out.println("Godzina " + hour1 + hour2 + ":" + minute1 + minute2);
                } else System.out.println("Nie da się utworzyć godziny");
            }else System.out.println("Godzina " + hour1 + hour2 + ":" + minute1 + minute2);
        } else
            System.out.println("Nie można utworzyć godziny");
    }
}




