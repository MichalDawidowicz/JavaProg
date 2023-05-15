import java.io.*;

public class Test {
    static int[] liczZnakiSlowa(File textfile)
            throws IOException
    {

        FileInputStream fileInputStream = new FileInputStream(textfile);
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String line;
        int wordCount = 0;
        int characterCount = 0;
        int whiteSpaceCount = 0;
        while ((line = bufferedReader.readLine()) != null) {

                characterCount += line.length();
                String[] words = line.split("\\s+");
                wordCount += words.length;
                whiteSpaceCount += wordCount - 1;
        }
        return new int[]{wordCount,whiteSpaceCount,characterCount};
    }

    public static void main(String[] args) throws IOException {
        File file = new File("z1tekst.txt");
        int []wynik= liczZnakiSlowa(file);
        System.out.println("Slowa = "+wynik[0]);
        System.out.println("Znaki biale = "+wynik[1]);
        System.out.println("Znaki = "+wynik[2]);
    }
}