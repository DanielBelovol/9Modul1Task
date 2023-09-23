package FileTask1;

import java.io.*;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.*;

public class FileReader extends InputStream {


    public String verifyNumbers() throws IOException {
        File file = new File("file.txt");
        FileInputStream fis = new FileInputStream(file);
        StringBuilder stringBuilder = new StringBuilder();
        Scanner scanner = new Scanner(fis);
        int lineNumber = 0;
        String line = "";

        Pattern pattern = Pattern.compile("^\\d{3}-\\d{3}-\\d{4}$");
        Pattern pattern1 = Pattern.compile("^\\(\\d{3}\\) \\d{3}-\\d{4}$");

        while (scanner.hasNextLine()) {
            line = scanner.nextLine();
            if(line.matches(String.valueOf(pattern))|| line.matches(String.valueOf(pattern1))){
                stringBuilder.append(line+"\n");
            }
        }
        return stringBuilder.toString();

    }


    @Override
    public int read() throws IOException {
        return 0;
    }
}
