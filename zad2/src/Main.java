import java.io.*;

public class Main {
    public static void szukaj (String nazwaPlikWe, String nazwaPlikWy,String slowo) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(nazwaPlikWe));
        String line;
        int num=1;
        FileWriter fileWriter = new FileWriter(nazwaPlikWy);
        PrintWriter printWriter = new PrintWriter(fileWriter);
            while ((line = br.readLine()) != null) {
                if(line.contains(slowo)) {
                    System.out.println(num +" : "+ line);
                    printWriter.println(num +" : "+ line);
                }
                num++;
            }
        printWriter.close();
        }

    public static void main(String[] args) throws IOException {
        szukaj("text.txt","wyj.txt","egzamin");
    }
    }